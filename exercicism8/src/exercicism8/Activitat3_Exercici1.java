package exercicism8;

import java.util.Scanner;

public class Activitat3_Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double gran;
		double petit;
		boolean gran1;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("num 1 = ");
		num1 = teclat.nextDouble();
		System.out.print("num 2 = ");
		num2 = teclat.nextDouble();
		
		gran1 = (num1>num2);
		if (gran1) {
			gran = num1;
			petit = num2;
		} else {
			gran = num2;
			petit = num1;
		}
		if (num1==num2) {
			System.out.println("Són iguals  ");
		} else {
			System.out.println("gran = " + gran);
			System.out.println("petit = " + petit);
		}

		teclat.close();
	}

}
