import java.util.Scanner;

public class A5_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("n1 =");
		n1 = teclat.nextInt();
		System.out.print("n2 =");
		n2 = teclat.nextInt();
		
		while( n1 >= n2 ) {
			System.out.println("incorrecte, n1 ha de ser m�s petit que n2");
			System.out.print("n1 =");
			n1 = teclat.nextInt();
			System.out.print("n2 =");
			n2 = teclat.nextInt();
		}
		for(int i=n1 ; i< n2; i++) {
			double resultado = Math.sqrt(i);
			System.out.println("arrel quadrada de " + i + " = " + resultado);
		}
	}

}
