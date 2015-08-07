import java.util.Scanner;
public class TaxCalculate {
	public static void main(String[] args) {		
		double Total=0;
		double [] taxRates=new double[3];
		taxRates[0]=0.06;
		taxRates[1]=0;
		taxRates[2]=0.045;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cust_num:");
		int cust_num=sc.nextInt();
		System.out.println("Enter cust_name:");
		String cust_name=sc.next();
		System.out.println("Enter tax_code:");
		String tax_code=sc.next();
		System.out.println("Enter sales_amt:");
		double sales_amt=sc.nextDouble();
		if(tax_code.equalsIgnoreCase("NRM")){
			Total=sales_amt+sales_amt*taxRates[0];
		}
		else if(tax_code.equalsIgnoreCase("NPF")){
			Total=sales_amt+sales_amt*taxRates[1];
		}
		
		else if(tax_code.equalsIgnoreCase("BIZ")){
			Total=sales_amt+sales_amt*taxRates[2];
		}
		System.out.println("Name: "+cust_name+"\nNum: "+cust_num+"\nSales Amount="+sales_amt+"\nThe Total amount="+Total);
		sc.close();
	}

}
