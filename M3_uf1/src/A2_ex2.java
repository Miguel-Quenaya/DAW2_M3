import java.util.Scanner;

public class A2_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paraula;
		boolean abs;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("paraula = ");
		paraula = teclat.next();
		
		abs = (paraula.equalsIgnoreCase("Arxiu")|paraula.equalsIgnoreCase("Buscar")|paraula.equalsIgnoreCase("Sortir"));
		
		System.out.print(abs);
	}

}
