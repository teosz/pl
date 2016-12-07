import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Bank b = new Bank();
    Bank b1 = new Bank();
    b.addLoan(new Loan(10, new Client("Vasile", "Ion", 123442)));
    b.addLoan(new Loan(20, new Client("Vasile", "Ion", 123442)));
    b.addLoan(new Loan(50, new Client("Georgiana", "Alexa", 123433)));
    b1.addLoan(new Loan(50, new Client("Ionica", "Ionel", 123433)));
    b.displayContents();
    Loan result1[] = b.find("Vasile");
    for(Loan l: result1) System.out.print(l.getId());
    Loan result2[] = b.find("Vasile", 15);
    System.out.println();
    for(Loan l: result2) System.out.print(l.getId());
    System.out.println();
    Loan result3[] = b.find(5, 25);
    for(Loan l: result3) System.out.print(l.getId());
    System.out.println();
    b.removeLoan(5, 25);
    b.displayContents();
    b.transfer(new int[]{4}, b1);
    System.out.println();
    b.displayContents();
  }

}

class Bank {
  private List<Loan> loans = new ArrayList<Loan>();
  public Bank(Loan[] loans) {
    this.loans = new ArrayList<Loan>(Arrays.asList(loans));
  }
  public Bank() {
  }
  public void addLoan(Loan loan) {
    loans.add(loan);
  }
  public boolean removeLoan(int id) {
    return loans.removeAll(loans.stream().filter((x) -> x.getId() == id).collect(Collectors.toList()));
  }
  public boolean removeLoan(String name) {
    return loans.removeAll(loans.stream().filter((x) -> x.getClient().getName() == name).collect(Collectors.toList()));

  }
  public boolean removeLoan(long minAmount, long maxAmount) {
    return loans.removeAll(loans.stream().filter((x) -> minAmount <= x.getAmount() && x.getAmount() <= maxAmount).collect(Collectors.toList()));
  }
  public Loan[] find(String name) {
    return loans.stream().filter((x) -> x.getClient().getName() == name).toArray(Loan[]::new);
  }
  public Loan[] find(String name, long minAmount) {
    return loans.stream().filter((x) -> x.getClient().getName() == name && minAmount <= x.getAmount()).toArray(Loan[]::new);
  }
  public Loan[] find(long minAmount, long maxAmount) {
    return loans.stream().filter((x) -> minAmount <= x.getAmount() && x.getAmount() <= maxAmount).toArray(Loan[]::new);
  }
  public void displayContents() {
    for (Loan loan : loans) {
			System.out.println(loan.getId() + " " + loan.getAmount() + " " + loan.getClient().getName());
		}
  }
  private List<Loan> commonLoans(int[] ids, Bank bother) {
    return bother.getLoans().stream().filter((x) -> IntStream.of(ids).anyMatch(y -> y == x.getId())).collect(Collectors.toList());
  }
  public boolean transfer(int[] ids, Bank bother) {
    List<Loan> commonLoans = commonLoans(ids, bother);
    boolean delete = bother.getLoans(loans).removeAll(commonLoans);
    boolean add = loans.addAll(commonLoans);
    return add && delete;
  }
  public List<Loan> getLoans() {
    return loans;
  }
}
class Loan {
  private int id;
  private long amount;
  private Client client;
  public Loan(long amount, Client client) {
    this.id = IDMangement.getUniqueId();
    this.amount = amount;
    this.client = client;
  }
  public int getId() {
    return this.id;
  }
  public Client getClient() {
    return this.client;
  }
  public long getAmount() {
    return this.amount;
  }
}
class Client {
  private String name;
  private String surname;
  private long CNP;
  public Client(String name, String surname, long CNP) {
    this.name = name;
    this.surname = surname;
    this.CNP = CNP;
  }
  public String getName() {
    return this.name;
  }

}
class IDMangement {
  private static int noID = 1;
  public static int getUniqueId() {
    return IDMangement.noID++;
  }
}
