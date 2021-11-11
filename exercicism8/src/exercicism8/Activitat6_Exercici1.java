package exercicism8;

import java.util.Scanner;

public class Activitat6_Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,numdentro;
		Scanner teclat = new Scanner (System.in);
		do {
		System.out.println("n1 = ");
		num1 = teclat.nextInt();
		System.out.println("n2 =  ");
		num2 = teclat.nextInt();
		if (num2<=num1) {
			System.out.println("El n2 ha de ser més gran que n1");
		}
		}while(num2<=num1);
		numdentro = num2-1;
		for ( int i = (num2-num1-1) ; i >= 1; i--) {
			
			System.out.println(numdentro);
			numdentro--;
		}
		teclat.close();
	}
}
