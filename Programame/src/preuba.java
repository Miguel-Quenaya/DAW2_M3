import java.util.Arrays;
import java.util.Scanner;

public class preuba {
	static boolean casoDePrueba() {
		Scanner sc = new Scanner(System.in);
		int cubos,difA=0 ;
		int[] pesos;
		do {
			cubos = sc.nextInt();
		}while(cubos < 0 || cubos%2 !=0 || cubos > 200000);
		
		if(cubos == 0) {
			return false;
		}else {
			pesos = new int [cubos];
			for(int i = 0 ; i < pesos.length ; i++) {
				do {
					pesos[i] = sc.nextInt();
				}while(pesos[i] < 1 || pesos[i] > 1000000);
			}
			Arrays.sort(pesos);
			for(int i = 0 ; i<pesos.length ; i++) {
				if(i%2==0) {
					int dif = pesos[i+1] - pesos[i];
					if(dif > difA) {
						difA = dif;
					}
				}
			}
			System.out.println(difA);
			return true;
		}
	}

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		while( casoDePrueba());
		return 0;
	}

}
