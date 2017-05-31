/******************************************************************************
 *  NAME:  Ariana M. Davis
 *  FSU ID:    amd14b
 ******************************************************************************/
import java.util.Scanner;
abstract class Shape 
{ // Declaring the Shape Class 
     
     private String color; // One Attribute declaration
     
     public Shape() // deafult constructor
     {
         color="red";
     }
     
     public Shape (String c1) // parametrized constructor
     {
         color = c1; 
     }
     
     public String getColor() // accessor method 
     {
         return color; 
     }
     
     public void setColor(String sColor) // mutator method
     {
         color = sColor;
     }
     
     public void print() // print method
     {
        System.out.println("Color: " + color); 

     }
     
   
     public abstract double area(); // area method
    
 }
 
 //Square class inherit from the Shape class
class Square extends Shape 
{
  
   public double sideLength; // One attribute declaration 
   
   public Square(String c1) // default constructor
   {
      super(c1);
      sideLength = 1;
   }
  
   public Square( String c1 , double sL1 ) // parametrized constructor
   {
     super(c1);
     sideLength = sL1; 
   }
   
   public double getSqLength() // accessor method
   {
     return sideLength;
   }
   
   public void setSqLength ( double sLength ) // mutator method
   {
      sideLength = sLength;
   }
   
   @Override // first declaration of the override function
   public double area() // print method
   {
      return ( sideLength * sideLength );
   }
   
   @Override
   public void print() // print method
   {
      super.print();
      System.out.println("Side Length: " + sideLength); 
      System.out.println("Area: " + area() ); 
      System.out.println("\n");
   }
  
  
 }
 
 // Rectangle class inherit from the Shape class
class Rectangle extends Shape 
{
  
   public double recLength; // First attribute declaration 
   public double recWidth; // Second attribute declaration 
   
   public Rectangle(String c1) // default constructor
   {
      super(c1);
      recLength = 1; 
      recWidth = 1;
   }
  
   public Rectangle( String c1, double rL1 , double rW1 ) // parametrized constructor
   {
     super(c1);
     recLength = rL1;
     recWidth = rW1;
   }
   
   public double getRecLength() // accessor method
   {
     return recLength;
   }
   
    public double getRecWidth() // accessor method
   {
     return recWidth;
   }
   
   public void setRecLength( double rLength ) // mutator method
   {
      recLength = rLength;
   }
   
   public void setRecWidth ( double rWidth ) // mutator method
   {
      recWidth = rWidth;
   }
  
   @Override
   public double area() // print method
   {
      return ( recLength * recWidth );
   }
   
   @Override
   public void print() // print method
   {
      super.print();
      System.out.println("Length: " + recLength); 
      System.out.println("Width: " + recWidth); 
      System.out.println("Area: " + area() );
      System.out.println("\n");
   }
  
  
 }
 
 // Circle class inherit from the Shape class
class Circle extends Shape 
{
  
   public double radius; // First attribute declaration 
   
   public Circle (String c1) // default constructor
   {
      super(c1);
      radius = 1; 
   }
  
   public Circle( String c1 , double rad ) // parametrized constructor
   {
     super(c1);
     radius = rad;
   }
   
   public double getRadius() // accessor method
   {
     return radius;
   }
   
   public void setRadius ( double circleRad ) // mutator method
   {
      radius = circleRad;
   }
  
  @Override
   public double area() // print method
   {
      return ( radius * radius * 3.14 );
   }
   
   @Override
   public void print() // print method
   {
      super.print();
      System.out.println("Radius: " + radius); 
      System.out.println("Area: " + area() );
       System.out.println("\n");
   }
   
} 
  
class TestShapes //main method declaration
{
   public static void main(String[] args)
   {
      int N; 
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of shapes: "); 
      N = input.nextInt();
      
      //declares the array of the base class objects. 
      Shape [] sArray = new Shape [N];
      for(int i=0;i<N;i++)
      {
         //ask the user what kind of shape they want to create: 
         System.out.print("Enter the choice (Square, Rectangle or Circle): ");
         int choice = input.nextInt();
         if (choice == 1 )
         {
            //user wanted a square
            System.out.print("Enter the color: ");
            String c = input.next();
            System.out.print("Enter the side length of the square:");
            double sl = input.nextDouble();
            
            //dynamically creates the Square object
            sArray[i] = new Square(c,sl);
         }
         else if (choice == 2)
         {
            //user wanted a rectangle
            System.out.print("Enter the color: ");
            String c = input.next();
            System.out.print("Enter length of the rectangle:");
            double l = input.nextDouble();
            System.out.print("Enter width of the rectangle:");
            double w = input.nextDouble();
            
            //dynamically creates the Square object
            sArray[i] = new Rectangle(c,l,w);
         }
         else if (choice == 3)
         {
            //user wanted a circle
            System.out.print("Enter the color: ");
            String c = input.next();
            System.out.print("Enter the radius of the circle:");
            double r = input.nextDouble();
            
            //dynamically creates the Square object
            sArray[i] = new Circle(c,r);
         }
         else
			{
				System.out.println("Wrong choice entered.");
				i--;
		   }
      }
		   //print the results
         for(int i=0;i<N;i++)
		   {
   			sArray[i].print();
		   }
   }
      
}
   