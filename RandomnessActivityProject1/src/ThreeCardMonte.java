import java.util.Random;
import java.util.Scanner;
public class ThreeCardMonte {
	public static void main(String[] args) {			
		Scanner sc=new Scanner(System.in);		
		int initialAmt=100;		
		Random r=new Random();
		while(initialAmt>0 && initialAmt<=500){
			String [] placeValue=new  String[4];
			int place=1+r.nextInt(3);			
			placeValue[place]="AA";				
			for(int i=1;i<placeValue.length;i++){
				if(placeValue[i]==null)
					placeValue[i]="#";				
			}		
			System.out.println("Enter a bet amount:");
			String bet=sc.nextLine();
			if(Integer.parseInt(bet)<5)
				System.out.println("Minimum bet amount=$5");
			else
			{
				System.out.println("Guess in which place the ace card is placed.Enter a number between 1 and 3");
				
				System.out.println("#     #     #");
				System.out.println();
				System.out.println("1     2     3");
				String userInput=sc.nextLine();
				
				if(Integer.parseInt(userInput)!=place){			
					System.out.println("Ha! Fast Eddie wins again! The ace was card number was "+place);
					for(int i=1;i<placeValue.length;i++)
						System.out.print(placeValue[i]+"     ");
					System.out.println();
					System.out.println("1     2     3");
					initialAmt=initialAmt-Integer.parseInt(bet);
				}
				else{
					System.out.println("YOu win.The guess was right!");
					for(int i=1;i<placeValue.length;i++)
						System.out.print(placeValue[i]+"     ");
					for(int i=1;i<placeValue.length;i++)
						System.out.print(placeValue[i]+"     ");
					System.out.println();
					System.out.println("1     2     3");
					initialAmt=initialAmt+Integer.parseInt(bet);
				}				
					
			}
			if(initialAmt<=0)
				System.out.println("Insufficient funds to play .Bye !");
			else if(initialAmt>500)
				System.out.println("Exceeded win limits!Bye");
		}
		sc.close();
		
	}

}
