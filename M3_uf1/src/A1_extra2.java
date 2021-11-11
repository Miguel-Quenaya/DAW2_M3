import java.util.Scanner;

public class A1_extra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rend,km,lkm,l;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("Rendiment del vehicle en mpg = ");
		
		rend = teclat.nextDouble();
		lkm = (235.21 / rend) / 100 ;
		
		System.out.print("Km que es vol fer = ");
		
		km = teclat.nextDouble();
		l = lkm * km;
		
		System.out.print("Litres necessaris = " + l);
	}

}
