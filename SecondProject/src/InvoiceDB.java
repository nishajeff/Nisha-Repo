
public class InvoiceDB {
	
	public static Invoice getInvoice(String code){
    	Invoice i=new Invoice();
    	i.setitemCode(code);
    	if(code.equalsIgnoreCase("brd")){
    		i.setitemName("Bread");
    		i.setPrice(1.0);
    		i.setTaxable(false);
    		        		
    	}
    	else if(code.equalsIgnoreCase("mlk")){
    		i.setitemName("Milk");
    		i.setPrice(3.0);
    		i.setTaxable(false);
    		      		
    	}
    	else if(code.equalsIgnoreCase("wtr")){
    		i.setitemName("Water");
    		i.setPrice(5.0);
    		i.setTaxable(false);   		
    	}
    	else if(code.equalsIgnoreCase("dvd")){
    		i.setitemName("DVD");
    		i.setPrice(20.0);
    		i.setTaxable(true);   		
    	}
    	else if(code.equalsIgnoreCase("ftv")){
    		i.setitemName("FlatScreenTV");
    		i.setPrice(500.0);
    		i.setTaxable(true);   		
    	}
    	else if(code.equalsIgnoreCase("pm")){
    		i.setitemName("PrescriptionMedicine");
    		i.setPrice(100.0);
    		i.setTaxable(false);   		
    	}
    	else{
    		i.setitemName("unknown");
    		i.setPrice(0.0);
    		i.setTaxable(false); 
    		      		
    	}
    	return i;
    }

}
