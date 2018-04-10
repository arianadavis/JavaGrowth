import java.util.Scanner;

class PersonDemo
{
    public static void main(String[] args)
    {
        //initialize variables and create Scanner object
        String fn = "";
        String ln = ""; 
        int a = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n/////Below are default constructor values://///");
        Person v1 = new Person(); //create default object
        System.out.println("\nFname =" + v1.getFname());
        System.out.println("\nLname =" + v1.getLname());
        System.out.println("\nAge =" + v1.getAge());

        System.out.println("\n////Below are user-entered values:////");

        //get user input 
        System.out.print("\nFname: ");
        fn = sc.nextLine();

        System.out.print("\nLname: ");
        ln = sc.nextLine();

        System.out.print("\nAge: ");
        a = sc.nextLine();

        Person v2 = new Person(fn, ln, a);
        System.out.print("\nFname = " + v2.getFname());
        System.out.print("\nLname = " + v2.getLname());
        System.out.print("\nAge = " + v2.getAge());

        System.out.println("\n/////Below using setter methods to pass literal values, then print() method to display values://///");
        v2.setFname("Bob");
        v2.setLname("Wilson");
        v2.setAge(42);
        v2.print();

    }
}