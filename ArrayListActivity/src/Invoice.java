import java.text.NumberFormat;
import java.util.ArrayList;
public class Invoice {

	private ArrayList<LineItem> list;
	
	public Invoice(){
		list=new ArrayList<LineItem>();
	}

	public ArrayList<LineItem> getList() {
		return list;
	}

	public void setList(ArrayList<LineItem> list) {
		this.list = list;
	}
	public void addToInvoice(LineItem i){
		list.add(i);
	}
	public double getInvoiceTotal(){
		double infTot=0.0;
		for(LineItem temp:list)
			infTot+=temp.getTotal();
		return infTot;
	}
	public String getFormattedTotal()
    {
        NumberFormat currency = 
            NumberFormat.getCurrencyInstance();
        return currency.format(this.getInvoiceTotal());
    }
	public String toString(){
		String out="";
		for(LineItem temp:list)
			out+= temp.toString();
		return out;
	}
}
