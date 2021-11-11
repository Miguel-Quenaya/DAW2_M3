import java.util.Scanner;
import java.util.ArrayList;
public class Ley_diccionario {
	
	static int horas_suma(int segundosTotales, int horasto) {
		int minutosTotales, horas;
		
		 
		minutosTotales = segundosTotales / 60;
		horas = minutosTotales / 60;
		
		
		if(horasto + horas > 24) {
			horas=-1;
		}
		
		return horas;
	}
	static String obtenerHorasMinutosSegundos(int segundosTotales) {
		int minutosTotales, segundos, minutos, horas;
		String seg="",min="", h="";

		minutosTotales = segundosTotales / 60;
		segundos = segundosTotales % 60;
		horas = minutosTotales / 60;
		minutos = minutosTotales % 60;
		
		
		if (segundos < 10) {
			seg = "0" + segundos;
		}else {
			seg = Integer.toString(segundos);
		}
		if (minutos < 10) {
			min = "0" + minutos;
		}else {
			min = Integer.toString(minutos);
		}
		if (horas < 10) {
			h = "0" + horas;
		}else {
			h = Integer.toString(horas);
		}
		
		return (h + ":" + min + ":" + seg);
		
	}
	
	public static void main(String[] args) {
		// VARIABLES
		Scanner teclado = new Scanner(System.in);
		int segundosPalabra = 0;
		int definicionesPagina = 0;

		int acumuladoDefiniciones = 0;
		
		int segto = 0;
		boolean siono = false;
		ArrayList <Integer> listaSegundos = new ArrayList <Integer>();
		int i = 0; //posicions de la llista
		
		do {
			
			if (definicionesPagina == 0) {
				do{
					System.out.println("¿Cuántos segundos tarda por palabra?");
					segundosPalabra = teclado.nextInt();
				}while(segundosPalabra < 0 );
				i++;
				acumuladoDefiniciones = 0;
			}
			if (segundosPalabra != 0) {
				int horas = 0;
				do { 
					do{
						System.out.println("¿Definiciones de la página?");
						definicionesPagina = teclado.nextInt();
					}while(definicionesPagina < 0 );
					
					acumuladoDefiniciones += definicionesPagina;
				} while (definicionesPagina != 0);
				segto = acumuladoDefiniciones * segundosPalabra;
				
				
				if(horas_suma(segto, horas) != -1) {
					listaSegundos.add(acumuladoDefiniciones * segundosPalabra);
					horas += horas_suma(segto, horas);
				}else {
					siono = true;
				}
				
			}
			
		} while (segundosPalabra != 0 && !siono);
		
		
		for (int e : listaSegundos) {
			String tiempoFormateado = obtenerHorasMinutosSegundos(e);
			System.out.println(tiempoFormateado);
			
		}

		
	}

}
