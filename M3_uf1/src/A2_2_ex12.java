import java.util.Scanner;

public class A2_2_ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora;
		int min;
		int seg;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("hores = ");
		hora = teclat.nextInt();
		System.out.print("minuts = ");
		min = teclat.nextInt();
		System.out.print("segons = ");
		seg = teclat.nextInt();
		
		System.out.println("hora actual = " + hora + " : " + min + " : " + seg);
		seg++;
		
		
		if (seg==60) {
			seg = 0;
			min++;
		} 
		if (min==60) {
			min =0 ;
			hora++;
		}
		if (hora==24) {
			hora=0;
			min=0;
			seg=0;
		}
		System.out.println("hora actual = " + hora + " : " + min + " : " + seg);
		
		teclat.close();
	}

}
