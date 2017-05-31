/******************************************************************************
 *  NAME:  Ariana M. Davis
 *  FSU ID:    amd14b
 ******************************************************************************/
public class InterestCalculator {
	public static void main(String [] args) { 
		//Task 1 Prompt
		int amount = 25000; 
		int months = 14; 
		double rate = 15; 
		double interest; 
		double total; 
		
		 interest = (amount * months * rate ) / 1200; // Interest Rate Formula 
		 total = amount + interest; // Total Amount Presented
		 
		 System.out.println(" :∼$ java InterestCalculator " ); // Prints Statement
		 System.out.printf("Interest = $%.0f \n" , interest); // Prints Interest Rate 
		 System.out.printf("Bob pays $%.0f \n", total ) ; // Prints Total Amount
		 System.out.println(" :∼$" ); 
	}	 		
}
