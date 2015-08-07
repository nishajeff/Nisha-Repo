	import java.util.Scanner;
	public class EndlessStrings {
	    public static void main (String[] args)
	    {
	        Scanner keyboard = new Scanner(System.in);	        
	        System.out.println("Say something!");	        
	        String userInput = keyboard.nextLine();		        	
	        while(true){   	
	              	
	        		System.out.println("You said "+userInput);	        		
	        		System.out.println("Say something!");
	        		userInput = keyboard.nextLine(); 
	        		if(userInput.equals(""))
	        			break;	            
	        }
	        keyboard.close();
	    }
	}




