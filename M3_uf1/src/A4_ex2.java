import java.util.Scanner;

public class A4_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edat, edatmin;
		boolean potentrar;
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("edat minima per entrar =");
		edatmin = teclat.nextInt();
		System.out.print("edat =");
		edat = teclat.nextInt();
		
		potentrar = (edat>=edatmin);
		
		System.out.print("Pot entrar " + potentrar);
		
	}

}
