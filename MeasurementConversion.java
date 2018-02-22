import java.util.Scanner;

public class MeasurementConversion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {

            final double INCHES_TO_CENTIMETER = 2.54; 
            final double INCHES_TO_METER = 0.0254; 
            final double INCHES_TO_FOOT = 12; 
            final double INCHES_TO_YARD = 36; 
            final double FEET_TO_MILE = 5280; 

            System.out.println("Program converts inches to centimeters, meters, feet, yards and miles.");
            System.out.println("***Notes***:");
            System.out.println("1) Use integer for inches seconds (must validate integer input). ");
            System.out.println("2) Use printf() function to print (format values per below output). ");
            System.out.println("3) Create Java constants for the following values: ");
            System.out.println("\tINCHES_TO_CENTIMETER,");
            System.out.println("\tINCHES_TO_METER,");
            System.out.println("\tINCHES_TO_FOOT,");
            System.out.println("\tINCHES_TO_YARD,");
            System.out.println("\tFEET_TO_MILE");
            
            System.out.print("\nPlease enter number of inches:  ");
                
            while (!sc.hasNextInt())
            {
                    System.out.print("Not valid integer!\n");
                    sc.next(); 
                    System.out.print("\nPlease enter number of inches: ");
            }

                double inches = sc.nextDouble(); 
                System.out.println(inches + " " + "inch(es) equals" );

                double centi = inches * INCHES_TO_CENTIMETER; 
                System.out.printf("\n%,.6f centimeter(s)", centi); 

                double meters = inches * INCHES_TO_METER; 
                System.out.printf("\n%,.6f meter(s)", meters); 

                double feet = inches/INCHES_TO_FOOT; 
                System.out.printf("\n%,.6f feet", feet); 

                double yard = inches/INCHES_TO_YARD; 
                System.out.printf("\n%,.6f yard(s)", yard); 

                double miles = feet/FEET_TO_MILE; 
                System.out.printf("\n%,.8f mile(s)", miles); 

                System.out.println("");
            }
        } 
    }

