import java.util.Scanner;
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String operator;
		System.out.println("What is the the first number? :");
		int num1=Integer.parseInt(in.nextLine());
		System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Modulus");
		int choice=Integer.parseInt(in.nextLine());
		System.out.println("What is the second number ? :");
		int num2=Integer.parseInt(in.nextLine());
		Calculator c=new Calculator();
		if(choice==1){
			operator="+";
			System.out.println(num1+operator+num2+"="+c.addition(num1, num2));			
		}
		else if(choice==2){
			operator="-";
			System.out.println(num1+operator+num2+"="+c.subtraction(num1, num2));
		}
		else if(choice==3){
			operator="*";
			System.out.println(num1+operator+num2+"="+c.multiplication(num1, num2));
		}
		else if (choice==4){
			operator="/";
			System.out.println(num1+operator+num2+"="+c.division(num1, num2));}
		else if (choice==5){
			operator="%";
			System.out.println(num1+operator+num2+"="+c.modulus(num1, num2));}
		else
			System.out.println("Invalid Operation");
		in.close();
		
	}

}
