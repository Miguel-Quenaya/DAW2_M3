import java.util.Scanner;

public class A1_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e,da,conv;
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("quants d�lars val 1 euro? ");
		conv = teclat.nextDouble();
		System.out.print("euros = ");
		e = teclat.nextDouble();
		
		da = e * conv;
		
		System.out.print("d�lars americans = " + String.format("%.2f", da));
	}

}
