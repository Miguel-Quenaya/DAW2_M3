import java.util.Scanner;

public class A1_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h,w,p;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("alçada = ");
		h = teclat.nextDouble();
		System.out.print("amplada = ");
		w = teclat.nextDouble();
		
		p = (h * 2) + (w * 2);
		
		System.out.print("Perímetre = " + String.format("%.2f", p));
		
	}

}
