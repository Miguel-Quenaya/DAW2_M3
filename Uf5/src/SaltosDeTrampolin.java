import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SaltosDeTrampolin {
	//funcion que suma los valores interesados
	/**
	 * Ordenamos vector, y hacemos la suma sin incluir los 2 primeros ni los 2 ultimos
	 * @param numeros
	 */
	static void casoDePrueba(double[] numeros) {
		
		double suma = 0;
		//ordenamos el vector utilizadno Arrays.sort
		Arrays.sort(numeros);
		//sumamos sin incluir los 2 primero ni los 2 ultimos
		for(int i = 2 ; i <5;i++) {
			suma += numeros[i];
		}
		//guardamos la parte entero de la suma
		int entero = (int)(suma*2);
		//imprimimos el resultado
		System.out.println(entero);
		
	}

	public static void main(String[] args) {
		//teilor en acepta el reto (el ultimo envio en C++ no es un promgrama mio)
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		while (sc.hasNext()) {
			//Creamos y rellenamos vector de 7 notas
			double [] numeros = new double[7];
			for(int i = 0; i < 7 ; i++) {
				numeros[i] = sc.nextDouble();
			}
			//Enviamos el vector a la funcion para obtener el resultado
			casoDePrueba(numeros);
		};
		
		
	}

}
