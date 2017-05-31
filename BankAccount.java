/*************************************************************************
 * File Name: SeminoleBank_A.java
 * 
 * Due Date:  Friday, April 18th , by 11:59pm
 * 
 * Author:  Ariana M. Davis
 * 
 * Program Description: An application that involves a menu system limits the choices a user can make so 
 * that only valid options are processed. The simplest menu system displays a number of user choices and 
 * processes the one the user selects. If the user is expected to make only one choice and then quit, a 
 * selection structure can be used.
 * 
 * ***********************************************************************/
import java.util.Scanner;

public class BankAccount{
    

        //Main Function
        public static void main(String []args){
        
                //Declare and initialize a variable for balance to $5000.
                double cBalance = 5000.00;
                
                //Declare other variables as needed
                char menuchoice;

                 //Create Scanner object 
                 Scanner input = new Scanner (System.in); 
        
                //Display the welcome message -  (HINT:  This method does NOT require a value returned!)
                //Call the welecomeMessage() function
                welcomeMessage(); 

                //Prompt the user to enter the account number 
                //HINT:  The account number must be returned to main()!  In main(), dont forget to assign the call statement to a variable.
                //Call the accountInfo() function AND assign it to a variable
                int accountNum = accountInfo();
            
         
                //Process menu using a Do-While loop and Switch statement
                //This will Display the menu and Call the Function(s) based on the user's choice until the user enters X 

                do {
                        //Call the function to display the menu and prompt the user for their choice 
                        //HINT:  The displayMenu() function must return the choice back to main()!  In main(), dont forget to assign the call statement to a variable.
                        //Call the displayMenu() function AND assign it to a variable
                        menuchoice = displayMenu();
                        
                    
                        //Start the switch() statement to determine which function is called based on the users choice
                        //HINT:  Each case calls or invokes a function to perform some specific task

                        switch( menuchoice ){
                            
                                //Case (If the menu choice is D)
                                case 'D':
                                    //Call the depositFunds(balance) function AND assign it to a variable
                                cBalance = depositFunds(cBalance);
                                break;
                    
                    
                                //Case (If the menu choice is W)
                                 case 'W':
                                        //Call the withdrawFunds(balance) function AND assign it to a variable
                                 cBalance = withdrawFunds(cBalance);
                                 break;
                                         
                            
                                //Case (If the menu choice is B)
                                case 'B':
                                        //Call the checkBalance(account number, balance) function
                                checkBalance( accountNum , cBalance );
                                break;
                            
                                //Case (If the menu choice is X)
                                case 'X':
                                break;
                                    
                                //Default for user error handling
                                default: 
                                System.out.println("\n ERROR: Please enter a D,W,B or X: ");
                                break;
                                                
                                
                        }//end of switch     
             
                } while ( menuchoice != 'X' );  
        
            
            //Display final message
            System.out.println( "\n Thank you for being a loyal Seminole Bank customer!");
        
            
        }//end of main
        
             
        /**************************************************** FUNCTION DEFINITIONS *****************************************************/

         //Display welcome message 
         public static void welcomeMessage(){             

             System.out.println("\n*************************************************************************************************");
             System.out.println("\n                                Welcome to Seminole Bank!                                        ");
             System.out.println("\n*************************************************************************************************");
             
         }//end of welcomeMessage
         
         //Prompt and Read users account number.  RETURN the account number to main().
         public static int accountInfo (){
        
                
                //Don't forget to declare local Scanner object to read account number.
                Scanner input = new Scanner (System.in);
                
                System.out.print("\n Please enter your 5-digit Seminole Account Number: ");
                int accountNum = input.nextInt();
                System.out.println("\n Thank you!");
                
                return accountNum; 
             
         }//end of accountInfo
         
        
         //Display menu choices to the user and Read the users banking choice.  RETURN the users menu choice to main().
         public static char displayMenu (){
                
                //Don't forget to declare local Scanner object to read menu choice.
                Scanner input = new Scanner (System.in);
                
                System.out.print(" \n Enter D for deposit , W for withdrawal , B for balance or X to exit the menu: ");
                char menuchoice = Character.toUpperCase(input.next().charAt(0));
                input.nextLine();
                
                return menuchoice;
             
         }//end of displayMenu
         
         
         //Prompt the user for the amount to depost and Read deposit amount.  Update the balance and RETURN the balance to main().
         public static double depositFunds( double cBalance ){
          
                //Don't forget to declare local Scanner object to read deposit amount.
                 Scanner input = new Scanner (System.in);
                 
                System.out.print("\n Enter the amount of the deposit: ");
                double deposit = input.nextInt();
                cBalance = cBalance + deposit;
                 
                return cBalance;
                 
                          
         }//end of depositFunds
         
    
         //Prompt the user for the amount to withdraw and Read withdrawal amount.  Update the balance and RETURN the balance to main().
         public static double withdrawFunds (double cBalance){
             
                //Don't forget to declare local Scanner object to read withdrawal amount.
                 Scanner input = new Scanner (System.in);
             
             
                 System.out.print("\n Enter the amount of withdrawal: ");
                 double withdrawal = input.nextDouble();
                 cBalance = cBalance - withdrawal;
                 
                 return cBalance;
             
             
         }//end of withdrawFunds
     
         //Display the balance and DO NOT RETURN anything to main().
         public static void checkBalance( int accountNum , double cBalance){
        
        System.out.printf("\n Account Number: " +  accountNum + " has a current balance of: $%.2f \n" , cBalance );
               
         }//end of checkBalance
                  
        /**************************************************END OF FUNCTION DEFINITIONS **************************************************/
    
    
}//end of BankAccount Class
