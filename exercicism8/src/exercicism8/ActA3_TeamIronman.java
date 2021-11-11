package exercicism8;

import java.util.Scanner;

public class ActA3_TeamIronman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marato = 42;
		int h,min,hmin=0,seg,mseg=0;
		double velocitat;
		
		Scanner teclat = new Scanner (System.in);
		
		do {
			System.out.println("hores = ");
			h = teclat.nextInt();
			
			if (h<0) {
				System.out.println("Numero de hores no acceptada");
			}
		} while (h<0);
		do {
			System.out.println("minuts = ");
			min = teclat.nextInt();
			
			if (min<0) {
				System.out.println("Numero de minuts no acceptada");
			}
		} while (min<0);
		do {
			System.out.println("segons = ");
			seg = teclat.nextInt();
			
			if (seg<0) {
				System.out.println("Numero de segons no acceptada");
			}
		} while (seg<0);
		
		if (seg>=60) {
			if (seg==60) {
				min++;
				seg=0;
			}
			if (seg>60) {
				mseg= seg/60;
				seg = seg%60;
			}
		}
		if (min>=60) {
			if(min==60) {
				h++;
				min=0;
			}
			if (min>60) {
				hmin= min/60;
				min = min%60;
			}
		}
		
		System.out.println("Temps = " + (h+hmin) + " : " + (min+mseg) + " : " + seg);
		
		velocitat = marato/(h+hmin);
		System.out.println("velocitat = " + (velocitat) + " km/h");
		if (velocitat>10) {
			System.out.println("Felicitacions!!");
		} else {
			System.out.println("massa lent");
		}
		teclat.close();

	}

}
