import java.util.Arrays;
import java.util.Scanner;

public class Divendres {
	static void casoprueba(Scanner sc) {
		int numn = sc.nextInt();
		int numk = sc.nextInt();
		int [] vector = new int [numn];
		int [] vector2 = new int [numk];
		int [] vector3 = new int [numk];
		
		int suma = 0;
		int grande = 0;
		
		
		for( int i = 0 ; i< vector.length ; i++) {
			vector[i] = sc.nextInt();
		}
		for( int i = 0 ; i< vector.length ; i++) {
			if(i <= vector.length - numk) {
				
				suma=0;
				int y = i;
				for(int j = 0 ; j< vector2.length ; j++) {
					
					vector2[j] = vector[y];
					
					suma+=vector2[j];
					y++;
				}
				if(suma > grande) {
					
					grande = suma;
				
					for( int g = 0 ; g< vector3.length ; g++) {
						vector3[g] = vector2[g];
					}
					
				}
			}
		}
		
		
		
		
		Arrays.sort(vector3);
		System.out.println(vector3[numk-1] +  vector3[numk-2]);
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
