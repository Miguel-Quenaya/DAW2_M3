import java.util.Scanner;

public class A6_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota, suma = 0,mitja;
		Scanner teclat = new Scanner (System.in);
		
		for(int i = 0 ; i < 15 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				for (int k = 1 ; k <= 3; k++) {
					System.out.println("nota de l'avaluacio " + k + " del modul " + j + " = ");
					nota = teclat.nextDouble();
					suma+=nota;
				}
				mitja=suma/3;
				System.out.println("nota final del modul " + j + " = " + mitja);
				suma=0;
				mitja=0;
				
				
			}
		}
	}

}
