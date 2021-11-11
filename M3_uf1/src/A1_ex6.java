import java.util.Scanner;

public class A1_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double unitats,preu,total = 0;
		String sn;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("preu unitat = ");
		preu = teclat.nextDouble();
		System.out.print("unitats = ");
		unitats = teclat.nextDouble();
		
		total = total + (preu * unitats);
		System.out.print("més coses ?" );
		sn = teclat.next();
		
		while (sn.equalsIgnoreCase("si")) {
			System.out.print("preu unitat = ");
			preu = teclat.nextDouble();
			System.out.print("unitats = ");
			unitats = teclat.nextDouble();
			
			total = total + (preu * unitats);
			System.out.print("més coses ?" );
			sn = teclat.next();
		}
		System.out.print("import de compra = " + String.format("%.2f", total));
	}

}
