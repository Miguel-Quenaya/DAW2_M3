import java.util.Arrays;
import java.util.Scanner;

public class A1_ex5 {
	static int demanarDimensio (Scanner teclat){
		int dimensio;
		
		System.out.println("dimensio =");
		dimensio = teclat.nextInt();
		return(dimensio);
	}
	
	static void mostrarVector(int [] vector) {
		
		for(int i = 0 ; i < vector.length ; i++) {
			System.out.println(vector[i]);
		}
	}
	
	static void omplirVector(int[] vector) {
		Scanner teclat = new Scanner (System.in);
		for(int i = 0 ; i < vector.length ; i++) {
			System.out.println("num posicio " + (i+1));
			vector[i] = teclat.nextInt();
		}
		Arrays.sort(vector);
	}
	
	static int[] concatenar(int[] a, int[] b) {
		int[] vector = new int [(a.length + b.length)];
		
		for(int i = 0 ; i < a.length ; i++) {
			vector[i] = a[i];
		}
		for(int i = 0 ; i < b.length ; i++) {
			vector[(i + a.length)] = b[i];
		}
		Arrays.sort(vector);
		return(vector);
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a,b,concat;
		Scanner teclat = new Scanner (System.in);
		System.out.println("Vector a");
		a = new int [demanarDimensio(teclat)];
		System.out.println("Vector b");
		b = new int [demanarDimensio(teclat)];
		
		System.out.println("omplir vector a");
		omplirVector(a);
		System.out.println("omplir vector b");
		omplirVector(b);
		
		mostrarVector(a);
		System.out.println();
		mostrarVector(b);
		System.out.println();
		concat = concatenar(a,b);
		
		mostrarVector(concat);
		
	}

}
