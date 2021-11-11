package exercicism8;

import java.util.Scanner;

public class Activitat2_Exercici6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hores;
		int hseg;
		int min;
		int mseg;
		int seg;
		int total;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("hores = ");
		hores = teclat.nextInt();
		hseg = hores * 3600;
		System.out.print("minuts = ");
		min = teclat.nextInt();
		mseg = min * 60;
		System.out.print("segons = ");
		seg = teclat.nextInt();
		total = hseg + mseg + seg;
		System.out.print(total);
		
		teclat.close();

	}

}
