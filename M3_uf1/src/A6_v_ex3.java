import java.util.Scanner;

public class A6_v_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nombres = new int [10];
		int suma = 0,mitja;
		Scanner teclat = new Scanner (System.in);
		
		for(int i = 0; i<nombres.length ; i++) {
			System.out.println("num de la posicio " + i + " =");
			nombres[i] = teclat.nextInt();
			
		}
		for(int j = 0 ; j < nombres.length ; j+=2) {
			
				suma+=nombres[j];
		
		}
		mitja = suma / 6;
		System.out.println(mitja);
	}

}
