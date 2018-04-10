import java.util.Scanner;

class ProductDemo
{
    public static void main(String[] args)
    {
        //initialize variables and create Scanner object
        String cn = "";
        String dn = ""; 
        double p = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n/////Below are default constructor values://///");
        Product v1 = new Product(); //create default object
        System.out.println("\nCode = " + " " + v1.getCode());
        System.out.println("\nDescription =" + " " + v1.getDescription());
        System.out.println("\nPrice = $" + "  " + v1.getPrice());

        System.out.println("\n////Below are user-entered values:////");

        //get user input 
        System.out.print("\nCode: ");
        cn = sc.nextLine();

        System.out.print("\nDescription: ");
        dn = sc.nextLine();

        System.out.print("\nPrice: ");
        p = sc.nextDouble();

        Product v2 = new Product(cn, dn, p);
        System.out.print("\nCode = " + v2.getCode());
        System.out.print("\nDescription = " + v2.getDescription());
        System.out.print("\nPrice = " + v2.getPrice());

        System.out.println();
        System.out.println("\n/////Below using setter methods to pass literal values, then print() method to display values://///");

        v2.setCode("xyz789");
        v2.setDescription("Test Widget");
        v2.setPrice(89.99);
        v2.print();

    }
}