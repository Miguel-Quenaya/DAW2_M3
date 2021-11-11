import java.util.Scanner;

public class Reduciendo_envases {
	static int casoDePrueba(Scanner sc) {
		 int pesN, pesT;
		
		do {
			pesN = sc.nextInt();
		}while(pesN < 0);
		do {
			pesT = sc.nextInt();
		}while(pesT < pesN || pesT > 1000 );
		
		
		return (pesT - pesN);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCasos;
		
		Scanner sc = new Scanner(System.in);
		numCasos = sc.nextInt();
		int [] casos = new int[numCasos];
		
		for(int i = 0 ; i < numCasos ; i++) {
			casos[i] = casoDePrueba(sc);
			System.out.println(casos[i]);
		}
		
		
	}

}
