import java.util.Scanner;

public class A4_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new  Scanner (System.in);
		int convalida;
		double act1,act2,act3,ex,huf,hfal,imiact;
		boolean alumneAprova=false,miact,inju,miex,notafinal,alumneSuspen=false,bconvalida;
		
		do {
			System.out.println("Convalida la materia ? (1-Si 2-No) ");
			convalida = teclat.nextInt();
			bconvalida = convalida==1;
			if (convalida!=1&&convalida!=2) {
				System.out.println("Eleccio incorrecta");
			}
		} while (convalida!=1&&convalida!=2);
		

		alumneAprova = bconvalida;
		alumneSuspen = !alumneAprova;
		
		if (!bconvalida) {
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
				System.out.println("Nota de Activitat 1 no acceptada");
			}
		} while (act3<0||act3>10);
		
		do {
			System.out.println("Nota de Examen = ");
			ex = teclat.nextDouble();
			
			if (ex<0||ex>10) {
				System.out.println("Nota de Examen no acceptada");
			}
		} while (ex<0||ex>10);
		
		do {
			System.out.println("Hores totals de la UF = ");
			huf = teclat.nextDouble();
			
			if (huf<=0) {
				System.out.println("Hores totals de la UF no acceptada");
			}
		} while (huf<=0);
		
		do {
			System.out.println("Hores Faltades= ");
			hfal = teclat.nextDouble();
			
			if (hfal<0) {
				System.out.println("Hores Faltades no acceptada");
			}
		} while (hfal<0);
		
		imiact = (act1+act2+act3)/3;
		miact = ((act1+act2+act3)/3)>=4;
		inju = (hfal<(huf*0.1));
		miex = (ex>=4);
		notafinal = ((ex*0.6)+(imiact*0.4)) >= 5;
		
		alumneAprova = miact&&inju&&miex&&notafinal;
		alumneSuspen = !alumneAprova;
		System.out.println(act1);
		System.out.println(act2);
		System.out.println(act3);
		System.out.println(huf + " h");
		System.out.println(hfal + " h");
		System.out.println(miact);
		System.out.println(inju);
		System.out.println(miex);
		System.out.println(notafinal);
		
		}
		
		System.out.println("alumne aprova = " + alumneAprova);
		System.out.println("alumne suspen = " + alumneSuspen);
	}

}
