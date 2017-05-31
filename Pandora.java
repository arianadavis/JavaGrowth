/*************************************************************************
 * File Name: Pandora.java
 * 
 * Due Date:  Friday, March 31st , by 11:59pm
 * 
 * Author:  Ariana M. Davis
 * 
 * Program Description: Write a program that presents a menu to the Pandora listener. 
 * The program will ask the listener to enter their last name followed by a menu choice.
 * 
 * 
 * ***********************************************************************/
import java.util.Scanner; //needed to use Scanner for input

public class Pandora {
  public static void main(String[] args) {
   
        //Declare variables
        String lastName;
        String channel1, channel2, channel3, channel4, channel5 , channel6 , channel7, channel8, channel9, channel10;
        int result;
        
        //Create Scanner object 
        Scanner input = new Scanner (System.in); 
    
        //Display the Opening Statement which includes the Pandora Menu
         System.out.println("\n**********************************WELCOME TO PANDORA!********************************************");
         System.out.println("\n                                PANDORA MENU:                                                    ");
         System.out.println(" 1 - Create New Pandora Channel                                   "); 
         System.out.println(" 2 - Play Pandora Channel                                         ");
         System.out.println(" 3 - Exit Pandora                                                 ");
         System.out.println("\n*************************************************************************************************");
        
        
        //Prompt the user for their last name and menu choice option
         System.out.print("Please enter your last name followed by your Pandora Menu Choice: "); 
    
        //Read the user's lastname and read the user's menu choice; Parse string if necessary!
        lastName = input.next().toUpperCase();
        result = input.nextInt();
        input.nextLine();
        
        //Control statement (if()/else if() or switch()) that is based on the user's menu choice
        switch (result)
        
                //process the user's menu choice (options:  1, 2, 3, other)
        {
            case 1:
            System.out.println("\n You have selected the CREATE NEW PANDORA CHANNEL menu item!");
            System.out.print("\n Please enter the name of the new channel: ");
            
            String newChannel = input.nextLine();
            
            System.out.println("\n You have successfully created the following Pandora Channel: " + newChannel.toUpperCase() );
            break;
            
            case 2:
            System.out.println("\n You have selected the PLAY PANDORA CHANNEL menu item!");
            System.out.println("\n The user: " + lastName + "currently has created the following channels");
            
            System.out.println("1. Rihanna");
            System.out.println("2. Beyonce");
            System.out.println("3. 070 Shake");
            System.out.println("4. Jay - Z");
            System.out.println("5. Goldlink");
            System.out.println("6. MadeInTYO");
            System.out.println("7. Chance The Rapper");
            System.out.println("8. Soulection");
            System.out.println("9. Sango");
            System.out.println("10. Lakim");
            
            channel1 = "Rihanna";
            channel2 = "Beyonce";
            channel3 = "070 Shake";
            channel4 = "Jay - Z";
            channel5 = "Goldlink";
            channel6 = "MadeinTYO";
            channel7 = "Chance The Rapper";
            channel8 = "Soulection";
            channel9 = "Sango";
            channel10 = "Lakim";
            
            System.out.print("\n Which channel would you like to listen to? ( Enter 1, 2, 3, 4, 5): "); 
            
            int result2 = input.nextInt(); 
            
            switch (result2)
            
            {
                case 1:
                System.out.println("\n You are now listening to: " + channel1.toUpperCase () );
                break;
                
                case 2:
                System.out.println("\n You are now listening to: " + channel2.toUpperCase () );
                break;
                
                case 3:
                System.out.println("\n You are now listening to: " + channel3.toUpperCase () );
                break;
                
                case 4:
                System.out.println("\n You are now listening to: " + channel4.toUpperCase () );
                break;
                
                case 5:
                System.out.println("\n You are now listening to: " + channel5.toUpperCase () );
                break;
                
                case 6:
                System.out.println("\n You are now listening to: " + channel6.toUpperCase () );
                break;
                
                case 7:
                System.out.println("\n You are now listening to: " + channel7.toUpperCase () );
                break;
                
                case 8:
                System.out.println("\n You are now listening to: " + channel8.toUpperCase () );
                break;
                
                case 9:
                System.out.println("\n You are now listening to: " + channel9.toUpperCase () );
                break;
                
                case 10:
                System.out.println("\n You are now listening to: " + channel10.toUpperCase () );
                break;
                
            }
            break;
            
            case 3:
            System.out.println("\n You have selected the EXIT PANDORA menu item!");
            break;    
                
        }
  
        //Display Thank you message
        System.out.println( "\n" + lastName + "!" + " Thank you for being a valued listener!");

  }//end of main
}//end of class