class Book extends Product {
    //instance variables {no static keyword}: each object has own set of instance variables 
    private String author; 

    //Java doesn't support parameters with default values 
    //default constructor 
    public Book()
    {
        super(); 
        System.out.println("\nInside book default constructor");
        author = "John Doe";
    }

    //parameterized constuctor
    public Book(String cn, String dn, double p, String au)
    {
        super(cn, dn, p);
        System.out.println("\nInside book constructor with parameters");
        //must use this keyword when parameter names are same as field names 
        author = au;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String au)
    {
        //set instance variable to parameter value
        author = au;
    }

    @Override
    public void print()
    {
        super.print();
        System.out.print(", Author:" + author);
    }

}