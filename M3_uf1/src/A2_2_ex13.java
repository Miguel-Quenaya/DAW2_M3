import java.util.Scanner;

public class A2_2_ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota;
		boolean apte;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("nota = ");
		nota = teclat.nextDouble();
		
		apte = nota >= 5;
		
		if (apte) {
			System.out.print("Apte ");
		}
		else {
			System.out.print("No Apte ");
		}
	}

}
