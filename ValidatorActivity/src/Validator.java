import java.util.regex.Pattern;
public class Validator {

	public static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	public static boolean ValidateName(String input){
		if(Pattern.matches("[a-zA-Z ]+", input)) 
			return true;
		 else 
			 return false;

	}
	
	public static boolean ValidateAge(String input){
		try
			{
				if(isNumeric(input)){				
						
						if(Integer.parseInt(input)>=1 && Integer.parseInt(input)<=100)
							return true;
						else
							return false;
				}
				else
					return false;
			}
			catch(NumberFormatException ne){
				return false;
			}
		}
		
	public static boolean ValidateNumber(String input){
		try
		{
			if(isNumeric(input)){
				if(Double.parseDouble(input)>0.0 && Double.parseDouble(input)<1.0)
					return true;
				else
					return false;
			}
			else
				return false;
		}catch(NumberFormatException ne){
			return false;
		}
	}
	public static boolean ValidateHeight(String input){
		try
		{
			if(isNumeric(input)){
				if(Integer.parseInt(input)>=36 && Integer.parseInt(input)<=92)
					return true;
				else
					return false;
			}
			else
				return false;
		}catch(NumberFormatException ne){
			return false;
		}
	}
	public static boolean ValidateWeight(String input){
		try{
		
			if(isNumeric(input)){
				if(Integer.parseInt(input)>=80 && Integer.parseInt(input)<=400)
					return true;
				else
					return false;
			}
			else
				return false;
		}catch(NumberFormatException ne){
			return false;
		}
	}
	
}
