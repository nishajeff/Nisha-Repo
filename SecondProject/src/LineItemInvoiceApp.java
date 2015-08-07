import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class LineItemInvoiceApp {	
		public static void main(String[] args) {
			ArrayList<Invoice> Info=new ArrayList<Invoice>();
			System.out.println("Welcome to Line Item Invoice App");
			Scanner sc=new Scanner(System.in);
			String choice="y";
			double taxable_total=0.0,untaxable_total=0.0,tax=0.0,grand_total=0.0;
			while (choice.equalsIgnoreCase("y")){
				System.out.println("Enter an item Code");
				String code=sc.next();
				System.out.println("Enter a quantity");
				int qty=sc.nextInt();	
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
				 System.out.println("item:"+in.getitemName()+"\nprice="+in.getPrice()+"\nTaxable:"+in.isTaxable()+"\n");  
				  }
			 System.out.println("Payment Information:");
			 System.out.println("Fixed Tax Rate=5%");
			 System.out.println("Taxable total: "+taxable_total+"\nUntaxable total: "+untaxable_total+"\nTax: "+tax+"\nGrand total: "+grand_total);
			 sc.close();
		}

	}

