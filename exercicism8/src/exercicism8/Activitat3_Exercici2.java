package exercicism8;

import java.util.Scanner;

public class Activitat3_Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean parell;
		int residu;
		Scanner teclat = new Scanner (System.in);
		System.out.print("num = ");
		num = teclat.nextInt();
		residu = num % 2;
		parell = ( residu == 0);
		
		if (parell) {
			System.out.print("el numero es parell");
		}else {
			System.out.print("el numero es imparell");
		}
		teclat.close();
	}

}
