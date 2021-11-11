import java.util.Arrays;
import java.util.Scanner;

public class Detevtando_copiones {
	static boolean casoDePrueba(Scanner sc) {
		int numN = sc.nextInt(), numK = sc.nextInt();
		if(!sc.hasNext()) {
			sc.close();
			return false;
			
		}
			int cont = 0;
			int [] vector = new int[numN];
			
			for(int i = 0 ; i< vector.length ; i++) {
				vector[i] = sc.nextInt();
			}
			
			for(int i =  0 ; i< vector.length ; i++) {
				if(i >= numK) {
					int num = i ;
					for (int j = 0 ; j < numK ; j++) {
						num--;
						if(vector[i] == vector[num]) {
							cont ++;
							
						}
						
					}
				}else if (i>0){
					for(int j = i -1 ; j != 0 ; j--) {
						if(vector[i] == vector[j]) {
							cont++;
						}
					}
				}
				
				
			}
			Arrays.sort(vector);
			int dif = vector[0];
			int cont2=0;
			for(int i = 1 ; i <vector.length ;i ++) {
				if(vector[i] == dif) {
					
					cont2++;
				}else {
					dif=vector[i];
					
				}
			}
			System.out.println(cont2 + " "+ cont);
			return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while(casoDePrueba(sc));
	}

}
