import java.util.regex.Pattern;


public class Validator {
	public static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	public static boolean ValidateifAlpha(String input){
		if(Pattern.matches("[a-zA-Z ]+", input)) 
			return true;
		 else 
			 return false;

	}
	
	public static boolean ValidateCredits(String input){
		try{
			if(isNumeric(input)){
				if(Integer.parseInt(input)>0 && Integer.parseInt(input)<=4)
					return true;
				else
					return false;
			}
			else return false;
		}catch(NumberFormatException ne){
			return false;
		}
		
	}
	
	public static boolean ValidateGrade(String input){
		if(ValidateifAlpha(input)){
			if(input.equals("A")||input.equals("B")||input.equals("C")||input.equals("F"))
				return true;
			else return false;
		}
		else return false;
		
	}
	
	public static boolean ValidateCode(String input){
		//if(ValidateifAlpha(input))
		if(Pattern.matches("[a-zA-Z0-9 ]+",input))
			return true;
		else
			return false;
		
	}

}
