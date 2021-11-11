import java.util.Scanner;

public class A2_2_ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota;
		String qualificacio = "";
		Scanner teclat = new Scanner (System.in);	
		
		System.out.print("nota = ");
		nota = teclat.nextDouble();
		while (nota<0||nota>10) {
			System.out.println("nota invalida, reitenta");
			System.out.println("nota = ");
			nota = teclat.nextDouble();
		}
		if (nota<5) {
			qualificacio = "Insuficient";
		}
		if (nota>=5&&nota<6) {
			qualificacio = "Suficient";
		}
		if (nota>=6&&nota<7) {
			qualificacio = "Be";
		}
		if (nota>=7&&nota<9) {
			qualificacio = "Notable";
		}
		if (nota>=9) {
			qualificacio = "Excelent";
		}
		System.out.print("qualifició = " + qualificacio);
	}

}
