package exercicism8;

import java.util.Scanner;

public class Activitat6_Exercici7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota=0,md=0,i=0,s=0,b=0,n=0,ex=0;
		Scanner teclat = new Scanner (System.in);
		do {
			do {
			System.out.println("nota = ");
			nota = teclat.nextInt();
			if (nota<-1||nota>10) {
				System.out.println("incorrecto");
			}
			} while (nota<-1||nota>10);
			if (nota>=0&&nota<3) {
				md++;
			}
			if (nota>=3&&nota<5) {
				i++;
			}
			if (nota==5) {
				s++;
			}
			if (nota==6) {
				b++;
			}
			if (nota>=7&&nota<9
					) {
				n++;
			}
			if (nota==9||nota==10) {
				ex++;
			}
			
			
		}while(nota != -1);
		System.out.println("md = " + md);
		System.out.println("i = " + i);
		System.out.println("s = " + s);
		System.out.println("b = " + b);
		System.out.println("n = " + n);
		System.out.println("ex = " + ex);
		teclat.close();
	}
	
}
