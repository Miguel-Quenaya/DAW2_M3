package exercicism8;

import java.util.Scanner;

public class Activitat2_Exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a
		int num1;
		int pot;
		//b
		double b;
		int entero;
		//c
		double c;
		//d
		double d;
		
		Scanner teclat = new Scanner (System.in);
		// a)
		System.out.print("num?");
		num1 = teclat.nextInt();
		System.out.print("potencia?");
		pot = teclat.nextInt();
		System.out.println(Math.pow(num1, pot));
		// b)
		System.out.print("part entera de = ");
		b = teclat.nextDouble();
		entero = (int)b;
		System.out.println(entero);
		// c)
		System.out.print("aproximació de = ");
		c = teclat.nextDouble();
		System.out.println(Math.round(c));
		//d
		System.out.println("valor absolut de = ");
		d = teclat.nextDouble();
		System.out.print(Math.abs(d));
		
		teclat.close();
				

	}

}
