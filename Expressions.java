/*************************************************************************
 * File Name: Expressions.java
 * 
 * Due Date:  Friday, March 3rd 
 * 
 * Author:  Ariana M. Davis
 * 
 * Program Description:  
 * 
 * Input:   Write a program called Expressions.java to display the output 
 * demonstrated , using the provided expressions 
 *        
 * Processing:  Based on assigned variables the equation will compute the result. 
 * Compute the result of the equation given above, assuming that x is 5 and n is 2. 
 * 
 * Output: Display the result in the console.  The output must match the output below. 
 * 
 * ***********************************************************************/

import java.util.*;

public class Expressions {
  public static void main(String[] args) {
    
    //Declare variables
    int x = 5; 
    int n = 2; 
    double Result;
    
    //Create Scanner Object
    Scanner input = new Scanner (System.in); 

    // Step #1:  Computes the math equation
    Result = Math.pow( 1 + x , n ) + ( n * x ) +  n * ( n - 1 ) * Math.pow ( x , 2 ) / 2; 


    // Step #2: Prints the results
    System.out.println(" The Result of the Expression is: " + Result );

  }//end of main method
  
}//end of Expressions class