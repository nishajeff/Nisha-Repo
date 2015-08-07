
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class ReadingAndWritingToFile {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		PrintWriter writer = null;
		try {
			writer=new PrintWriter(new File("mymap.txt"));
			for (Integer i = 0; i <= 5; i++) 
			{
				writer.println(i+"-"+getText(i));
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();		
		try {			
			myMap=readLines(new File("mymap.txt"));			 
		} catch (Exception e) {		
			e.printStackTrace();
		}
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
			if(choice.equalsIgnoreCase("n")){
				Set set = myMap.entrySet();			     
			      Iterator i = set.iterator();
			      try {
					writer=new PrintWriter(new File("mymap.txt"));
				} catch (FileNotFoundException e) {					
					e.printStackTrace();
				}			     
			      while(i.hasNext()) {
			         Map.Entry me = (Map.Entry)i.next();
			         writer.println(me.getKey() + "- "+me.getValue());			        
			      }		
				}
				
			}				
		sc.close();
		writer.close();
	}
	public static String getText(int i){
		if(i==0)
			return "zero";
		else if(i==1)
			return "one";
		else if(i==2)
			return "two";
		else if(i==3)
			return "three";
		else if(i==4)
			return "four";
		else if(i==5)
			return "five";
		else return "unknown";
	}
	
	public static HashMap<Integer, String> readLines(File file) throws Exception {		
		if (!file.exists()) { 					
			  return new HashMap<Integer, String>(); 
		 	  } 
		BufferedReader reader = new BufferedReader(new FileReader(file));		 	     
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		String line = reader.readLine(); 
		while (line != null) {
			  String[]res=line.split("-");
		 	  myMap.put(Integer.parseInt(res[0].trim()),res[1].trim());
		 	  line = reader.readLine(); 
		 	  } 
		reader.close(); 			     
		return myMap; 
	} 

}

