package exercicism8;

import java.util.Scanner;

public class Activitat2_Exercici7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("num1 = ");
		a = teclat.nextDouble();
		System.out.print("num2 = ");
		b = teclat.nextDouble();
		
		System.out.print(a + " + " + b + " = " + (a +b));
		
		teclat.close();

	}

}
