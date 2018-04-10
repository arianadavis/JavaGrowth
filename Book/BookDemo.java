import java.util.Scanner;

class BookDemo
{
    public static void main(String[] args)
    {
        //initialize variables and create Scanner object
        String cn = "";
        String dn = ""; 
        String au = "";
        double p = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n/////Below are *base class default constructor* values (instantiating p1, then using getter methods)://///");
        Product p1 = new Product(); //create default object
        System.out.print("\nCode = " + p1.getCode());
        System.out.print("\nDescription =" + p1.getDescription());
        System.out.print("\nPrice = $" + p1.getPrice());

        System.out.println();
        System.out.println("\n/////Below are *base class* user entered values (instantiating p2 then using getter methods)://///");
        System.out.println();

        //get user input 
        System.out.print("Code: ");
        cn = sc.nextLine();

        System.out.print("Description: ");
        dn = sc.nextLine();

        System.out.print("Price: ");
        p = sc.nextDouble();

        Product p2 = new Product(cn, dn, p);
        System.out.print("\nCode = " + p2.getCode());
        System.out.print("\nDescription = " + p2.getDescription());
        System.out.print("\nPrice = $" + p2.getPrice());

        System.out.println();
        System.out.println("\n/////Below using setter methods to pass literal values to p2, then print() method to display values://///");

        p2.setCode(" xyz789");
        p2.setDescription(" Test Widget");
        p2.setPrice(89.99);
        p2.print();

        System.out.println();        
        System.out.print("\n/////Below are derived class default constructor* values (instantiating b1 then using getter methods)://///");
        Book b1 = new Book(); //create default object
        System.out.print("\nCode = " + b1.getCode());
        System.out.print("\nDescription =" + b1.getDescription());
        System.out.print("\nPrice = " + b1.getPrice());
        System.out.print("\nAuthor = " + b1.getAuthor());
    
        System.out.println();
        System.out.println("\nor using overidden derived class print() method");
        b1.print();

        System.out.println();
        System.out.println("\n/////Below are derived class default constructor* values (instantiating b2 then using getter methods)://///");
        
        //get user input 
        System.out.print("\nCode: ");
        cn = sc.next();
        sc.nextLine();

        System.out.print("Description: ");
        dn = sc.nextLine();
        
        System.out.print("Price: ");
        p = sc.nextDouble();
        sc.nextLine();

        System.out.print("Author: ");
        au = sc.nextLine();

        Book b2 = new Book(cn, dn, p, au); //create default object
        System.out.print("\nCode = " + b2.getCode());
        System.out.print("\nDescription = " + b2.getDescription());
        System.out.print("\nPrice = $" + b2.getPrice());
        System.out.print("\nAuthor = " + b2.getAuthor());

        System.out.println();
        System.out.println("\nor using overidden derived class print() method");
        b2.print();
    }
}