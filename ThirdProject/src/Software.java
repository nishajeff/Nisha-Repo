
public final class  Software extends Product {
    private String programmer;
    private String platform; //linux, mac, or pc
    private String os;
    
    public Software()
    {
    	super.setCode("");
    	super.setDescription("");
    	super.setPrice(0.0);
        programmer="";
        platform="";
        os="";
        count++;
    }

   
   
    public void setProgrammer(String programmer) {
		this.programmer = programmer;
	}



	public void setPlatform(String platform) {
		this.platform = platform;
	}



	public void setOs(String os) {
		this.os = os;
	}



	public String getProgrammer() {
		return programmer;
	}


	public String getPlatform() {
		return platform;
	}


	public String getOs() {
		return os;
	}	

	@Override
	public String toString(String pattern)
    {
    	if(pattern.equalsIgnoreCase("detail"))
    		return  this.getCode()+"\n"+this.getDescription()+"\n"+this.getPrice()+"\n"+this.getProgrammer()+"\n"+this.getOs()+"\n"+this.getPlatform();
    	else
    		return  this.getCode()+"\n"+this.getDescription()+"\n"+this.getPrice();
    		
    }
	@Override
	 public boolean equals(Object o) {
		if(this.programmer.equalsIgnoreCase(((Software)o).getProgrammer()))
			return true;
		else 
			return false;
	}
    
}

