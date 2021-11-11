package exercicism8;

import java.util.Scanner;

public class Activitat6_Exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,suma;
		int a;
		
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("a = ");
		a=teclat.nextInt();
		System.out.println("b = ");
		b=teclat.nextInt();
		suma = a;
		
		for (int i = 0; i<=(b-2); i++) {
			suma = suma+a;
		}
		System.out.println(suma);
		teclat.close();
	}

}
