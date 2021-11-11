package exercicism8;

import java.util.Scanner;

public class Activitat2_Exercici9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h;
		double w;
		double p;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("alçada = ");
		h = teclat.nextDouble();
		System.out.print("amplada = ");
		w = teclat.nextDouble();
		p = h * 2 + w * 2;
		System.out.print("perimetre = " + p);
		
		teclat.close();

	}

}
