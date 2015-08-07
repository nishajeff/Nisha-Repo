
import java.text.NumberFormat;
import java.util.Scanner;


public class InvoiceApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Invoice Application");
		Scanner sc=new Scanner(System.in);
		String choice="y";
		Invoice invoice=new Invoice();
		while (choice.equalsIgnoreCase("y")){
			System.out.println("Enter an item Code");
			String code=sc.nextLine();	
			while(!(Validator.ValidateCode(code))){
				System.out.println("Invalid Code");
				System.out.println("Enter a code");				
				 code=sc.nextLine();				 
			}
			
			System.out.println("Enter a quantity");			
			String quantity=sc.nextLine();			
			while(!(Validator.ValidateQty(quantity))){
				System.out.println("Invalid Quantity");
				System.out.println("Enter a quantity");				
				quantity=sc.nextLine();
				 
			}
			int qty=Integer.parseInt(quantity);
			System.out.println("Enter a price");			
			String pr =sc.nextLine();			
			while(!(Validator.ValidatePrice(pr))){
				System.out.println("Invalid Price");
				System.out.println("Enter a Price");
				 pr=sc.nextLine();	
				 
			}
			double price=Double.parseDouble(pr);
			invoice.addToInvoice(new LineItem(code,qty,price));
			System.out.println("Do you wish to continue(Y/N)?");
			choice=sc.nextLine();
			System.out.println();			
		}
		 
		
		System.out.printf("%-10s%-35s","Code","Description");		
		System.out.print("\tPrice\t\tQty\tTotal");
		System.out.println();
		System.out.printf("%-10s%-35s","----","-----------");
		System.out.print("\t-----\t\t---\t-----");
		System.out.println();
		System.out.println(invoice);
		System.out.println("Invoice Total: "+invoice.getFormattedTotal());
		System.out.println();
		System.out.println("Code\tQty\tTotal\t\tAveragePrice");
		System.out.println("----\t---\t-----\t\t------------");
		System.out.println();
		if(ProductDB.count_java!=0)
			System.out.println("java\t"+ProductDB.count_java+"\t"+getFormat(ProductDB.java_total)+"\t\t"+getFormat(ProductDB.java_total/ProductDB.count_java));
		if(ProductDB.count_jsps!=0)
			System.out.println("jsps\t"+ProductDB.count_jsps+"\t"+getFormat(ProductDB.jsps_total)+"\t\t"+getFormat(ProductDB.jsps_total/ProductDB.count_jsps));
		if(ProductDB.count_jqry!=0)
			System.out.println("jqry\t"+ProductDB.count_jqry+"\t"+getFormat(ProductDB.jqry_total)+"\t\t"+getFormat(ProductDB.jqry_total/ProductDB.count_jqry));
		if(ProductDB.count_jcrp!=0)
		System.out.println("jcrp\t"+ProductDB.count_jcrp+"\t"+getFormat(ProductDB.jcrp_total)+"\t\t"+getFormat(ProductDB.jcrp_total/ProductDB.count_jcrp));
		if(ProductDB.count_html!=0)
			System.out.println("html\t"+ProductDB.count_html+"\t"+getFormat(ProductDB.html_total)+"\t\t"+getFormat(ProductDB.html_total/ProductDB.count_html));
		if(ProductDB.count_cshrp!=0)
		System.out.println("cshrp\t"+ProductDB.count_cshrp+"\t"+getFormat(ProductDB.cshrp_total)+"\t\t"+getFormat(ProductDB.cshrp_total/ProductDB.count_cshrp));
		sc.close();

	}
	public static String getFormat(double input)
    {
        NumberFormat currency = 
            NumberFormat.getCurrencyInstance();
        return currency.format(input);
    }
	
}
