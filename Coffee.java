/******************************************************************************
 *  NAME:  Ariana M. Davis
 *  FSU ID:    amd14b
 ******************************************************************************/
import java.util.Scanner; 

public class Coffee {
	public static void main(String [] args) { 
		//The Problem 1
		Scanner input = new Scanner(System.in); // Allows the user to enter data
		double purchases; 
		double saleAmount;
		double newTotal;
		double Discount; 
		String cusName; 
		
		System.out.print("Please enter your name: ");
		cusName = input.nextLine();
		System.out.print("Please enter the current purchase amount:  $ ");
		saleAmount = input.nextDouble();
		System.out.print("Please enter the number of purchases in the last month: ");
		purchases = input.nextDouble(); 
		
		
		System.out.print("***********************");
		System.out.print("\n");
		System.out.println("Receipt for " + cusName );
		
		// Beigns if - else statement
		if (purchases <= 0 || saleAmount <= 5)
		{
			System.out.println("You get a 0% discount.");
			Discount = 0 * saleAmount; 
		}
			else if ( purchases >= 6 && purchases <= 10 )
		{
			System.out.println("You get a 10% discount.");
			Discount  = 0.1 * saleAmount; 
		}
			else if (purchases >= 6 && purchases <= 10)
		{
		    System.out.println("You get a 15% discount.");
		    Discount  = 0.15 * saleAmount; 
		}
			else if (purchases >= 11 && purchases <= 15)
		{
		    	System.out.println("You get a 20% discount.");
		    	Discount  = 0.2 * saleAmount; 
		}
			else if (purchases >= 16 && purchases <= 20)
		{
		    	System.out.println("You get a 25% discount.");
		    	Discount = 0.25 * saleAmount; 
		}
		    	else
		{
		    	System.out.println("You get a 30% discount.");
		    	Discount = 0.30 * saleAmount; 
		}
		
		newTotal = saleAmount - Discount; 

		//Prints out end resutls
		System.out.printf("Total amount due: %.2f" , newTotal );
		System.out.print("\n");
		System.out.printf("You saved $ %.2f" , Discount);
		System.out.print("\n");
		System.out.print("***********************");
											}
					}
			
	