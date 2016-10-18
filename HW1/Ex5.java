import java.util.Scanner;
public class Ex5
{
	public static void main(String[] args)
	{
		String name, day,month,year;
		Scanner input = new Scanner(System.in);
		System.out.print("Please write your name: ");
		name = input.nextLine();
		System.out.print("Day of birth: ");
		day = input.nextLine();
		System.out.print("Month: ");
		month = input.nextLine();
		System.out.print("Yeah: ");
		year = input.nextLine();
		System.out.println("Hello " + name + "! You were born in " + year + ".");
	}
}
