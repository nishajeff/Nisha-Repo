

public class ProductDB {
	public static int count_java=0;
	public static int count_jsps=0;
	public static int count_jqry=0;
	public static int count_jcrp=0;
	public static int count_html=0;
	public static int count_cshrp=0;
	
	public static double java_total=0.0;
	public static double jsps_total=0.0;
	public static double jqry_total=0.0;
	public static double jcrp_total=0.0;
	public static double html_total=0.0;
	public static double cshrp_total=0.0;
	
	
	
	public static Product getProduct(String code,double price,int qty){		
    	Product p=new Product();
    	p.setCode(code);
    	p.setPrice(price);
    	if(code.equalsIgnoreCase("java")){
    		p.setDescription("Murach's Beginning Java");
    		count_java+=qty;    		
    		java_total+=price*qty;
    	}
    	else if(code.equalsIgnoreCase("jsps")){
    		p.setDescription("Murach's Java Servlets and JSP ");
    		count_jsps+=qty;    		
    		jsps_total+=price*qty;
    	}
    	
    	else if(code.equalsIgnoreCase("jqry")){
    		p.setDescription("Fundamentals of JQuery ");
    		count_jqry+=qty;    		
    		jqry_total+=price*qty;        		
    	}
    	else if(code.equalsIgnoreCase("jscrp")){
    		p.setDescription("Java Script Basics ");
    		count_jcrp+=qty;    		  
    		jcrp_total+=price*qty;
    	}
    	else if(code.equalsIgnoreCase("html")){
    		p.setDescription("Beginners Guide to HTML ");
    		count_html+=qty;    		
    		html_total+=price*qty;
    	}
    	else if(code.equalsIgnoreCase("cshrp")){
    		p.setDescription("Programmers Guide to CSharp ");
    		count_cshrp+=qty;    		
    		cshrp_total+=price*qty;        		
    	}
    	else{
    		p.setDescription("Unknown ");
    		
    		      		
    	}
    	return p;
    }
}
