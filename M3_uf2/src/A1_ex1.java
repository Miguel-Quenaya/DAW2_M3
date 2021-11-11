import java.util.Scanner;
public class A1_ex1 {
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
	
	static int multi(Scanner tecla) {
		int resultat,a ,b;
		System.out.println("a =");
		a = tecla.nextInt();
		System.out.println("b =");
		b = tecla.nextInt();
		resultat = a * b;
		return (resultat);
	}
	
	static int div(Scanner tecla) {
		int resultat,a ,b;
		System.out.println("a =");
		a = tecla.nextInt();
		System.out.println("b =");
		b = tecla.nextInt();
		resultat = a / b;
		return (resultat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int respuesta, resultat=0, a, b;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("1.sumar");
		System.out.println("2.restar");
		System.out.println("3.multiplicar");
		System.out.println("4.dividir");
		respuesta = teclat.nextInt();
		
		switch (respuesta){
		case 1: System.out.println("a =");
				a = teclat.nextInt();
				System.out.println("b =");
				b = teclat.nextInt();
				resultat = sumar(a, b);
		break;
		case 2: System.out.println("a =");
				a = teclat.nextInt();
				System.out.println("b =");
				b = teclat.nextInt();
				resultat = restar(a,b );
		break;
		
		case 3: resultat = multi(teclat);
		break;
		
		case 4: resultat = div(teclat);
		break;
		
		default: System.out.println("Adios");
		}
		
		System.out.println("resultat = " + resultat);
	}

}
