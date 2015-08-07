import java.text.NumberFormat;


public class LineItem {
	private Product product;
	private int qty;
	private  double total;
	
	public LineItem(String code,int qty){
		product=ProductDB.getProduct(code);		
		this.qty=qty;
		total=product.getPrice()*qty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	public String getFormattedTotal()
    {
        NumberFormat currency = 
            NumberFormat.getCurrencyInstance();
        return currency.format(total);
    }
	public double calcTotalPrice(){		
		return product.getPrice()*qty;
	}
	public String toString(){
		return product.toString()+"\nquatity:     "+qty+"\nTotal:     "+this.getFormattedTotal()+"\n\n";
	}
	
}
