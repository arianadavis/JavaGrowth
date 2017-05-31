/*************************************************************************
 * File Name: InvoiceApp.java
 * 
 * Due Date:  Friday, March 10th , by 11:59pm
 * 
 * Author:  Ariana M. Davis
 * 
 * Program Description:  The Invoice Total Calculator begins by displaying 
 * a welcome message to the console. Then, the application prompts and reads 
 * the customer type entered by the customer. 
 * 
 * Input:  Customer type 1 representsthe Silver account, 2 represents Gold 
 * account, and 3 represents Platinum account. All other users have a general 
 * account. 
 *          
 * Processing:  The application will then prompt and read the subtotal value
 * entered by the customer. 
 * 
 * Output:  The application calculates the discountRate percent, discountRate
 * amount, and the total. Finally, it will display a thank you message and exits.
 * 
 * ***********************************************************************/
 
import java.util.Scanner;
 
public class InvoiceApp
{
    public static void main(String[] args)
    {
       
    //Declare variables and Scanner object
    Scanner input = new Scanner ( System.in );
    int user;
    double subtotal , Invoice, discountAmount;
    double discountRate = 0.0; 

        
    //Display a welcome message
    System.out.println("\n******************************************************************************");
    System.out.println("\n                      Welcome to the Inovice Total Calculator                 ");
    System.out.println("\n******************************************************************************");
 
    //Prompt user for customer type
    System.out.print("Please enter the customer type ( Enter 1 for Silver , 2 for Gold , or 3 for Platinum): ");   
 
    //Read customer type
    user = input.nextInt(); 
           
    //Prompt user for subtotal   
    System.out.print("Please enter the subtotal: ");   

        
    //Read subtotal
     subtotal = input.nextDouble(); 

System.out.println("\n******************************************************************************");
        
    //Calculate discount Rate
    if ( user == 1 ) { 
        if ( subtotal >= 500 ) 
            discountRate = 0.20; 
        
        
        else if ( subtotal < 500 && subtotal >= 250) 
             discountRate = 0.15; 
    
        
        
        else if ( subtotal < 250 && subtotal >= 100) 
             discountRate = 0.10; 
        
        
        else 
             discountRate = 0; 
    
    } 
                    
                
    else if ( user == 2 ) 
            discountRate = 0.20; 
    
                        
    else if ( user == 3 ) {
        
        if ( subtotal >= 500 ) 
            discountRate = 0.50; 
                                
        else if ( subtotal < 500 )  
             discountRate = 0.40; 
                                    
                            }
    
    else 
            discountRate = 0.05; 
                       
        
    //Calculate discountRate Total 
    discountAmount = subtotal * discountRate; 

    //Calculate Invoice Total
    Invoice = subtotal - discountAmount; 

    //Format and display the results
    System.out.println("\n                      INVOICE REPORT                                          ");
    System.out.printf("\n                Subtotal: %.2f " ,  subtotal                                    );
    System.out.print("\n                Customer type: " +  user                                        );
    System.out.printf("\n                Discount percent: %.2f " , discountRate                         );
    System.out.printf("\n                Discount amount: %.2f " ,  discountAmount                       );
    System.out.printf("\n                Total: %.2f " ,  Invoice                                        );
    System.out.println(" ");
    
    //Display thank you message
    System.out.println("\n                        Thank You ! ! ");   

       
    }//end of main
}//end of class