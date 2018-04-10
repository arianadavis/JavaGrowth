class Person {
    //instance variables {no static keyword}: each object has own set of instance variables 
    private String fname; 
    private String lname; 
    private int age;

    //Java doesn't support parameters with default values 
    //default constructor 
    public Person ()
    {
        System.out.println("\nInside person default constructor");
        fname = "John";
        lname = "Doe";
        age = 21;
    }

    //parameterized constuctor
    public Person(String fname, String lname, int age)
    {
        System.out.println("\nInside person constructor with parameters");
        //must use this keyword when parameter names are same as field names 
        this.fname = fname;
        this.lname = lname; 
        this.age = age;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fn)
    {
        //set instance variable to parameter value
        fname = fn;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String fn)
    {
        //set instance variable to parameter value
        lname = ln;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        //set instance variable to parameter value
        age = a;
    }

    public void print()
    {
        System.out.println("\nFname:" + fname + ", Lname: " + lname + ", Age: " + age);
    }

}