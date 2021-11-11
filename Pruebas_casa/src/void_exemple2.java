import java.util.Scanner;
public class void_exemple2 {
	static int[] omplir_vector(int[] vector) {
		Scanner teclat = new Scanner (System.in);
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.println("num posicio " + i);
			vector[i] = teclat.nextInt();
			
		}
		return (vector);
	}
	static void mostrar(int []vector) {
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.println(vector[i]);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []vector = new int[5];
		vector = omplir_vector(vector);
		mostrar(vector);
	}

}
