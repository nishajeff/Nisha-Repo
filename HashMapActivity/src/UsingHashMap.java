import java.util.HashMap;
import java.util.Scanner;
public class UsingHashMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1,"one");
		myMap.put(2,"two");
		myMap.put(3,"three");
		myMap.put(4,"four");
		String input="";
		int num=0;
		String output="";
		String choice="y";
		while(choice.equalsIgnoreCase("y")){
			System.out.println("Enter anumber:");
			input=sc.nextLine();
			num=Integer.parseInt(input);
			if(myMap.containsKey(num)){
				output=myMap.get(num);
				System.out.println("Response:You entered "+output);
			}
			else{
				System.out.println("What map do you want to add to the Map?:");
				input=sc.nextLine();
				myMap.put(num,input);
			}
			System.out.println("Do you want to try again?(y/n)");
			choice=sc.nextLine();
		}				
		sc.close();
	}

}
