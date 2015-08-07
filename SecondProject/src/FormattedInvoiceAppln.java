
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class FormattedInvoiceAppln {	
		public static void main(String[] args) {
			ArrayList<Invoice> Info=new ArrayList<Invoice>();
			System.out.println("Welcome to Formatted Invoice App");
			Scanner sc=new Scanner(System.in);
			String choice="y";
			double taxable_total=0.0,untaxable_total=0.0,tax=0.0,grand_total=0.0;
			while (choice.equalsIgnoreCase("y")){
				System.out.println("Enter an item Code");
				String code=sc.next();	
				
				System.out.println("Enter a quantity");
				int qty=sc.nextInt();	
				while(!(qtyValidityCheck(qty))){
					System.out.println("Invalid Quantity");
					System.out.println("Enter a quantity");
					 qty=sc.nextInt();	
				}
				Invoice invoice=InvoiceDB.getInvoice(code);
				Info.add(invoice);
				if(invoice.isTaxable())	{				
					taxable_total+=invoice.getTotalPriceforItems(qty);
				    tax+=taxable_total*.05;
				}
				else
					untaxable_total+=invoice.getTotalPriceforItems(qty);				
				System.out.println("Do you wish to continue(Y/N)?");
				choice=sc.next();
				System.out.println();
			}
			grand_total=taxable_total+tax+untaxable_total;
			Iterator<Invoice> itr=Info.iterator();  
			System.out.println("RECEIPT:");			
			System.out.println("Items Purchaced:\n");
			 while(itr.hasNext()){  
				 Invoice in=(Invoice)itr.next();				
				 System.out.println("item:"+in.getitemName()+"\nprice="+getFormattedTotal(in.getPrice())+"\nTaxable:"+in.isTaxable()+"\n");  
				  }
			 System.out.println("Payment Information:");
			 double txrate = 0.05;
			 NumberFormat percent = NumberFormat.getPercentInstance();
			 String txrateString = percent.format(txrate);
			 System.out.println("Fixed Tax Rate="+txrateString);			
			 System.out.println("Taxable total: "+getFormattedTotal(taxable_total)+"\nUntaxable total: "+getFormattedTotal(untaxable_total)+"\nTax: "+getFormattedTotal(tax)+"\nGrand total: "+getFormattedTotal(grand_total));
			 sc.close();
		}
		
		public static String getFormattedTotal(double total){
			NumberFormat Formatted_total = NumberFormat.getCurrencyInstance();
			String FormattedTotal = Formatted_total.format(total);
			return FormattedTotal;
			
		}
		
		
		public static boolean qtyValidityCheck(int qty){
			if(qty>0 && qty<50)
				return true;
			else
				return false;
		}
	}
