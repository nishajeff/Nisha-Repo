import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		while(true){
			
			if(num==555)
				break;
			else{
			System.out.println(num);
			num=sc.nextInt();
			}
		}
		sc.close();

	}

}
