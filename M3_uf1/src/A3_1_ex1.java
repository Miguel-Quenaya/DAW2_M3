import java.util.Scanner;

public class A3_1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double calcular;
		double num1;
		double num2;
		double area = 0;
		boolean num;
		
		Scanner teclat = new Scanner (System.in);
		System.out.println("1-Calcular l'àrea d'un rectangle");
		System.out.println("2-Calcular l'àrea d'un triangle");
		System.out.println("3-Calcular l'àrea d'un cercle");
		calcular = 0;
		num = ((calcular<=1)&&(calcular>=3));
			System.out.println("Que quiere hacer?(1,2 o 3)");
			calcular = teclat.nextDouble();
			if(calcular==1) {
				System.out.print("altura = ");
				num1 = teclat.nextDouble();
				System.out.print("amplada = ");
				num2 = teclat.nextDouble();
				area = num1 * num2;
			}else if (calcular==2) {
				System.out.print("altura = ");
				num1 = teclat.nextDouble();
				System.out.print("amplada = ");
				num2 = teclat.nextDouble();
				area = num1 * num2 / 2;
			}else if (calcular==3) {
				num1 = Math.PI;
				System.out.print("quin és el radi ?");
				num2 = teclat.nextDouble();
				area = num1 * (Math.pow(num2, 2));
			}else {
				System.out.println("opcion incorecta");
			}
		System.out.println("Area = " + area );
		teclat.close();
	}

}
