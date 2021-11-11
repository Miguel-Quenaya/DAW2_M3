

import java.util.Scanner;

public class A2_2_ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("import brut = ");
		i = teclat.nextDouble();
		
		
		if (i>1500) {
			i= i*1.16;
		}
		else {
			i=i*1.1;
		}
		System.out.print("import = " + i);
	}

}
