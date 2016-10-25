import java.util.Scanner;
class EX01
{
  public static void main(String args[])
  {
     Scanner input = new Scanner(System.in);
     String firstName, lastName, birthDate, partialFirstName, partialLastName, partialbirthDate;
     System.out.println("What's you first name?");
     firstName = input.nextLine();
     System.out.println("What's you last name?");
     lastName = input.nextLine();
     System.out.println("What's you birth date?");
     birthDate = input.nextLine();
     partialFirstName = firstName.substring(0,3).toLowerCase();
     partialLastName = lastName.substring(lastName.length() - 3).toUpperCase();
     partialbirthDate = birthDate.substring(birthDate.length() - 2);
     System.out.println("Your password is:");
     System.out.println(partialFirstName + partialLastName + partialbirthDate);
  }
}
