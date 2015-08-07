import java.util.Scanner;


public class LineItemInvoiceAppln {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the tax rate:");
		double taxRate=sc.nextDouble();
		double [] Prices=new double[100];		
		int index=0;
		double taxable_total=0.0,tax=0.0,grand_total=0.0,untaxable_total=0.0;
		System.out.println("Enter the prices");			
		double item=sc.nextDouble();
		System.out.println("Enter if taxable or not (true/false)?");
		boolean taxable=sc.nextBoolean();
		while(item!=0.0)
		{				
			Prices[index]=item;	
			if(taxable==true)
				taxable_total+=Prices[index];
			else
				untaxable_total+=Prices[index];
			index++;			
			item=sc.nextDouble();
			taxable=sc.nextBoolean();
		}		
		tax=taxable_total*taxRate;
		grand_total=taxable_total+tax+untaxable_total;
		System.out.println("Receipt:");
		for(int i=0;i<index;i++)
			System.out.println(Prices[i]);
		System.out.println(taxable_total+" taxable total\n"+untaxable_total+" untaxable total\n"+tax+" Tax\n"+grand_total+" grand total\n");
		sc.close();
	}

}
