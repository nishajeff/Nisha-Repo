import java.util.Scanner;
public class PersonDBApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String choice="y";
		while(choice.equalsIgnoreCase("y")){
			System.out.println("Enter Name:");
			String Name=sc.nextLine();
			while(!(Validator.ValidateName(Name))){				
				System.out.println("Invalid Entry.Enter a Name");				
				 Name=sc.nextLine();				 
			}
			
			System.out.println("Enter Age:");
			String input=sc.nextLine();
			while(!(Validator.ValidateAge(input))){				
				System.out.println("Invalid Entry.Enter Age:");				
				 input=sc.nextLine();				 
			}
			int age=Integer.parseInt(input);
			System.out.println("Enter Height in inches:");
			input=sc.nextLine();
			while(!(Validator.ValidateHeight(input))){				
				System.out.println("Invalid Entry.Enter Height:");				
				 input=sc.nextLine();				 
			}
			int height=Integer.parseInt(input);
			System.out.println("Enter Weight in lbs:");
			input=sc.nextLine();
			while(!(Validator.ValidateWeight(input))){				
				System.out.println("Invalid Entry.Enter Weight:");				
				 input=sc.nextLine();				 
			}
			int weight=Integer.parseInt(input);
			System.out.println("Enter your favourite decimal number between 0 and 1:");
			input=sc.nextLine();
			while(!(Validator.ValidateNumber(input))){				
				System.out.println("Invalid Entry.Enter a new Number:");				
				 input=sc.nextLine();				 
			}
			double num=Double.parseDouble(input);
			System.out.println("Name: "+Name+"\nAge: "+age+"\nHeight: "+height+" inches\nWeight: "+weight+" lbs"+"\nFavorite Number: "+num);
			System.out.println("Do you wish to continue:(y/n)?");
			choice=sc.nextLine();
		}
		sc.close();
	}

}
