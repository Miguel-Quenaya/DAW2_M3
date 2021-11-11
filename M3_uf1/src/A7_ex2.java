import java.util.Scanner;

public class A7_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriu = new int [4][4];
		int sumaf, sumac;
		Scanner teclat = new Scanner (System.in);
		
		for (int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				System.out.println("numero de la posicion [" + i + "][" + j + "] =" );
				matriu[i][j] = teclat.nextInt();
				
			}
		}
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println();
			for ( int j = 0 ; j < 4 ; j++) {
				System.out.print(matriu[i][j] + " ");
			}
		}
		System.out.println();
		for (int i = 0 ; i < 4 ; i++) {
			sumaf =0;
			for(int j = 0 ; j < 4 ; j++) {
				sumaf += matriu[i][j];
			}
			System.out.println("suma de la fila " + (i+1) + " =" + sumaf);
		}
		for (int i = 0 ; i < 4 ; i++) {
			sumac =0;
			for(int j = 0 ; j < 4 ; j++) {
				sumac += matriu[j][i];
			}
			System.out.println("suma de la columna " + (i+1) + " =" + sumac);
		}
		
	}

}
