
public class Invoice {
	private String itemCode;
	private String itemName;
	private double price;
	private boolean taxable;
	
	public Invoice(){
		itemCode="";
		itemName="";
		price=0.0;
		taxable=false;		
	}
	public String getitemCode(){
		return itemCode;
		
	}
	public String getitemName(){
		return itemName;
		
	}
	public double getPrice(){
		return price;
		
	}
	public boolean isTaxable(){
		return taxable;
		
	}
	public void setitemCode(String itemCode){
		this.itemCode= itemCode;
		
	}
	public void setitemName(String itemName){
		this.itemName= itemName;
		
	}
	public void setPrice(double price){
		this.price=price;
		
	}
	public void setTaxable(boolean taxable){
		this.taxable=taxable;
		
	}
	public double getTotalPriceforItems(int qty){	   
	  
		   return price*qty;
	}

}
