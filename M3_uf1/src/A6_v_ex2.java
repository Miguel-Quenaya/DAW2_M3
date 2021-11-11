import java.util.Scanner;

public class A6_v_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double suma=0, mitja;
		double [] notas;
		int alumnes;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("num de alumnes = ");
		alumnes = teclat.nextInt();
		
		notas = new double [alumnes];
		
		for(int i = 0 ; i < alumnes ; i++) {
			System.out.println("nota = ");
			notas[i] = teclat.nextDouble();
			
			suma+=notas[i];
		}
		mitja = suma/alumnes;
		System.out.println( "mitjana = " + mitja);
		
		for (int j = 0 ; j < alumnes ; j++) {
			if(notas[j]>mitja) {
				System.out.println(notas[j]);
			}
		}
	}

}
