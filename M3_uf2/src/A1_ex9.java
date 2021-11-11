import java.util.Scanner;
public class A1_ex9 {
	static int maximo (int [] vector) {
		int maximo=0;
		
		for (int i = 0 ; i < vector.length ; i++ ) {
			if (vector[i] > maximo) {
				maximo = vector[i];
			}
			
		}
		return (maximo);
	}
	static int minimo (int [] vector) {
		int minimo=0 ;
		
		for(int i = 0; i < vector.length ; i++) {
			if(i==0) {
				minimo = vector[i];
				
			}
			if (vector[i] < minimo) {
				minimo = vector[i];
			}
		}
		return (minimo);
	}
	
	static double mitjana (int[] vector) {
		double mitjana;
		double suma=0;
		
		for (int i = 0 ; i < vector.length ; i ++) {
			suma+=vector[i];
		}
		
		mitjana = suma / vector.length;
		return(mitjana);
	}
	
	static void superan (int []vector, double mitja) {
		for (int i = 0 ; i < vector.length ; i++) {
			if (vector[i] > mitja) {
				System.out.println(i);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, max,min;
		double mitja;
		int [] vector;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("longitud vector");
		n = teclat.nextInt();
		vector = new int [n];
		for (int i = 0 ; i < vector.length ; i++ ) {
			System.out.println("num posicio " + i );
			vector[i] = teclat.nextInt();
		}
		
		max = maximo(vector);
		min = minimo(vector);
		mitja = mitjana(vector);
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(mitja);
		superan(vector, mitja);
	}

}
