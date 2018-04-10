class Employee extends Person {
    //instance variables {no static keyword}: each object has own set of instance variables 
    private int ssn; 
    private char gender; 

    //Java doesn't support parameters with default values 
    //default constructor 
    public Employee()
    {
        super();
        System.out.println("\nInside employee default constructor");
        ssn = "123456789";
        gender = 'X';
    }

    //parameterized constuctor
    public Employee(String f, String l, int a, int s, char g)
    {
        super(f, l, a);
        System.out.println("\nInside employee constructor with parameters");
        
        ssn = s;
        gender = g;   
    }

    public int getSsn()
    {
        return ssn;
    }

    public void setSsn(int s)
    {
        //set instance variable to parameter value
        ssn = s;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char g)
    {
        //set instance variable to parameter value
        gender = g; 
    }

    public void print()
    {
        super.print();
        System.out.println("\n, SSN:" + ssn + ", Gender: " + gender);
    }

}