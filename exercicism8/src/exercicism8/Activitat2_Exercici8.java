package exercicism8;

import java.util.Scanner;

public class Activitat2_Exercici8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b;
		double h;
		double a;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("base = ");
		b = teclat.nextDouble();
		System.out.print("altura = ");
		h = teclat.nextDouble();
		a = b * h / 2;
		
		System.out.print("area: " + b + " * " + h + " / 2 = " + a);
		
		teclat.close();

	}

}
