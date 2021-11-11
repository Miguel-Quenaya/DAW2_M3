package exercicism8;

import java.util.Scanner;

public class ActA5_Mitjanaedatclasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alumnes,edat,alumne=1 ;
		int sumaedats=0;
		int majors=0;
		int mitjana;
		Scanner teclat = new Scanner (System.in);
		
		
		System.out.println("Total alumnes a l'aula = ");
		alumnes = teclat.nextInt();
		
		for (int i = 0; i<alumnes; i++) {
			System.out.println("edat alumne " + alumne + " = ");
			edat = teclat.nextInt();
			sumaedats = sumaedats + edat;
			if (edat>=18) {
				majors++;
			}
			alumne++;
		}
		mitjana = sumaedats / alumnes;
		System.out.println("Mitjana edat de la classe = " + mitjana);
		System.out.println("Majors d'edat = " + majors);
		teclat.close();
		

	}

}
