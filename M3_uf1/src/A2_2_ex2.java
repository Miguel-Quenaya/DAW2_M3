import java.util.Scanner;

public class A2_2_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("num = ");
		num = teclat.nextInt();
		
		if ( num%2==0) {
			System.out.print("Aquest numero és parell");
		}
		else {
			System.out.print("Aquest numero és imparell");
		}
	}

}
