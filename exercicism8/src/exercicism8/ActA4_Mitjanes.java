package exercicism8;

import java.util.Scanner;

public class ActA4_Mitjanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m1,m2,m3,m4,m5,m6,m7,m8,fol;
		String convm1,convm2,convm3,convm4,convm5,convm6,convm7,convm8,convfol;
		double curs1=0,curs2=0;
		double convalidacionscurs1=0,convalidacionscurs2=0;
		double mitja1,mitja2,mitjatotal;
		
		
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("Convalidas M1? ");
		convm1 = teclat.next();
		if (convm1.equalsIgnoreCase("no")) {
			System.out.println("nota de M1 = ");
			m1 = teclat.nextDouble();
			curs1 = curs1 + m1;
		} else {
			convalidacionscurs1++;
		}
		System.out.println("Convalidas M2? ");
		convm2 = teclat.next();
		if (convm2.equalsIgnoreCase("no")) {
			System.out.println("nota de M2 = ");
			m2 = teclat.nextDouble();
			curs1 = curs1 + m2;
		}else {
			convalidacionscurs1++;
		}
		System.out.println("Convalidas M3? ");
		convm3 = teclat.next();
		if (convm3.equalsIgnoreCase("no")) {
			System.out.println("nota de M3 = ");
			m3 = teclat.nextDouble();
			curs1 = curs1 + m3;
		} else {
			convalidacionscurs1++;
		}
		System.out.println("Convalidas M4? ");
		convm4 = teclat.next();
		if (convm4.equalsIgnoreCase("no")) {
			System.out.println("nota de M4 = ");
			m4 = teclat.nextDouble();
			curs2 = curs2 + m4;
		}else {
			convalidacionscurs2++;
		}
		System.out.println("Convalidas M5? ");
		convm5 = teclat.next();
		if (convm5.equalsIgnoreCase("no")) {
			System.out.println("nota de M5 = ");
			m5 = teclat.nextDouble();
			curs1 = curs1 + m5;
		}else {
			convalidacionscurs1++;
		}
		System.out.println("Convalidas M6? ");
		convm6 = teclat.next();
		if (convm6.equalsIgnoreCase("no")) {
			System.out.println("nota de M6 = ");
			m6 = teclat.nextDouble();
			curs2 = curs2 + m6;
		}else {
			convalidacionscurs2++;
		}
		System.out.println("Convalidas M7? ");
		convm7 = teclat.next();
		if (convm7.equalsIgnoreCase("no")) {
			System.out.println("nota de M7 = ");
			m7 = teclat.nextDouble();
			curs2 = curs2 + m7;
		}else {
			convalidacionscurs2++;
		}
		System.out.println("Convalidas M8? ");
		convm8 = teclat.next();
		if (convm8.equalsIgnoreCase("no")) {
			System.out.println("nota de M8 = ");
			m8 = teclat.nextDouble();
			curs2 = curs2 + m8;
		}else {
			convalidacionscurs2++;
		}
		System.out.println("Convalidas FOL? ");
		convfol = teclat.next();
		if (convfol.equalsIgnoreCase("no")) {
			System.out.println("nota de FOL = ");
			fol = teclat.nextDouble();
			curs2 = curs2 +fol;
		}else {
			convalidacionscurs2++;
		}
		
		mitja1 = curs1 / ( 4-convalidacionscurs1);
		mitja2 = curs2 / (5-convalidacionscurs2);
		mitjatotal = (curs1+curs2) / (9 - (convalidacionscurs1+convalidacionscurs2));
		
		System.out.println("mitjana del curs 1 = " + mitja1);
		System.out.println("mitjana del curs 2 = " + mitja2);
		System.out.println("mitjana del curs 1 i 2 = " + mitjatotal);
		System.out.println(convalidacionscurs2);
		System.out.println(curs2);
		

	}

}
