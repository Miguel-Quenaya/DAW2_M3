import java.util.Scanner;

public class A1_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,e;
		Scanner teclat = new Scanner(System.in);
		System.out.print("pessetes = ");
		p = teclat.nextDouble();
		
		e = p / 166.386;
		
		System.out.print("euros = " + String.format("%.4f" , e));
	}

}
