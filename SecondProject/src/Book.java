
public class Book extends Product {

	private String author;

    public Book()
    {
    	super.setCode("");
    	super.setDescription("");
    	super.setPrice(0.0);
        count++;
    	author="";
       
    }
    
    public String getAuthor(){
    	return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

   
    public String toString(String pattern)
    {
    	if(pattern.equalsIgnoreCase("detail"))
    		return super.toString() + "Author:      " +            author + "\n";
    	else
    		return  super.toString();
    }


}
