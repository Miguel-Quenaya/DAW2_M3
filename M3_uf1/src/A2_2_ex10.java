import java.util.Scanner;

public class A2_2_ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota;
		Scanner teclat = new Scanner (System.in);	
		
		System.out.print("nota = ");
		nota = teclat.nextDouble();
		while (nota<0||nota>10) {
			System.out.println("nota invalida, reitenta");
			System.out.println("nota = ");
			nota = teclat.nextDouble();
		}
		if (nota<5) {
			System.out.print("Insuficient");
		}
		if (nota>=5&&nota<6) {
			System.out.print("Suficient");
		}
		if (nota>=6&&nota<7) {
			System.out.print("Be");
		}
		if (nota>=7&&nota<9) {
			System.out.print("Notable");
		}
		if (nota>=9) {
			System.out.print("Excelent");
		}
		}

}
