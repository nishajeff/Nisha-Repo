import java.util.Scanner;
public class BookApp {
	public static void main(String[] args) {
		System.out.println("Welcome to Book Pricing App");
		Scanner sc=new Scanner(System.in);
		String choice="y";
		while (choice.equalsIgnoreCase("y")){
			System.out.println("Enter a book Code");
			String code=sc.nextLine();			
			Book book=BookDB.getBook(code);
			System.out.println("SELECTED BOOK:");
			System.out.println("Title: "+book.getTitle()+"\nAuthor: "+book.getAuthor()+"\nDescription: "+book.getDescript());
			System.out.println("Price: "+book.getPrice()+"\nStock: "+book.isInstock());
			System.out.println();
			System.out.println("Do you wish to continue(Y/N)?");
			choice=sc.nextLine();
			System.out.println();
		}
		sc.close();
	}

}
