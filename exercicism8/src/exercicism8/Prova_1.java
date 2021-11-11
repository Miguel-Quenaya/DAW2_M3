package exercicism8;

import java.util.Scanner;

public class Prova_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int preu;
		double quantitat;
		double preutotal;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("quantitat?");
		preu = 10;
		quantitat = teclat.nextDouble();
		preutotal = preu * quantitat;
		
		System.out.println(preutotal + "€");
		teclat.close();

	}

}
