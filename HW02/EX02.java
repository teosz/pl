import java.util.Scanner;
class EX02
{
  public static void main(String args[])
  {
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     System.out.println("Sum: ");
     System.out.println(a+b);
     System.out.println("Arithmetic mean: ");
     System.out.println((double)(a+b)/2);
     System.out.println("Minimum: ");
     System.out.println(Math.max(a, b));
     System.out.println("Maximum: ");
     System.out.println(Math.min(a, b));

  }
}
