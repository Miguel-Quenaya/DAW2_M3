import java.util.Scanner;

public class A1_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e,da,conv;
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("quants dólars val 1 euro? ");
		conv = teclat.nextDouble();
		System.out.print("euros = ");
		e = teclat.nextDouble();
		
		da = e * conv;
		
		System.out.print("dólars americans = " + String.format("%.2f", da));
	}

}
