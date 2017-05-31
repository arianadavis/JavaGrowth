/******************************************************************************
 *  NAME:  Ariana M. Davis
 *  FSU ID:    amd14b
 ******************************************************************************/
import java.util.Scanner;
public class Evaluator {
	
	public static int sum (int x, int y)
	//adds the two parameters together and returns the result
	{
		int sumResult = x + y;
		return sumResult; 
	}
	
	public static int minus (int x, int y)
	//subtracts the two parameters and returns the result
	{
		int minusResult = x - y;
		return minusResult; 
	}
	
	public static int multiply (int x, int y)
	//mutiplies the two parameters and returns the result
	{
		int multiplyResult = x * y;
		return multiplyResult;
	}
	
	public static int average (int x, int y)
	//divides the two parameters and returns the result
	{
		int averageResult = x / y;
		return averageResult;
	}
	
	public static int modulus (int x, int y)
	//divides the two parameters and retrieves thes remainder of that result
	{
		int modulusResult = x % y;
		return modulusResult;
	}
		
		
	public static void calculator () {
	// method created when called witihn the main method
	
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the expression: \n");
		int user = input.nextInt();
		int result = 0; 
		String method =""; 
		
		while ( !method.equals("."))
		{ 
			method = input.next();
			
			if(!method.equals("."))
				result=input.nextInt();
			
			if(method.equals("+"))
				user = sum (user , result); 
			
			else if(method.equals("-"))
				user = minus(user , result); 
			
			else if(method.equals("*"))
				user = multiply(user , result); 
			
			else if(method.equals("/"))
				user = average(user , result); 
			
			else if(method.equals("%"))
				user = modulus(user , result); 
			
			} 
		
		System.out.println("The result is " + user );
		
	}

	public static void wordCounter ( String user) {
	//method created where it reads in the user sentences and outputs the words counted
	
			int counter = 1; 
			
			for (int i = 0; i < user.length(); i++ )
    		{
    			if(user.charAt(i) ==' ' )
    				counter++; 
    		} 
  
    			System.out.print( "There are " + ( counter + 1 ) + " words in the sentence.\n");
		}
    		
   
	public static void main(String[] args){ 
	
	/* Accepts the input from the user, 
	 once prompted with the question*/
	 
	Scanner input = new Scanner (System.in);
	System.out.println("What do you want to do ( calculator(0)/word counter(1) )?");
	
	int newUser = input.nextInt();
	
	// Declarations of the two methods created
	if ( newUser == 0 ) { calculator(); }
		
	if ( newUser == 1 ) 
	
	{ 
		System.out.println("Please enter a sentence"); 
		input.next();
		String user = input.nextLine();
		wordCounter(user); 
	} 
		
			
		
											}
		  	
    			}
