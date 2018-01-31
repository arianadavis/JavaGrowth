import java.util.Scanner;

public class Circle

{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        {
        
            double area, circum, diam;

            System.out.println("Non-OOP program calculates diameter, circumference, and circle area.");
            System.out.println("Must use Java's built-in PI constant, printf(), and formatted to 2 decimal places"); 

            System.out.print("Enter circle radius:   ");
            float radius = sc.nextFloat();
           
            area = 3.14*radius*radius;
            circum = 2*3.14*radius;
            diam = 2*radius;

            System.out.printf("\nCircle diameter = %.2f", +diam);
            System.out.printf("\nCircumference = %.2f", circum);
            System.out.printf("\nArea = %.2f", area);

            System.out.println("\n");
    
        }
    }
}