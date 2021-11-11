import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		double hores , souhora;
		double salari;
		Scanner teclat = new Scanner (System.in);
		System.out.print("cuantes hores fas?");
		hores = teclat.nextDouble();
		System.out.print("sou per hora ?");
		souhora = teclat.nextDouble();
		salari = hores * souhora * 30;
		System.out.print(salari);
		teclat.close();
	}

}




