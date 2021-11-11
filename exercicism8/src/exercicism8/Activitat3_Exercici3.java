package exercicism8;

import java.util.Scanner;

public class Activitat3_Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int suma;
		boolean igual;
				
		Scanner teclat = new Scanner (System.in);
		System.out.print("num1 = ");
		num1 = teclat.nextInt();
		System.out.print("num2 = ");
		num2 = teclat.nextInt();
		System.out.print("num3 = ");
		num3 = teclat.nextInt();
		suma = num1 + num2;
		igual = (num3==suma);
		
		if (igual) {
			System.out.print("la suma de " + num1 + " + " + num2 + " es igual que " + num3);
		} else {
			System.out.print("la suma de " + num1 + " + " + num2 + " no es igual que " + num3);
		}
		
		teclat.close();

	}

}
