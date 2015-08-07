

public class Validator {
	public static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
	public static boolean ValidateQty(String input){
		if(isNumeric(input)){
			if(Integer.parseInt(input)>0 && Integer.parseInt(input)<50)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public static boolean ValidatePrice(String input){
		if(isNumeric(input)){
			if(Double.parseDouble(input)>0.0 && Double.parseDouble(input)<1000.0)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public static boolean ValidateCode(String input){
		if(input.equals("java")||input.equals("jsps")||input.equals("jqry")||input.equals("jcrp")||input.equals("html")||input.equals("cshrp"))
			return true;
		else
			return false;
	}

}
