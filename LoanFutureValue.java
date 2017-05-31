/*************************************************************************
 * File Name: LoanFutureValue.java
 * 
 * Due Date:  Friday, February 24, by 11:59pm
 * 
 * Author:  Ariana M. Davis
 * 
 * Program Description:   <ENTER DESCRIPTION>  
 * 
 * Input:   To write a program that reads in the investment amount, annual interest rate, 
 *          and number of years, and displays the accumlated future investment value
 *          
 * Processing:  The user is asked to enter their annual interest rate
 * 
 * Output:  The formula provided above requires the monthly interest rate. 
 *          Which will be used to display the future value. 
 * 
 * ***********************************************************************/

import java.util.*;

public class LoanFutureValue {
  public static void main(String[] args) {
    
    //Declare variables
    int numberOfYears;
    double investmentAmount , mainInterest , monthlyInterestRate , futureInvestmentValue;
    
    //Create Scanner Object
    Scanner input = new Scanner (System.in); 

    // Step #1:  Display program header which includes the title
    System.out.println("\n******************************************************************************");
    System.out.println("\n                      Accumulated Investment Value                            ");
    System.out.print("                                                                                  ");
    System.out.print("                                                                                  ");
    System.out.println("\n******************************************************************************");
      
    // Step #2:  Prompt the user to enter the investment amount
    System.out.print("Enter investment amount , for example 120000.95 " );
    
    // Step #3:  Read investment amount
    investmentAmount = input.nextDouble();

    // Step #4:  Prompt the user to enter the yearly interest rate
    System.out.print("Enter annual interest rate , for example 8.25 ");
    
    // Step #5:  Read yearly interest rate
    mainInterest = input.nextDouble();

    // Step #6:  Prompt the user to enter the number of years
    System.out.print("Enter number of years as an intger , for example 5: ");
   
    // Step #7:  Read number of years 
    numberOfYears = input.nextInt();

    // Step #8:  Calculate monthly interest rate
    monthlyInterestRate = mainInterest / 1200; 
      
    // Step #9:  Calculate the Future Value
    futureInvestmentValue = investmentAmount * Math.pow( 1 + monthlyInterestRate , numberOfYears * 12);

    // Step #10:  Display the future investment value
    System.out.println("\n******************************************************************************");
    System.out.println("\n                                                                              ");
    System.out.println("\n                                                                              ");
    System.out.printf("                       Future value is %.2f \n" , futureInvestmentValue          );
    System.out.println("\n******************************************************************************");

  }//end of main method
  
}//end of LoanFutureValue class