import java.util.Scanner;
public class A1_ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,min,seg,totalseg;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("hores = ");
		h = teclat.nextInt();
		System.out.print("minuts = ");
		min = teclat.nextInt();
		System.out.print("segons = ");
		seg = teclat.nextInt();
		
		totalseg = seg + (min * 60) + ( h * 60 * 60);
		
		System.out.print("segons totals = " + totalseg);
	}

}
