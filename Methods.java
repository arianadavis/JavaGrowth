import java.util.Scanner; //imports all libraries
import java.util.Random; //import pseudo random generator library

public class Methods
{
   public static void displayProgram()
   
    {
     
      System.out.println("Program promps user to enter desired number of pseudorandom-generated integers (min 1).");
	  System.out.println("Use following loop structures: for, enhanced for, while, do...while.");
	  System.out.println("Note: Create *and* display the values *at least* one value-returning method, and one void method.\n");
  
    }

      public static int getArraySize()
      {
      	//declare variables and create Scanner object 
      	int arraySize = 0; 
      	Scanner input = new Scanner(System.in); 
      	System.out.print("Enter desired number of pseudo random-generated integers (min 1): ");
		
		while(!input.hasNextInt())
		{
			System.out.println("Please enter valid integer.");
		}
			arraySize = input.nextInt();
			return arraySize;
      }


  	  public static void displayArrays(int num)
  	  { 

  	  	  Random generator = new Random();  //declare pseudo randomizer

  	  	  int array[] = new int[num]; // declares array, dynamically allocates it to size 'input'

  	  	  System.out.println("\nfor loop:");  //for loop
		    for(int i = 0; i < num; i++)
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
		    
		    while(count < num)
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

		    while(counter < num);
  	  }
  	 
  	  public static void main(String args[])
  	  {
  	  		displayProgram(); 
  	  		int arrayNum = getArraySize(); 
  	  		displayArrays(arrayNum); 
  	  }

}
