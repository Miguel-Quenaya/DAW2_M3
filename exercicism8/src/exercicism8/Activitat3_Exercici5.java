package exercicism8;

import java.util.Scanner;

public class Activitat3_Exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anys;
		double sou = 40000;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("Anys treballats = ");
		anys = teclat.nextInt();
		
		if (anys>=10) {
			sou = 40000 + (40000 * 0.1);
		} else if (anys<10 && anys>=5) {
			sou = 40000 + (40000 * 0.07);
		} else if (anys<5 && anys>=3) {
			sou = 40000 + (40000 * 0.05);
		} else if (anys<3) {
			sou = 40000 + (40000 * 0.03);
		}
		System.out.print(sou + " €");
		
		teclat.close();

	}

}
