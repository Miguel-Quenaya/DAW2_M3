package exercicism8;

import java.util.Scanner;

public class Activitat2_Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int quocient;
		int residu;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("primer numero?");
		num1 = teclat.nextInt();
		System.out.print("segon numero?");
		num2 = teclat.nextInt();
		quocient = num1 / num2;
		residu = num1 % num2;
		System.out.println("Quocient:" + num1 + " / " + num2 + " = " + quocient);
		System.out.println("Residu:" + num1 + " % " + num2 + " = " + residu);
		
		teclat.close();

	}

}
