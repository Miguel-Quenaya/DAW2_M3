package exercicism8;

import java.util.Scanner;

public class Activitat5_Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner (System.in);
		
		int temp;
		int lpluja;
		int hora;
		boolean bondia;
		boolean dia;
		boolean bici;
		
		System.out.print("temperatura = ");
		temp = teclat.nextInt();
		System.out.print("quantitat de litres de pluja = ");
		lpluja = teclat.nextInt();
		System.out.print("hora (nomes l'hora) = ");
		hora = teclat.nextInt();

		bondia = (temp>20&&lpluja<2);
		dia = !(hora>=22||temp<=5);
		bici = (hora<21||temp>20);
		
		
		System.out.println("Avui fa un bon dia per sortir = " + bondia);
		System.out.println("punto 2 =" + dia);
		System.out.println("podem sortir en bici =" + bici);
		
		teclat.close();
	}

}
