import java.util.Scanner;

public class problemae {
	
	static boolean casoDePrueba(Scanner sc) {
			
			if(!sc.hasNext()) {
				return false;
			}
			int numc = sc.nextInt();
			int grande = 0, posg=0;
			int [] vector = new int [numc];
			for(int i = 0 ; i < vector.length ; i++) {
				vector[i] = sc.nextInt();
				if(vector[i] > grande) {
					grande = vector[i];
					posg = i;
				}
			}
			if(posg ==0) {
				System.out.println("0");
				return true;
			}
			int resul =0;
			int grandea = grande;
			for(int i = posg -1 ; i >= 0 ; i--) {
				resul = grandea - vector[i];
				grandea -= vector[i];
			}
			System.out.println(resul);
			return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while (casoDePrueba(sc));

	}

}
