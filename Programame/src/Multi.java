import java.util.Locale;
import java.util.Scanner;

// Problema 528 
public class Multi {
	
	static boolean casoDePrueba(Scanner teclado) {
		int numNumeros;
		boolean aceptado;
		
		do {
			try {
				numNumeros = teclado.nextInt();
			} catch (Exception excepcion) {
				numNumeros = -1;
				teclado.next(); // neteja l'scanner de l'error
			}
//			System.out.println(numNumeros);
		} while (numNumeros < 0  ||  numNumeros > 200000  ||  numNumeros == 1);
		
		if (numNumeros == 0) {
			teclado.close();
			return false;
		}
		else {
			int aux;
			float[] vector = new float[numNumeros];
			
			for (int i = 0;  i < numNumeros;  i++) {
				do {
//					
					do {
						vector[i] = teclado.nextFloat();
					}while(vector[i] < 0 || vector[i] > 1000);

						if (vector[i] % 1 != 0) {
							aux = 6;
							if(vector[i] >= 10) {
								aux++;
							}
							if(vector[i] >= 100) {
								aux++;
							}
							
							aceptado = (Float.toString(vector[i]).length() < aux);
						}
						else {
							aceptado = (vector[i] >= 0  &&  vector[i] <= 1000);
						}
				} while (!aceptado);
			}
			
			int j=0; //indice del numero que multiplicamos
			//indice del numero que multiplicamos
			int acumulado = 0;
			double resultado;
			
			
			do {
				for(int i = j+1 ; i < vector.length  ; i++) {
					
					resultado = vector[j] * vector[i];
					
					if ((resultado >= vector[j]  &&  resultado >= vector[i])  ||  (resultado <= vector[i]  &&  resultado <= vector[j])) {
						acumulado++;
					}
				}
				j++;
			}while(j < vector.length -1);
			
			System.out.println(acumulado);
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		while (casoDePrueba(teclado));
		
	}

}
