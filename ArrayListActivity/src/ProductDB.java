
public class ProductDB {
	public static Product getProduct(String code){
    	Product p=new Product();
    	p.setCode(code);
    	if(code.equalsIgnoreCase("java")){
    		p.setDescription("Murach's Beginning Java");
    		p.setPrice(49.50);
    		        		
    	}
    	else if(code.equalsIgnoreCase("jsps")){
    		p.setDescription("Murach's Java Servlets and JSP ");
    		p.setPrice(49.50);
    		        		
    	}
    	
    	else if(code.equalsIgnoreCase("jqry")){
    		p.setDescription("Fundamentals of JQuery ");
    		p.setPrice(39.50);
    		        		
    	}
    	else if(code.equalsIgnoreCase("jscrp")){
    		p.setDescription("Java Script Basics ");
    		p.setPrice(39.50);
    		        		
    	}
    	else if(code.equalsIgnoreCase("html")){
    		p.setDescription("Beginners Guide to HTML ");
    		p.setPrice(49.50);
    		        		
    	}
    	else if(code.equalsIgnoreCase("cshrp")){
    		p.setDescription("Programmers Guide to CSharp ");
    		p.setPrice(49.50);
    		        		
    	}
    	else{
    		p.setDescription("Unknown ");
    		p.setPrice(0.0);
    		      		
    	}
    	return p;
    }
}
