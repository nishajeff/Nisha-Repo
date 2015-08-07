import java.util.Scanner;


public class InvoiceApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Invoice Application");
		Scanner sc=new Scanner(System.in);
		String choice="y";
		Invoice invoice=new Invoice();
		while (choice.equalsIgnoreCase("y")){
			System.out.println("Enter an item Code");
			String code=sc.next();	
			
			System.out.println("Enter a quantity");
			int qty=sc.nextInt();	
			while(!(Validator.ValidateQty(qty))){
				System.out.println("Invalid Quantity");
				System.out.println("Enter a quantity");
				 qty=sc.nextInt();	
				 
			}
			invoice.addToInvoice(new LineItem(code,qty));
			System.out.println("Do you wish to continue(Y/N)?");
			choice=sc.next();
			System.out.println();			
		}
		System.out.println(invoice);
		System.out.println("Invoice Total: "+invoice.getFormattedTotal());
		sc.close();

	}

}
