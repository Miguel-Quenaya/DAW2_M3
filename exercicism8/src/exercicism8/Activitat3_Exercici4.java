package exercicism8;

import java.util.Scanner;

public class Activitat3_Exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double brut;
		double net;
		boolean iva;
		Scanner teclat = new Scanner (System.in);
		System.out.print("import brut = ");
		brut = teclat.nextDouble();
		
		iva = (brut>15000);
		
		if (iva) {
			net = brut + (brut * 0.16);
		} else {
			net = brut + (brut * 0.1);
		}
		System.out.print("import net = " + net);
		teclat.close();
	

	}

}
