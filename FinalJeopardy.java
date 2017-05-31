/*************************************************************************
 * File Name: FinalJeopardy.java
 * 
 * Due Date:  Friday, March 24th , by 11:59pm
 * 
 * Author:  Ariana M. Davis
 * 
 * ***********************************************************************/
 
import java.util.Scanner;
 
public class FinalJeopardy {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int answer;
      
    //declare and initalize text responses to the player  
    String loose = "\n\t\tSORRY!  YOU LOSE!  THANKS FOR PLAYING FINAL JEOPARDY!\n\n";
    String win = "\n\t\tCONGRATULATIONS!  YOU WIN FINAL JEOPARDY!\n\n";
    String incorrectSelection = "\nYou've enter an invalid number!!  YOU LOSE!  Try again next time!\n\n";
      
    //Create (declare & initalize) questions for the game  
    String question1, question2, question3, question4, question5;
      
    question1 = "How do crickets hear?";
    question2 = "What\'s the best way to stop crying while peeling onions?";
    question3 = "Which animal sleeps for only five minutes a day?";        
    question4 = "What does ponophobia mean?";
    question5 = "What is the best music festival in 2017?";
     
    //Start the game 
    System.out.println("\n\n\t\t\tWelcome to Final Jeopardy!");
      
    System.out.println("\n\nRules:  You must answer the question correctly to win Final Jeopardy.  Good Luck! ");
    
    System.out.println("\n\n\nSelect one of the questions below to play Final Jeopardy: (enter 1-4)\n");
    System.out.printf("\t1. %s \n", question1);
    System.out.printf("\t2. %s \n", question2);  
    System.out.printf("\t3. %s \n", question3);
    System.out.printf("\t4. %s \n", question4);
    System.out.printf("\t5. %s \n", question5);
 
      
    //Prompt the user for their selection  
    System.out.print("\n\nWhich question would you like? "); 
    int selection = input.nextInt();
      
    
    //Validate user selection  
    if ( ( ( selection < 1) && (selection > 5) ) )  {
        
        System.out.println(incorrectSelection);

    }  else { 
     
            switch (selection) {
                case 1: System.out.println("\n\nYou\'ve selected:  \t" + question1);
                        System.out.println("\n\nSelect the correct answer for Question 1: (enter 1-4)");
                        System.out.println("\t 1.  What is through their wings?        3.  What is through their belly?");
                        System.out.println("\t 2.  What is through their knees?        4.  What is through their tongues?");
                        
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 1 || answer == 3 || answer == 4) {
                            
                            System.out.println(loose);
                            
                            
                        } else if (answer == 2) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else 
                            System.out.println(incorrectSelection);  
                
                case 2: System.out.println("\n\nYou\'ve selected:  \t" + question2);
                        System.out.println("\n\nSelect the correct answer for Question 2: (enter 1-4)");
                        System.out.println("\t 1.  What is licking almonds?        3.  What is eating cheese?");
                        System.out.println("\t 2.  What is sucking lemons?         4.  What is chewing gum?");
                        
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 1 || answer == 2 || answer == 3) {
                            
                            System.out.println(loose);
                            
                            
                        } else if (answer == 4) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else 
                            System.out.println(incorrectSelection); 
                
                case 3: System.out.println("\n\nYou\'ve selected:  \t" + question3);
                        System.out.println("\n\nSelect the correct answer for Question 3: (enter 1-4)");
                        System.out.println("\t 1.  What is a chameleon?        3.  What is a giraffe?");
                        System.out.println("\t 2.  What is a beaver?           4.  What is a koala?");
                        
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 1 || answer == 2 || answer == 4) {
                            
                            System.out.println(loose);
                            break;
                            
                        } else if (answer == 3) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else 
                            System.out.println(incorrectSelection); 
                
               case 4:  System.out.println("\n\nYou\'ve selected: \t" + question4);
                        System.out.println("\n\nSelect the correct answer for Question 4: (enter 1-4)");
                        System.out.println("\t 1.  What is fear of overworking?         3.  What is fear of oversleeping?");
                        System.out.println("\t 2.  What is fear of overthing?           4.  What is fear of overheating?");
                        
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 2 || answer == 3 || answer == 4) {
                            
                            System.out.println(loose);
                            break;
                            
                        } else if (answer == 1) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else 
                            System.out.println(incorrectSelection);
                            
                case 5: System.out.println("\n\nYou\'ve selected: \t" + question5);
                        System.out.println("\n\nSelect the correct answer for Question 4: (enter 1-4)");
                        System.out.println("\t 1.  SXSW                     3.  Rolling Loud");
                        System.out.println("\t 2.  Made In America          4.  Lollapalooza");
                        
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 2 || answer == 3 || answer == 4) {
                            
                            System.out.println(loose);
                            break;
                            
                        } else if (answer == 1) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else 
                            System.out.println(incorrectSelection);
            }//end of switch
    }//end of else
      
      
  }//end of main
}//end of class