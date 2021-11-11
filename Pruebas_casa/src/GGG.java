import java.util.Scanner;

public class GGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner (System.in);

		int num , num1 , resto , cambiar = 0;

		System.out.println("numero: ");
		num = teclat.nextInt();
		num1 = num;

		while (num > 0) {
		resto = num % 10;
		cambiar = cambiar * 10 + resto;
		num = num / 10;
		}
		if (num1 == cambiar) {
		System.out.println("El numero es palindrom " + cambiar);
		}
		else {
		System.out.println("El numero no es palindrom " + cambiar);
		}
		teclat.close();
	}

}
