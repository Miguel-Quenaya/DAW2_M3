import java.util.Scanner;

public class A2_2_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2,num3;
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("num1 = ");
		num1 =teclat.nextDouble();
		System.out.print("num2 = ");
		num2 =teclat.nextDouble();
		System.out.print("num3 = ");
		num3 =teclat.nextDouble();
		
		if (num3==num1+num2) {
			System.out.print(num3 + " és la suma de " + num1 + " + " + num2);
		}
		else {
			System.out.print(num3 + " no és la suma de " + num1 + " + " + num2);
		}
	}

}
