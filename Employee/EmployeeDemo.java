import java.util.Scanner;

class EmployeeDemo
{
    public static void main(String[] args)
    {
        //initialize variables and create Scanner object
        String fn = "";
        String ln = ""; 
        int a = 0;
        int s = 987654321;
        char g = 'Y';
        Scanner sc = new Scanner(System.in);

        System.out.print("\n/////Below are base default constructor values://///");
        Person p1 = new Person(); //create default object
        System.out.println("\nFname = " + " " + p1.getFname());
        System.out.println("\nLname = " + " " + p1.getLname());
        System.out.println("\nAge = " + " " + p1.getAge());

        System.out.print("\n////Below are user-entered values:////");

        //get user input 
        System.out.print("\nCFname: ");
        fn = sc.nextLine();

        System.out.print("\nLname: ");
        ln = sc.nextLine();

        System.out.print("\nAge: ");
        a = sc.nextDouble();

        Person p2 = new Person(fn, ln, a);
        System.out.println("\nFname = " + " " + p2.getFname());
        System.out.println("\nLname = " + " " + p2.getLname());
        System.out.println("\nAge = " + " " + p2.getAge());

        System.out.println();
        System.out.println("\n/////Below using setter methods to pass literal values, then print() method to display values://///");

        p2.setFname("Bob");
        p2.setLname("Wilson");
        p2.setAge(42);
        p2.print();

        System.out.println();

        System.out.print("\n/////Below are derived class default constructor values://///");
        Employee e1 = new Employee(); //create default object
        System.out.println("\nFname = " + " " + e1.getFname());
        System.out.println("\nLname = " + " " + e1.getLname());
        System.out.println("\nAge = " + " " + e1.getAge());
        System.out.println("\nSSN = " + " " + e1.getSsn());
        System.out.println("\nGender = " + " " + e1.getGender());

        System.out.println("\nOr...");
        e1.print();

        System.out.print("\n/////Below are derived class user-entered values://///");
        //get user input
        System.out.print("\nFname: ");
        fn = sc.next();

        System.out.print("\nLname: ");
        ln = sc.next();

        System.out.print("\nAge: ");
        a = sc.next();

        System.out.print("\nSSN: ");
        s = sc.next();

        System.out.print("\nGender: ");
        g = sc.next().charAt(0);

        Employee e2 = new Employee(fn, ln, a, s, g); //create default object
        System.out.println("\nFname = " + " " + e2.getFname());
        System.out.println("\nLname = " + " " + e2.getLname());
        System.out.println("\nAge = " + " " + e2.getAge());
        System.out.println("\nSSN = " + " " + e2.getSsn());
        System.out.println("\nGender = " + " " + e2.getGender());

        System.out.println("\nOr...");
        e2.print();

    }
}