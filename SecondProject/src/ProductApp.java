import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ProductApp {
	public static void main(String[] args) {
		ArrayList<String> List=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String choice="y";
		while(choice.equalsIgnoreCase("y")){
			System.out.println("Enter the type of Product:(Book/Software)?");
			String type=sc.nextLine();
			if(type.equalsIgnoreCase("Book")){				
				System.out.println("Enter the book description:");
				String descript=sc.nextLine();
				System.out.println("Enter the book price:");
				double price=sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter the book author:");
				String author=sc.nextLine();
				Book b=new Book();
				b.setAuthor(author);
				b.setDescription(descript);
				b.setPrice(price);
				b.setCode(type);	
				List.add(b.toString("detail"));				
			}
			else{
				if(type.equalsIgnoreCase("Software")){					
					System.out.println("Enter the software description:");
					String descript=sc.nextLine();
					System.out.println("Enter the software price:");
					double price=sc.nextDouble();
					sc.nextLine();
					System.out.println("Enter the software version:");
					String version=sc.nextLine();
					Software s=new Software();
					s.setVersion(version);
					s.setDescription(descript);
					s.setPrice(price);
					s.setCode(type);	
					List.add(s.toString("detail"));					
					}
				
				}
			System.out.println("Do you wish to continue?(y/n)");
			choice=sc.nextLine();
			
		}
		System.out.println("     LIST     ");
		System.out.println("--------------");
		Iterator<String> itr=List.iterator(); 
		while(itr.hasNext()){  
			  String in=itr.next();  
			 System.out.println(in);			
			  }		 
		sc.close();
		
	}

}
