import java.text.NumberFormat;

public abstract class Product
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                                      // static variable

    public Product(){}        
    
    public abstract String toString(String pattern);   
    public abstract boolean equals(Object o) ;
    
    public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	private String getFormattedPrice() {
		NumberFormat currency = 
	            NumberFormat.getCurrencyInstance();
	        return currency.format(price);
		
		
	}
	// create public access for the count variable
    public static int getCount()   
    {                              
        return count;
    }
    //create public access for getting class name
    public void getClassName(){
    	System.out.println(this.getClass().getName());
    }
    
    
}

