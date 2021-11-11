import java.util.Scanner;

public class A1_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pr,se,suma ;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("primer: ");
		pr = teclat.nextDouble();
		System.out.print("segon");
		se = teclat.nextDouble();
		
		suma = pr + se;
		
		System.out.print("La suma de " + pr + " i " + se + " = ");
		System.out.printf("%.2f", suma );

	}

}
 