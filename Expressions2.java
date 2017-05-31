/*************************************************************************
 * File Name: Expressions2.java
 * 
 * Due Date:  Friday, March 3rd 
 * 
 * Author:  Ariana M. Davis
 * 
 * Program Description:  
 * 
 * Input:   Write a program called Expressions2.java to display the output 
 * demonstrated , using the provided expressions based on the users input
 *        
 * Processing:  Ask the user for TWO integers, which will represent the value for x and the value for n
 * Compute the final result using the users two values and the equation. 
 * 
 * Output: Display the result in the console. 
 * 
 * ***********************************************************************/

import java.util.*;

public class Expressions2 {
  public static void main(String[] args) {
    
    //Declare variables
    int x; 
    int n; 
    double Result;
    
    //Create Scanner Object
    Scanner input = new Scanner (System.in); 

    // Prompt the user to enter their values
    System.out.print("Please enter a value for x: ");
    x = input.nextInt(); 
    
    System.out.print("Please enter a value for n: ");
    n = input.nextInt(); 
    
    //Computes the math equation
    Result = Math.pow( 1 + x , n ) + ( n * x ) +  n * ( n - 1 ) * Math.pow ( x , 2 ) / 2; 

    // Step #2: Prints the results
    System.out.println(" The Result of the Expression is: " + Result );

  }//end of main method
  
}//end of Expressions class