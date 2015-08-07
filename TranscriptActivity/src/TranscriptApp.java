import java.util.Scanner;


public class TranscriptApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Transcript Application");
		Scanner sc=new Scanner(System.in);
		String choice="y";
		Transcript transcript=new Transcript();
		while (choice.equalsIgnoreCase("y")){
			System.out.println("Enter an Course  Code");
			String code=sc.nextLine();	
			while(!(Validator.ValidateCode(code))){
				System.out.println("Invalid Code.Enter a Course Code:");							
				 code=sc.nextLine();				 
			}
			
			System.out.println("Enter a credits");			
			String credits=sc.nextLine();			
			while(!(Validator.ValidateCredits(credits))){
				System.out.println("Invalid Credits.Enter new credits:");
					
				credits=sc.nextLine();
				 
			}
			int cdts=Integer.parseInt(credits);
			System.out.println("Enter a grade:");			
			String grade =sc.nextLine();			
			while(!(Validator.ValidateGrade(grade))){
				System.out.println("Invalid Price.Enter a new grade(A/B/C)?:");				
				 grade=sc.nextLine();	
				 
			}
			transcript.addCourse(new CourseEnrollment(code,cdts,grade));
			System.out.println("Do you wish to continue(Y/N)?");
			choice=sc.nextLine();
			System.out.println();			
		}
		System.out.println("Course\tCredits\tGrade\tQuality Points");
		System.out.println("------\t-------\t-----\t-------------");
		System.out.println(transcript);
		sc.close();

	}

}
