import java.util.Scanner;
 
class LargestOfThreeNumbers
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.print("Enter first number: ");
      Scanner sc = new Scanner(System.in);

       while (!sc.hasNextInt())
      {
          System.out.println("Not a valid integer!");
          sc.next();
          System.out.print("\nPlease try again. Enter first number: ");
      }
      x = sc.nextInt();

      System.out.println();
      System.out.print("Enter second number: ");

       while (!sc.hasNextInt())
      {
          System.out.println("Not a valid integer!");
          sc.next();
          System.out.print("\nPlease try again. Enter first number: ");
      }
      y = sc.nextInt();

      System.out.println();
      System.out.print("Enter third number: ");

       while (!sc.hasNextInt())
      {
          System.out.println("Not a valid integer!");
          sc.next();
          System.out.print("\nPlease try again. Enter first number: ");
      }
      z = sc.nextInt();
 
      System.out.println();
      if ( x > y && x > z )
         System.out.println("First number is largest.");
      else if ( y > x && y > z )
         System.out.println("Second number is largest.");
      else if ( z > x && z > y )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}