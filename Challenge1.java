/*************************************************************************
 * File Name: Challenge1.java
 * 
 * Due Date:  Thursday Mar 30th , by 11:59pm
 * 
 * Author:  Ariana M. Davis
 * 
 * 
 * ***********************************************************************/
import java.util.Scanner; 
public class Challenge1 {
  public static void main(String[] args) {
    
  //Declare variables
  String lastName="";
  String middleName="";
  String firstName="";
  char middleInitial; 
  int space;
  int space2=5;
  
  //Scanner object 
  Scanner keyboard = new Scanner (System.in); 
  
  //Prompt user for their full name 
  System.out.print("Please enter your full name: "); 
  
  //Reading full name from the keyboard 
  firstName = keyboard.next().toUpperCase();
  middleName = keyboard.next().toUpperCase();
  lastName = keyboard.next().toUpperCase();
  keyboard.nextLine();
  
  //Getting the middle initial 
  middleInitial = middleName.charAt(0);
  
  //Printing the output 
  System.out.println( firstName.toUpperCase () + "'s middle name is: " + middleInitial );

  }//end of main
}//end of class