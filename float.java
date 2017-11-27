import java.util.Scanner;

public class float {

public static void main(String args[]) {

	float sum = 0; 
	float avg = 0;

	System.out.println("1) Program creates array size at run-time.");
	System.out.println("2) Program displays array size.");
	System.out.println("3) Program rounds sum and average of numbers to two decimal places.");
	System.out.println("4) Number *must* be float data type, not double.");

	Scanner input = new Scanner(System.in);

	System.out.print("Enter array size: ");
	int size = input.nextInt();

	System.out.print("\n");

	int arr[] = new int[size];

	System.out.print("\n");

	for(int i = 1; i<= size; i++)
	{
		System.out.print("Enter num" + i + ": ");
		float num = input.nextFloat();
		sum += num; 
		avg = sum/size; 
		
	}

		System.out.print("\n");

		System.out.printf("Sum: " + "%.2f",sum);
		System.out.print("\n");
		System.out.printf("Average: " + "%.2f",avg);
		System.out.print("\n");

	}


}