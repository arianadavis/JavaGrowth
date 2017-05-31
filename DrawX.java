/******************************************************************************
 *  NAME:  Ariana M. Davis
 *  FSU ID:    amd14b
 ******************************************************************************/
import java.util.Scanner;
public class DrawX {
	public static void main(String[] args){ 
		
	/* Accepts the height of the 'X' from user, 
	 once prompted with the question*/
	Scanner input = new Scanner (System.in);
	System.out.print("Please enter the height of the X:");
	int user = input.nextInt();
	
	/* With the restriction having to be an odd number , if the user enters 
	 an even number , they will be asked to enter a new number until the value is an odd value */ 
	while ( user % 2 == 0) {
		System.out.println("Error! The height should be an odd number.");
		System.out.print("Please enter the height of the X: "); 
		user = input.nextInt();
	}
	
	/* Initialization of two int's that would be included in the for loop
	 to recognize the rows and columns that will be printed */
	int columns , rows; 
	
	/* Beginning of the for loop which retrieves the 
	 users numeric input and runs through the current 
	 for loop if applied printing out the proper amount " # " and spaces */
	for ( rows = 1; rows <= user; rows++ )
	{
		for (columns = 1; columns <= user; columns++)
		{
			if ( rows == columns || columns == (user - rows + 1))
			System.out.print("#") ;
			else 
			System.out.print(" ") ;
		}
		System.out.println("\n") ;
	}
 	
		  	
    }
}
