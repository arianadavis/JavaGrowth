import java.util.Scanner;

public class Multiple

{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        {

            System.out.println("");
            System.out.println("Must use Java's built-in PI constant, printf(), and formatted to 2 decimal places"); 
        
            System.out.print("Num1:   ");
            while (!sc.hasNextInt())
            {
                System.out.println("Integers Only");
                sc.next();
                System.out.print("\nNum1: "); 
            }

            int num1 = sc.nextInt();

            System.out.println("\n");
    
        }
    }

}
