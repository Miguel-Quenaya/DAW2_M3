import java.util.Scanner;

public class A1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b,h,a;
		Scanner teclat = new  Scanner (System.in);
		
		System.out.print("base = ");
		b = teclat.nextDouble();
		
		System.out.print("altura = ");
		h = teclat.nextDouble();
		
		a = b * h / 2;
		
		System.out.print("area = " + String.format("%.2f", a));
		
		
	}

}
