import java.util.Scanner;

public class A6_v_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sup=0, inf=0;
		double [] alturas ;
		double suma=0.0, mitja;
		Scanner teclat = new Scanner (System.in);
		
		do {
			System.out.println("num de persones =");
			n = teclat.nextInt();
			if(n<0) {
				System.out.println("valor incorrecte");
			}
		}while(n<0);
		alturas = new double[n];
		
		for(int i = 0 ; i<n ; i++) {
			System.out.println("altura (en m)= ");
			alturas[i] = teclat.nextDouble();
			suma= suma + alturas[i];
		}
		mitja = suma /  n;
		for(int j = 0 ; j < alturas.length; j++) {
			if(alturas[j]>=mitja) {
				sup++;
			}
			else {
				inf++;
			}
		}
	}
		

}
