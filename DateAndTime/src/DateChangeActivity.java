import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class DateChangeActivity {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		//System.out.println(now.getTime());		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		DateFormat dateFormat1 = new SimpleDateFormat("hh:mm:ss");
		System.out.println(dateFormat.format(now));
		System.out.println(dateFormat1.format(now));
		
	}

}
