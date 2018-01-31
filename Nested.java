import java.util.Scanner;

public class Nested
{
    public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            double total = 0.0; 
            int count = 0; 
            double score = 0.0;
            double average = 0.0;

            System.out.println("Program counts, totals, and averages total number of user-entered exam acores.");
            System.out.println("Please enter exam scores between 0 and 100, inclusive."); 
            System.out.println("Enter out of range number to end program"); 
            
            while (score >= 0 && score <= 100) {
                System.out.print("Enter score:   ");
                
                while (!input.hasNextDouble())
                {
                    System.out.print("Not valid number!\n");
                    input.next(); 
                    System.out.print("Please try again. Enter score: ");
                }
                score = input.nextDouble(); 

            if (score >= 0 && score <= 100) {
                count = ++count; 
                total = total+ score;
            }
        } 

        average = total / count;

            System.out.println("Count: " + count);
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
    }
}

