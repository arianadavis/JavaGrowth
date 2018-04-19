import java.util.Scanner;
 
class SwapNumbers
{
   public static void main(String args[])
   {
      int x, y;
      System.out.println("Program swaps two integers. ");
      System.out.println("Note: Program checks for integers and non-numeric values. ");

      System.out.print("Please enter first number: "); 
      Scanner sc = new Scanner(System.in);
      while (!sc.hasNextInt())
      {
          System.out.println("Not valid integer!");
          sc.next();
          System.out.print("\nPlease try again. Enter first number: "); 
      }
      x = sc.nextInt();

      System.out.println();
      System.out.print("Please enter second number: "); 
      while (!sc.hasNextInt())
      {
          System.out.println("Not valid integer!");
          sc.next();
          System.out.print("\n Please try again. Enter second number: "); 
      }
      y = sc.nextInt();
 
      System.out.println();
      System.out.println("Before Swapping");
      System.out.println("num1 = " + x );
      System.out.println("num2 = " + y );

      System.out.println();
      System.out.println("After Swapping");
      System.out.println("num1 = " + y );
      System.out.println("num2 = " + x );

   }
}