package exercicism8;

import java.util.Scanner;

public class Activitat6_Exercici8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner (System.in);
		int treb;
		double salario;
		double media = 0;
		double max = 0;
		double min = 1000000000;
		
		System.out.println("Cuantos trabajadores?");
		treb=teclat.nextInt();
		
		for (int i = 0; i< treb; i++) {
			
			System.out.println("Cuanto cobras?");
			salario = teclat.nextDouble();
			media += salario;
			
			if (min > salario) {
				min = salario;
			}
			if (max < salario) {
				max = salario;
			}
		}
		
		media = media/ treb;
		
		System.out.println("Media " + media);
		System.out.println("Salario Maximo " + max);
		System.out.println("Salario Minimo " + min);
		teclat.close();
	
	}

}
