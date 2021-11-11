import java.util.Scanner;

public class A1_ex7 {
	
	static boolean podemsortir(double hora, double temp, double pluja) {
		boolean sortir = false;
		
		if(hora < 21 || (temp > 20 && pluja <0.5)) {
			sortir= true;
		}
		return (sortir);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hora,temp,pluja;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("hora =");
		hora = teclat.nextDouble();
		System.out.println("temperatura = ");
		temp = teclat.nextDouble();
		System.out.println("Quantitat de pluja = ");
		pluja = teclat.nextDouble();
		
		System.out.println("podem sortir = " + podemsortir(hora, temp, pluja));
	}

}
