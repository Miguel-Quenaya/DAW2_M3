package exercicism8;

import java.util.Scanner;

public class Activitat4_Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double preu;
		double efectiu1;
		boolean efectiu;
		double socidi;
		boolean socidi1;
		double des1 = 0;
		double des2 = 0;
		double des3 = 0;
		double preufi;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("El preu final = ");
		preu = teclat.nextDouble();
		System.out.print("Paga en efectiu? (1-Si 2-No) = ");
		efectiu1 = teclat.nextDouble();
		efectiu = efectiu1==1;
		System.out.print("És soci i avui es dilluns? (1-Si 2-No) = ");
		socidi = teclat.nextDouble();
		socidi1 = socidi==1;
		if (preu>500) {
			System.out.println("Descompte de 10% per compres superiors a 500€ Obtingut !");
			des1 = preu * 0.1;
		}
		if (efectiu) {
			System.out.println("Descompte de 10% per pagar en efectiu Obtingut !");
			des2 = preu * 0.1;
		}
		if (socidi1) {
			System.out.println("Descompte de 10% per ser soci i comprar un dillus Obtingut !");
			des3 = preu * 0.1;
		}
		preufi = preu - des1 - des2 - des3;
		System.out.println("El preu final amb els descomptes obtinuts es = " + preufi);
		
		teclat.close();

	}

}
