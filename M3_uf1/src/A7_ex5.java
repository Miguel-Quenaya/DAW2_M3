import java.util.Scanner;

public class A7_ex5 {

	public static void main(String[] args) {
		
		Scanner teclat = new Scanner (System.in);
		
		int[][] m = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int numero = 0 , grande = 0;
		
		do {
			System.out.println("Ingresa numero de fila: ");
			numero = teclat.nextInt();
			if(numero<1||numero>3) {
				System.out.println("solo hay 3 filas F");
			}
		} while (numero<1||numero>3);
		
		for(int j = 0;j < m[numero-1].length;j++) {
			if (j==0) {
				grande = m[numero-1][j];
			}
			if (j!=0 && m[numero-1][j] > grande) {
				grande = m[numero-1][j];
			}
		}
		System.out.println(grande);
		teclat.close();

	}

}

