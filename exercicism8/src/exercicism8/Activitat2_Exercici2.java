package exercicism8;

import java.util.Scanner;

public class Activitat2_Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double eudo;
		double eu;
		double dolars;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("Quants dolars val 1 euro?");
		eudo = teclat.nextDouble();
		System.out.print("Quants euros tenim?");
		eu = teclat.nextDouble();
		dolars = eu * eudo;
		
		System.out.println("Tenim " + dolars + " $");
		
		teclat.close();

	}

}
