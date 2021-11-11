import java.util.Scanner;

public class A2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		boolean parells,imparell;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("num1 =");
		num1 = teclat.nextInt();
		System.out.print("num2 =");
		num2 = teclat.nextInt();
		
		parells = ((num1 + num2)%2==0);
		imparell = ((num1 + num2)%2!=0);
		
		System.out.println("els dos son parells = " + parells);
		System.out.println("un o els dos son imparells = " + imparell);
	}

}
