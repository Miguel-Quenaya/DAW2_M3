package exercicism8;

import java.util.Scanner;

public class Activitat2_Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preu;
		int uni;
		double compra;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("Preu d'una unitat= ");
		preu = teclat.nextDouble();
		System.out.print("número d'unitats a comprar= ");
		uni = teclat.nextInt();
		compra = preu * uni;
		
		System.out.println("1 unitat a " + preu + " €");
		System.out.println("preu total de la compra = " + compra + " €");
		
		teclat.close();

	}

}
