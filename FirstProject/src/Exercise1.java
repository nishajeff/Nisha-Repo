import java.util.Scanner;
public class Exercise1 {
	public static void main(String [] args){	
		double width,length,area,time;
		int time_hours,time_minutes,time_in_int,time_seconds;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the yard width:");
		width=sc.nextDouble();
		System.out.println("Enter the yard length:");
		length=sc.nextDouble();
		area=width*length;
		time=area/2;
		time_in_int=(int)time;
		time_hours=(int)time/60;
		time_minutes=(int)time%60;	
		time_seconds=(int)((time-time_in_int)*60);
		System.out.println("The Yard Area="+area);
		System.out.println("The Mowing Time Estimated="+time_hours+" hours  "+time_minutes+" minutes "+time_seconds+" seconds");
        sc.close();
	}	
}
