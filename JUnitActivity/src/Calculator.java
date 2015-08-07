
public class Calculator {
	private double result;
	
	public Calculator(){
		result=0.0;
		
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double addition(double num1,double num2){
		return num1+num2;
		
	}
	public double subtraction(double num1,double num2){
		return num1-num2;
		
	}
	public double multiplication(double num1,double num2){
		return num1*num2;
		
	}
	public double division(double num1,double num2){
		return num1/num2;
		
	}
	
	public double modulus(double num1,double num2){
		return num1%num2;
		
	}

}
