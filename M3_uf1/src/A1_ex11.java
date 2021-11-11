import java.util.Scanner;
public class A1_ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preu1,preu2,preu3;
		double iva1,iva2,iva3;
		int quan1,quan2,quan3;
		double total1,total2,total3;
		double noiva1,noiva2,noiva3;
		
		Scanner teclat = new Scanner (System.in);
		System.out.print("preu producte 1 = ");
		preu1 = teclat.nextDouble();
		System.out.print("iva producte 1 = ");
		iva1 = teclat.nextDouble() / 100;
		System.out.print("quantitat producte 1 = ");
		quan1 = teclat.nextInt();
		total1 = (preu1 + (preu1 * iva1)) * quan1;
		noiva1 = preu1 * quan1;
		
		System.out.print("preu producte 2 = ");
		preu2 = teclat.nextDouble();
		System.out.print("iva producte 2 = ");
		iva2 = teclat.nextDouble() / 100;
		System.out.print("quantitat producte 2 = ");
		quan2 = teclat.nextInt();
		total2 = (preu2 + (preu2 * iva2)) * quan2;
		noiva2 = preu2 * quan2;
		
		System.out.print("preu producte 3 = ");
		preu3 = teclat.nextDouble();
		System.out.print("iva producte 3 = ");
		iva3 = teclat.nextDouble() / 100;
		System.out.print("quantitat producte 3 = ");
		quan3 = teclat.nextInt();
		total3 = (preu3 + (preu3 * iva3)) * quan3;
		noiva3 = preu3 * quan3;
		
		System.out.println("Preu total producte1 = " + total1 + " €");
		System.out.println("Preu total producte2 = " + total2 + " €");
		System.out.println("Preu total producte3 = " + total3 + " €");
		System.out.println("preu total de la compra amb IVA = " + (total1 + total2 + total3) + " €");
		System.out.println("preu total de la compra sense IVA = " + (noiva1 + noiva2 + noiva3));
		
		teclat.close();
	}

}
