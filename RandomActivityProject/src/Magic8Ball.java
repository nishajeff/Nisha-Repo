
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Magic8Ball
{
	public static void main ( String[] args )
	{
		ArrayList<History> List=new ArrayList<History>();
		String ch="y";
		Scanner sc=new Scanner(System.in);
		boolean firstQuestion=true;        // to mark the first question
		while(ch.equalsIgnoreCase("y")){			
			System.out.println("Ask a question:");
			String userInput=sc.nextLine();	
			if(!(userInput.equalsIgnoreCase("history")))
					firstQuestion=false;                // reset firstQuestion to false if a question other than history is asked
			if(userInput.equalsIgnoreCase("History")){
				if(firstQuestion)
					System.out.println("No questions asked so far.So no History!");//exception handling if the first question="history"
				else
				{
					Iterator<History> itr=List.iterator();
					while(itr.hasNext())
						System.out.println(itr.next().toString());
				}
			}
			else{
				Random r = new Random();	
				int choice = 1 + r.nextInt(20);
				String response = "";
		
				if ( choice == 1 )
					response = "It is certain";
				else if ( choice == 2 )
					response = "It is decidedly so";
				else if ( choice == 3 )
					response = "Without a doubt";
				else if ( choice == 4 )
					response = "Yes - definitely";
				else if ( choice == 5 )
					response = "You may rely on it";
				else if ( choice == 6 )
					response = "As I see it, yes";
				else if ( choice == 7 )
					response = "Most likely";
				else if ( choice == 8 )
					response = "Outlook good";
				else if ( choice == 9 )
					response = "Signs point to yes";
				else if ( choice == 10 )
					response = "Yes";
				else if ( choice == 11 )
					response = "Reply hazy, try again";
				else if ( choice == 12 )
					response = "Ask again later";
				else if ( choice == 13 )
					response = "Better not tell you now";
				else if ( choice == 14 )
					response = "Cannot predict now";
				else if ( choice == 15 )
					response = "Concentrate and ask again";
				else if ( choice == 16 )
					response = "Don't count on it";
				else if ( choice == 17 )
					response = "My reply is no";
				else if ( choice == 18 )
					response = "My sources say no";
				else if ( choice == 19 )
					response = "Outlook not so good";
				else if ( choice == 20 )
					response = "Very doubtful";
				else 
					response = "8-BALL ERROR!";
			
				System.out.println( "MAGIC 8-BALL SAYS: " + response );
				
				History his=new History(userInput,response);
				List.add(his);
			}
			System.out.println("Do you wish to continue:(y/n)?");
			ch=sc.nextLine();
		}
		sc.close();
		
	}
	
	
}

