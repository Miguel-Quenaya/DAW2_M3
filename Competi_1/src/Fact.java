import java.util.Scanner;

public class Fact {
	// Si falla mirar tipus de dades long en comptes de 
	static long resultado(long num1, long num2) {
		long num = num1;
		long resultado =1;
		while(num>num2) {
			resultado *= num;
			num--;
		}
		
		return resultado;
	}
	
	static boolean casoDePrueba(Scanner teclado) {
		long num, den;
		long resultado;
		
		//Entramos num y dem
//		System.out.println("num?");
		num = teclado.nextLong();
//		System.out.println("den?");
		den = teclado.nextLong();
		
		if (num < den) {
			return false;
		}
		else {
			System.out.println(resultado(num, den));
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while (casoDePrueba(teclado));
		teclado.close();
	}

}