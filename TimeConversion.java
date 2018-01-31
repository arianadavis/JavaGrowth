import java.util.Scanner;

public class TimeConversion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {

            int SECS_IN_MINS = 60; 
            int MINS_IN_HR = 60; 
            int HRS_IN_DAY = 24; 
            int DAYS_IN_WEEKS = 7; 
            int DAYS_IN_YR = 365; 

            System.out.println("Program converts seconds to minutes, hours, days, weeks, and (regular) years -- 365 days.");
            System.out.println("***Notes***:");
            System.out.println("1) Use integer for seconds (must validate integer input). ");
            System.out.println("2) Use printf() function to print (format values per below output). ");
            System.out.println("3) Create Java constants for the following values: ");
            System.out.println("\tSECS_IN_MINS,");
            System.out.println("\tMINS_IN_HR,");
            System.out.println("\tHRS_IN_DAY,");
            System.out.println("\tDAYS_IN_WEEKS,");
            System.out.println("\tDAYS_IN_YR (365 Days)");
            
            while (SECS_IN_MINS >= 0 && SECS_IN_MINS <= 60) {
                System.out.print("\nPlease enter number of seconds:   ");
                
                while (!sc.hasNextInt())
                {
                    System.out.print("Not valid integer!\n");
                    sc.next(); 
                    System.out.print("\nPlease enter number of seconds: ");
                }

                int user = sc.nextInt(); 
                System.out.println(user + " " + "second(s) equals" );

                double minutes = user/SECS_IN_MINS; 
                System.out.printf("\n%,.2f minute(s)", minutes); 

                double hours = minutes/MINS_IN_HR; 
                System.out.printf("\n%,.3f hour(s)", hours); 

                double days = hours/HRS_IN_DAY; 
                System.out.printf("\n%,.4f day(s)", days); 

                double weeks = days/DAYS_IN_WEEKS; 
                System.out.printf("\n%,.5f week(s)", weeks); 

                double years = days/DAYS_IN_YR; 
                System.out.printf("\n%,.6f year(s)", years); 

                System.out.println("");
            }
        } 
    }
}

