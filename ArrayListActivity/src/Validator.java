
public class Validator {
	public static boolean ValidateQty(int qty){
		if(qty>0 && qty<50)
			return true;
		else
			return false;
	}

}
