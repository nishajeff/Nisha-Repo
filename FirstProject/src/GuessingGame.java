import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int secret_num=6;
		System.out.println("I have chosen a number between 1 and 10.Try to guess it.\nYour guess:");
		int num=sc.nextInt();
		while(num!=secret_num){
			System.out.println("That is incorrect.Guess again.\nYour guess:");
			num=sc.nextInt();
		}
		System.out.println("That's right!You're a good guesser.");
		sc.close();
	}

}
