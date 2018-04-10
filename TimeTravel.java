import java.util.Scanner;

public class TimeTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char con = ' ';
        int count = 0;
        double miles = 0.0;
        double mph = 0.0;
        double hours = 0.0;
        double minutes = 0.0;

        do {
            count = 0;            
            
            System.out.println("Program calculates approximate travel time");

            while( count != 1 ) {
                System.out.print("\nPlease enter miles: ");

                while(!sc.hasNextDouble()) {
                    System.out.println("Invalid double, miles must be a number.");
                    System.out.print("\nPlease enter miles: ");
                    
                    sc.next();
                }

                miles = sc.nextDouble();

                if ( miles <= 0 || miles > 3000 ) {
                    System.out.println("Miles must be greater than 0, and no more than 3000.");
                } else {
                    count++;
                }
            }

            while( count != 2 ) {
                System.out.print("\nPlease enter MPH: ");

                while(!sc.hasNextDouble()) {
                    System.out.println("Invalid double, MPH must be a number.");
                    System.out.print("\nPlease enter MPH: ");
                    
                    sc.next();
                }

                mph = sc.nextDouble();

                if ( mph <= 0 || mph > 100 ) {
                    System.out.println("MPH must be greater than 0, and no more than 100.");
                } else {
                    count++;
                }
            }
    
            minutes = ((miles / mph) * 60) % 60;
            hours = (((miles / mph) * 60) - minutes) / 60;
    
            System.out.print("\nEstimated travel time: ");
            System.out.printf("%,.0f", hours);
            System.out.print(" hr(s) ");
            System.out.printf("%,.0f", minutes);
            System.out.print(" minutes\n\n");
            System.out.print("Continue? (y/n): ");

            con = sc.next().charAt(0);
        } while( con == 'y' || con == 'Y' );
    }
}