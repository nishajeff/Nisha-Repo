import java.util.Scanner;
public class GetIntegers {
	 public static void main (String[] args)
	    {
	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("Enter 10 numbers:");
	        int num,total = 0;
	        for(int i=0;i<10;i++){
	        // Loop should start here
	        	num = keyboard.nextInt();
	        	total += num;
	        }
	        //Loop should end here	        
	        System.out.println("The total of all 10 numbers is " + total);
	        keyboard.close();
	    }	 

}
