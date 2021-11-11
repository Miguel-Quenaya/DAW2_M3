package exercicism8;

import java.util.Scanner;

public class Activitat4_Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edat = 0;
		boolean cert;
		
		Scanner teclat = new Scanner (System.in);
		System.out.println("edta = ");
		edat = teclat.nextInt();
		
		cert = (edat>16)&&(edat<21);
			System.out.println("major que 16 i menor que 21 = " + cert);
		
		teclat.close();
	}

}
