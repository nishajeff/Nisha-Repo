
public final class Book extends Product {
    private String author;
    private int pages;
    
    public Book()
    {
    	super.setCode("");
    	super.setDescription("");
    	super.setPrice(0.0);
        count++;
    	author="";
    	pages=0;
       
    }
    
    public void setAuthor(String author) {
		this.author = author;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPages() {
		return pages;
	}

	

	public String getAuthor(){
    	return author;
    }
    

   @Override
    public String toString(String pattern)
    {
    	if(pattern.equalsIgnoreCase("detail"))
    	{
    		return this.getCode()+"\n"+this.getAuthor()+"\n "+this.getDescription()+" \n"+this.getPages()+"\n "+this.getPrice();
    	}
    	else
    		return  this.getCode()+"\n "+this.getDescription()+" \n"+this.getPrice();
    }
    
    @Override
    public boolean equals(Object o) {
    	if(this.author.equalsIgnoreCase(((Book)o).getAuthor())){
    		return true;
    	}
    	else
    		return false;
    	
    }

   
}

