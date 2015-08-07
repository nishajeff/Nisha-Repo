
public class Software extends Product {
	 private String version;

	    public Software()
	    {
	    	super.setCode("");
	    	super.setDescription("");
	    	super.setPrice(0.0);
	        version="";
	        count++;
	    }

	    public String getVersion()
	    {
	        return version;
	    }
	    public void setVersion(String version){
	    	this.version=version;
	    }

	   
	    public String toString(String pattern)
	    {
	    	if(pattern.equalsIgnoreCase("detail"))
	    		return super.toString() + "Version:     " +	            version + "\n";
	    	else 
	    		return super.toString();
	    }


}
