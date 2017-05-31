/*************************************************************************
 * File Name: SeminoleBank_A.java
 * 
 * Due Date:  Friday, April 14th , by 11:59pm
 * 
 * Author:  Ariana M. Davis
 * 
 * Program Description: An application that involves a menu system limits the choices a user can make so 
 * that only valid options are processed. The simplest menu system displays a number of user choices and 
 * processes the one the user selects. If the user is expected to make only one choice and then quit, a 
 * selection structure can be used.
 * 
 * 
 * ***********************************************************************/
import java.util.Scanner; 

public class SeminoleBank_A {
  public static void main(String[] args) {
   
        //Declarations and Initializations of variables
        int user;
        int deposit; 
        int withdrawal; 
        double cBalance = 1000.00;
        double nBalance;
        String menuchoice;
        
        //Create Scanner object 
        Scanner input = new Scanner (System.in); 
    
        
        //Display welcome messages and Request and Read users’ account number
        System.out.println("\n*************************************************************************************************");
        System.out.println("\n                                Welcome to Seminole Bank!                                        ");
        System.out.println("\n*************************************************************************************************");
        
        System.out.print("\n Please enter your 5-digit Seminole Account Number: ");
        user = input.nextInt();
        System.out.println("\n Thank you!");
        
        //Display menu choices and Request and Read ther users' banking choice
        System.out.print(" \n Enter D for deposit , W for withdrawal , B for balance or X to exit the menu: ");
        menuchoice = input.next().toUpperCase();
        
  
        //Process menu until user enters X (Use a WHILE loop with an “if…else if” OR a “switch” statement!!!!)
        while ( !menuchoice.equals("X"))
        {
           switch (menuchoice)
            {
                case "B":
                System.out.println("\n Account Number: " + user + " has a current balance of: " + "$" +  cBalance );
                break;
                
                case "D":
                System.out.print("\n Enter the amount of the deposit: ");
                deposit = input.nextInt();
                cBalance = cBalance + deposit;
                break;
                
                case "W":
                System.out.print("\n Enter the amount of withdrawal: ");
                withdrawal = input.nextInt();
                cBalance = cBalance - withdrawal;
                break;
                
            }
          
            System.out.print(" \n Enter D for deposit , W for withdrawal , B for balance or X to exit the menu: ");
            menuchoice = input.next().toUpperCase();
            
        }
       
         //Display final message
        System.out.println( "\n Thank you for being a loyal Seminole Bank customer!");
        
  }//end of main
}//end of class