package exercicism8;

import java.util.Scanner;

public class Activitat6_Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner tec = new Scanner (System.in);
		
		System.out.println("numero = ");
		num = tec.nextInt();
		for (int i = 1; i < (num+1); ++i) {
			if (num%i == 0) {
				System.out.println(i);
			}
		}
		
	}
}
