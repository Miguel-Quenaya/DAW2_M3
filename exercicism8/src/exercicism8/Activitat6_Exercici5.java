package exercicism8;

import java.util.Scanner;

public class Activitat6_Exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicial,dif,quant,suma,producte;
		Scanner teclat = new Scanner (System.in);
		System.out.println("inicial = ");
		inicial = teclat.nextInt();
		System.out.println("diferencia = ");
		dif = teclat.nextInt();
		System.out.println("quantitat = ");
		quant = teclat.nextInt();
		suma = inicial;
		producte = inicial;
		System.out.println(inicial);
		for (int i = 0; i<quant-1;i++) {
			inicial = inicial + dif;
			suma +=inicial;
			producte *= inicial;
			System.out.println(inicial);
		}
		System.out.println(suma);
		System.out.println(producte);
	}

}
