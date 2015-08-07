import java.util.Scanner;
public class PairProcess {
	public static void main(String[] args) {
		int num1, num2,sum,product;
		double avg;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		sum=num1+num2;
		product=num1*num2;
		avg=sum/2;
		if(sum>200){
		System.out.println("Sum= *"+sum);	
		}
		else{
			System.out.println("Sum="+sum);
		}
		
		System.out.println("Product="+product+"\nAvg="+avg);
        keyboard.close();
		
	}


}
