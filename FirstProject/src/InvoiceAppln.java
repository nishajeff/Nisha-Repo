import java.util.Scanner;
public class InvoiceAppln {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the tax rate:");
		double taxRate=sc.nextDouble();
		double [] Prices=new double[100];
		int index=0;
		double sum_total=0.0,tax=0.0,grand_total=0.0;
		System.out.println("Enter the prices");	
		
		double item=sc.nextDouble();
		while(item!=0.0)
		{		
			Prices[index]=item;
			sum_total+=Prices[index];
			index++;			
			item=sc.nextDouble();
		}		
		tax=sum_total*taxRate;
		grand_total=sum_total+tax;
		System.out.println("Receipt:");
		for(int i=0;i<index;i++)
			System.out.println(Prices[i]);
		System.out.println(sum_total+" sum total\n"+tax+" Tax\n"+grand_total+" grand total\n");
		sc.close();
	}
}
