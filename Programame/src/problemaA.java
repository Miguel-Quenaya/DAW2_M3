import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;


public class problemaA {
	
	static boolean casoDePrueba(Scanner teclado) {
		
		int n = teclado.nextInt();
		
		if (n == 0) {
			return false;
		}
		else {
			
			LocalTime[] tiempos = new LocalTime[n];
			LocalTime[] tiemposCopia = new LocalTime[n];
			
			int[] pos= new int [n]; 
			for (int i = 0;  i < n;  i++) {
				tiempos[i] = LocalTime.parse(teclado.next());
				tiemposCopia[i] = tiempos[i];
				
			}
			
			
			Arrays.sort(tiemposCopia);
			pos[0] = 1;
			
			
			for (int i = 1;  i < tiemposCopia.length;  i++) {
				long diff = ChronoUnit.SECONDS.between(tiemposCopia[i-1], tiemposCopia[i]);
				
				if(diff <= 1) {
					pos[i] = pos[i-1];
				}else {
					pos[i] = i+1;
				}
			}
			
			for (int i = 0;  i < n;  i++) {
				for(int j = 0 ; j < n ; j++) {
					if(tiempos[i] == tiemposCopia[j]) {
						
						System.out.println(pos[j]);
					}
				}
			}
			System.out.println();
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while (casoDePrueba(teclado));
		teclado.close();
	}
	

}