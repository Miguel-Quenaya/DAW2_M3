import java.util.Scanner;

public class Lego {
	
	static void casoDePrueba(Scanner sc) {
		int N = sc.nextInt();
		System.out.println(((N/2)*(N/2)+(((N-2)/2)*((N-2)/2))));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numC= sc.nextInt();
		for (int i = 0 ; i < numC ; i++) {
			casoDePrueba(sc);
		}
	}

}
