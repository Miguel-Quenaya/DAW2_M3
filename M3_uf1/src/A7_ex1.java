import java.util.Scanner;

public class A7_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriu = new int [4][4];
		int major=0, menor=0;
		Scanner teclat = new Scanner (System.in);
		
		for (int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				System.out.println("numero de la posicion [" + i + "][" + j + "] =" );
				matriu[i][j] = teclat.nextInt();
				
			}
		}
		for (int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				if(i == 0 && j ==0) {
					major = matriu [i][j];
					menor = matriu [i][j];
				}
				if(matriu[i][j]>= major) {
					major = matriu [i][j];
				}
				if(matriu[i][j]<= menor) {
					menor = matriu [i][j];
				}
			}
		}
		System.out.println("numero más grande = " + major);
		System.out.println("numero más pequeño = " + menor);
	}

}
