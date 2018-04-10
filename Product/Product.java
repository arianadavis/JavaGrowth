class Product {
    //instance variables {no static keyword}: each object has own set of instance variables 
    private String code; 
    private String desscription; 
    private double price;

    //Java doesn't support parameters with default values 
    //default constructor 
    public Product()
    {
        System.out.println("\nInside product default constructor");
        code = "abc123";
        desscription = "My Widget";
        price = 49.99;
    }

    //parameterized constuctor
    public Product(String code, String desscription, double price)
    {
        System.out.println("\nInside product constructor with parameters");
        //must use this keyword when parameter names are same as field names 
        this.code = code;
        this.desscription = desscription; 
        this.price = price;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String cn)
    {
        //set instance variable to parameter value
        code = cn;
    }

    public String getDescription()
    {
        return desscription;
    }

    public void setDescription(String dn)
    {
        //set instance variable to parameter value
        desscription = dn;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double p)
    {
        //set instance variable to parameter value
        price = p;
    }

    public void print()
    {
        System.out.println("\nCode:" + code + ", Description: " + desscription + ", Price: $" + price);
    }

}