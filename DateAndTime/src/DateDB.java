import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
public class DateDB {
	private Date date;
	private Date now;
	private String day;
	private String description;
	
	
	public DateDB(int month,int dy,int year){
		
       GregorianCalendar n=new GregorianCalendar( year,month,dy);
       date=n.getTime();
       now=new Date();
       day="";
       description="";
      
	}

	public Date getNow() {
		return now;
	}

	public void setNow(Date now) {
		this.now = now;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	public long getNumOfdays(){
		long startDateMS=date.getTime();
		long endDateMS=now.getTime();
		long elapsedMS=startDateMS-endDateMS;
		long elapsedDays=elapsedMS/(24*60*60*1000);
		return elapsedDays;
	}
	
	

}
