import java.util.Scanner;

public class A6_v_ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []  nombres = new String [5];
		double [] sou = new double [5];
		double maxsou = 0;
		Scanner teclat = new Scanner (System.in);
		
		for ( int i = 0 ; i < nombres.length ; i++) {
			System.out.println("nombre =");
			nombres[i] = teclat.next();
			System.out.println("sou = ");
			sou[i] = teclat.nextDouble();	
			if (sou[i] >= maxsou) {
				maxsou = sou[i];
			}
			}
		for( int j = 0 ; j < nombres.length ; j++) {
			if(sou[j]==maxsou) {
				System.out.println(nombres[j] + " = " + sou[j]);
			}
		}
			

	}

}
