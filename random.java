import java.util.Scanner; //imports all libraries
import java.util.Random; //import pseudo random generator library

public class random 
{
  public static void main(String[] args)
  
  {
    int user = 0;
    Scanner input = new Scanner(System.in); //allows user input
    Random generator = new Random();  //declare pseudo randomizer
    
    System.out.println("Program prompts user to enter desired number of pseudorandom-generated integers (min 1).");
    System.out.println("Use following loop structures: for, enhanced for, while, do ...while.\n");

    System.out.print("Enter desired number of pseudorandom-generated integers (min 1): ");
    user = input.nextInt();  //takes user input

    int array[] = new int[user]; // declares array, dynamically allocates it to size 'input'

    System.out.println("\nfor loop:");  //for loop
    for(int i = 0; i < user; i++)
    {
      array[i] = generator.nextInt();
      System.out.println(array[i]);
    }

    System.out.println("\nEnhanced for loop:");  //for loop
    for(int a:array)
    {
      System.out.println(generator.nextInt());
    }

    int count = 0;
    System.out.println("\nwhile loops"); //while loops
    
    while(count < user)
    {
      array[count] = generator.nextInt();
      System.out.println(array[count]);
      count++;
    }

    System.out.print("\n");

    int counter = 0;
    System.out.print("do while loop:\n"); //do while loop
    do
    {
      array[counter] = generator.nextInt();
      System.out.println(array[counter]);
      counter++;
    }

    while(counter < user);
  }
}