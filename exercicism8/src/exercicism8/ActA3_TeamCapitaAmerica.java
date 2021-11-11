package exercicism8;

import java.util.Scanner;

public class ActA3_TeamCapitaAmerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double act1,act2,act3,ex1,ex2,nact,nex;
		boolean act,ex;
		Scanner teclat = new Scanner (System.in);
		
		do {
			System.out.println("Nota de Activitat 1 = ");
			act1 = teclat.nextDouble();
			
			if (act1<0||act1>10) {
				System.out.println("Nota de Activitat 1 no acceptada");
			}
		} while (act1<0||act1>10);
		
		do {
			System.out.println("Nota de Activitat 2 = ");
			act2 = teclat.nextDouble();
			
			if (act2<0||act2>10) {
				System.out.println("Nota de Activitat 2 no acceptada");
			}
		} while (act2<0||act2>10);
		
		do {
			System.out.println("Nota de Activitat 3 = ");
			act3 = teclat.nextDouble();
			
			if (act3<0||act3>10) {
				System.out.println("Nota de Activitat 3 no acceptada");
			}
		} while (act3<0||act3>10);
		
		do {
			System.out.println("Nota de Examen 1 = ");
			ex1 = teclat.nextDouble();
			
			if (ex1<0||ex1>10) {
				System.out.println("Nota de Examen 1 no acceptada");
			}
		} while (ex1<0||ex1>10);
		
		do {
			System.out.println("Nota de Examen 2 = ");
			ex2 = teclat.nextDouble();
			
			if (ex2<0||ex2>10) {
				System.out.println("Nota de Examen 2 no acceptada");
			}
		} while (ex2<0||ex2>10);
		
		nact = (act1+act2+act3)/3;
		nex = (ex1+ex2)/2;
		
		ex = (nex>=5);
		act = (nact>=5);
		System.out.println(act);
		
		if (ex) {
			System.out.println("Mitjana de examen aprovada amb una nota de " + nex);
		}else {
			System.out.println("Mitjana de examen suspesa amb una note de " + nex);
		}
		
		if (act) {
			System.out.println("Mitjana de activitats aprovada amb una nota de " + nact);
		}else {
			System.out.println("Mitjana de activitats suspesa amb una nota de " + nact);
		}
	}

}
