import java.util.Arrays;
import java.util.Scanner;

public class Daus {
	
	static void casoprueba(Scanner sc) {
		int [] numeros = new int[5];
		
		for(int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = sc.nextInt();
		}
		Arrays.sort(numeros);
		
		
		if(numeros[4]+numeros[1] != numeros[2]+numeros[3]) {
			System.out.println("IMPOSSIBLE");
		}else {
			int max = numeros[4]+numeros[1];
			System.out.println(max-numeros[0]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numC = sc.nextInt();
		for (int i = 0 ; i< numC ; i++) {
			casoprueba(sc);
		}
	}

}
