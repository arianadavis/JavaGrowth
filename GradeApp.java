import java.util.Scanner;
import java.text.DecimalFormat; 

public class GradeApp {
    public static void main(String[] args)
    {
        //display operational messages
        System.out.println("Please enter grades that range from 0 to 100");
        System.out.println("Grades average and total is rounded to 2 decimal places.");
        System.out.println("Note: Program does *not* check for non-numeric characters.");

        System.out.println("To end program enter -1.");
        System.out.println(); //print blank line

        //initialize variables and create Scanner object
        double gradeTotal = 0.0; 
        int gradeCount = 0; 
        double testGrade = 0.0; 
        
        Scanner sc = new Scanner(System.in);

        //get grades from user
        while (testGrade != -1)
        {
            //get user input
            System.out.print("Enter grade:");
            testGrade = sc.nextDouble();

            //accmulate grade count and grade total
            if (testGrade <= 100 && testGrade >= 0)
            {
                gradeCount = gradeCount + 1;
                gradeTotal = gradeTotal + testGrade;
            }
            else if (testGrade != -1)
            System.out.println("Invalid entry, not counted");
        }

            double averageGrade = 0;

            // display grade count, total and average 
            if (gradeCount == 0)
            {
                averageGrade = 0;
            }
            else
            {
                averageGrade = gradeTotal / gradeCount;
            }

            DecimalFormat f = new DecimalFormat("# #.00");
            
            String message = "\n" + 
            "Grade count:" + gradeCount + "\n" + 
            "Grade total:" + f.format(gradeTotal) + "\n"
            + "Average grade: " + f.format(averageGrade) + "\n";

            System.out.println(message);

    }
}