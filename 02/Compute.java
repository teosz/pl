import java.util.Scanner;
public class Compute {
  public static void main(String args[])
  {
    ex5();
  }
  public static void ex5() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a 5 digit integer number:");
    int n = input.nextInt();
    int sum = 0;
    while(n!=0)
    {
      sum+=n%10;
      n/=10;
    }
    System.out.println("Sum of digits is:" + sum);
  }
  public static void ex4() {
    Scanner input = new Scanner(System.in);
    String name, age, location;
    System.out.println("What's your name?");
    name = input.nextLine();
    System.out.println("Who old you are?");
    age = input.nextLine();
    System.out.println("Where do you live?");
    location = input.nextLine();
    System.out.println(name +"is "+ age+" years old and lives on "+ location);
  }
  public static void ex3() {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    double b = input.nextDouble();
    input.nextLine();
    String c = input.nextLine();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
  public static void ex2() {
    double numeral = (1+1.0/2+7.0/4) * (1.0/2+1.0/3);
    double devider = Math.sqrt(5*5*5+7*7) * Math.sqrt(1.0/2+1.0/3);
    double value = (numeral/devider);
    System.out.println("double value is");
    System.out.println(value);
  }
  public static void ex1()
  {
    double numeral = (1.0/2+1.0/3/1.0/4+1.0/5) * (1.0/4+1.0/6);
    double devider = Math.sqrt(5+Math.pow(2,2)) * Math.sqrt(3) * 2.0;
    double value = (numeral/devider);
    System.out.println("double value is");
    System.out.println(value);
  }
}
