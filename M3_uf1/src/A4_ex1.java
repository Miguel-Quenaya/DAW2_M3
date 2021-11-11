import java.util.Scanner;

public class A4_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h;
		double temp, litres;
		boolean bondia, tard, sortir;
		
	Scanner teclat = new Scanner(System.in);
	System.out.print("hora =");
	h = teclat.nextInt();
	System.out.print("temperatura =");
	temp = teclat.nextInt();
	System.out.print("litres de pluja =");
	litres = teclat.nextInt();
	
	bondia = (temp>20&&litres<2);
	tard = (h<22||temp>5);
	sortir = ((h<21||temp>20)&&litres<0.5);
	
	System.out.println("primero= " + bondia);
	System.out.println("segundo=" + tard);
	System.out.println("tercero=" + sortir);
	}

}
