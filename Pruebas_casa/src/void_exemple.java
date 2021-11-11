import java.util.Scanner;
public class void_exemple {
	static int opcio_menu(Scanner teclat) {
		int pepito;
		System.out.println("1.sumar");
		System.out.println("2.restar");
		System.out.println("3.multi");
		System.out.println("4.dividir");
		pepito = teclat.nextInt();
		return pepito;
	}
	static int sumar(int a, int b) {
		int resultat;
		
		resultat = a + b;
		return (resultat);
	}
	static int restar(int a, int b) {
		int resultat;
		
		resultat = a - b;
		return (resultat);
	}
	static int multi(int a, int b) {
		int resultat;
		
		resultat = a * b;
		return (resultat);
	}
	static int dividi(int a, int b) {
		int resultat;
		
		resultat = a / b;
		return (resultat);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		int opcio, resultat=0;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("1");
		num1 = teclat.nextInt();
		System.out.println("2");
		num2 = teclat.nextInt();
		
		opcio = opcio_menu(teclat);
		switch(opcio) {
		case 1: resultat = sumar(num1,num2);
		break;
		case 2: resultat = restar(num1,num2);
		break;
		case 3: resultat = multi(num1,num2);
		break;
		case 4: resultat = dividi(num1,num2);
		break;

		}
		System.out.println(resultat);
	}

}
