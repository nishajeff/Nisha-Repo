
import java.util.*; 
class ArrayListDemo { 
public static void main(String args[]) { 
// create an array list 
	ArrayList<String> al = new ArrayList<String>(); 
	System.out.println("Initial size of al: " + 
	al.size()); 
	// add elements to the array list 
	al.add("C"); 
	al.add("A"); 
	al.add("E"); 
	al.add("B"); 
	al.add("D"); 
	al.add("F"); 
	al.add(1, "A2"); 
	System.out.println("Size of al after additions: " + 
	al.size()); 
	// display the array list 
	System.out.println("Contents of al: " + al); 
	// Remove elements from the array list 
	al.remove("F"); 
	al.remove("G"); //There is no "G" in the list al.So nothing happens when this line is executed
	al.remove(2); 
	System.out.println("Size of al after deletions: " + al.size()); 
	System.out.println("Contents of al: " + al); 
	Object []  ia=al.toArray();	
	for(Object temp:ia)
		System.out.println(temp);
	} 
}

