import java.util.Scanner;
import java.util.ArrayList;
public class Ley_diccionario2 {
	
	static String obtenerHorasMinutosSegundos(int segundosTotales) {
		int minutosTotales, segundos, minutos, horas;
		String horasString, minutosString, segundosString;
		
		minutosTotales = segundosTotales / 60;
		segundos = segundosTotales % 60;
		horas = minutosTotales / 60;
		minutos = minutosTotales % 60;
		horasString = "" + horas;
		minutosString = "" + minutos;
		segundosString = "" + segundos;
		
		
		if (horas < 10) {
			horasString = "0" + horas;
		}
		
		
		if (minutos < 10) {
			minutosString = "0" + minutos;
		}
		
		
		if (segundos < 10) {
			segundosString = "0" + segundos;
		}
		return (horasString + ":" + minutosString + ":" + segundosString);
	}
	
	public static boolean casoDePrueba(Scanner teclado) {
		// VARIABLES
		
		int segundosPalabra;
		int definicionesPagina = 0;
		int acumuladoDefiniciones = 0;
		int acumuladoSegundos = 0;
		
		
		do {
			
			segundosPalabra = teclado.nextInt();
			
		} while (segundosPalabra < 0);
		
		
		if (segundosPalabra == 0) {
			/*for (int e : listaSegundos) {
				String tiempoFormateado = obtenerHorasMinutosSegundos(e);
				System.out.println(tiempoFormateado);
			}*/
			teclado.close();
			return false;
		}
		else {
			do {
				do {
					
					definicionesPagina = teclado.nextInt();
					
				} while (definicionesPagina < 0);
				acumuladoDefiniciones += definicionesPagina;
				if ((acumuladoDefiniciones * segundosPalabra)  <  86400) { //86400 són els segons d'un dia
					acumuladoSegundos = acumuladoDefiniciones * segundosPalabra;
				}
				
			} while (definicionesPagina != 0);
			//listaSegundos.add(acumuladoSegundos);
			System.out.println(obtenerHorasMinutosSegundos(acumuladoSegundos));
			acumuladoSegundos = 0;
			return true;
		}
		
	}
	
	
	public static void main(String[] args) {
		//ArrayList <Integer> listaSegundos = new ArrayList <Integer>();
		Scanner teclado = new Scanner(System.in);
		while (casoDePrueba(teclado));
	}

}
