import java.util.Scanner;

public class Desembalse {
	
	static boolean casoDePrueba(Scanner sc) {
		int numD;
		
		do {
			
			numD = sc.nextInt();
		}while(numD <0 || numD > 10000);
		
		if(numD == 0) {
			sc.close();
			return false;
		}else {
			int[] tramo = new int[numD];
			int h2o = 0;
			for(int i = 0 ; i < tramo.length ; i++) {
				do {
					
					tramo[i]= sc.nextInt();
				}while(tramo[i] < 0 || tramo[i] > 1000);
			}
			for(int i = 0 ; i < tramo.length ; i++) {
				h2o += (tramo[numD -1] - tramo[i]);
			}
			System.out.println(h2o);
			return true;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(casoDePrueba(sc));
	}

}
