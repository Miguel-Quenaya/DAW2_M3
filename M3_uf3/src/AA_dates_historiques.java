import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AA_dates_historiques {
	
	static void crear () throws IOException {
		//Strings fecha para guardar la fecha, evento para guardar lo que paso esa fecha y respuesta para guardar la respuesta de si sigue poniendo fechas
		String fecha, evento, respuesta;
		//boolan para que controla si la fecha esta en el formato correcto
        boolean fechaCorrecto;
		Scanner sc = new Scanner (System.in);
		//PrintWriter ps = null;
		
		try {
			
		do {
			
			//do while que se repita mientras el usuario no pong ala fecha en el formato indicado
			do {
				fechaCorrecto = true;
				System.out.println("Fecha (dd/mm/yyyy)");
				fecha = sc.nextLine();
	            fechaCorrecto=fecha.matches("\\d{2}/\\d{2}/\\d{4}");
	            if(!fechaCorrecto) {
	            	System.out.println("Formato de fecha no aceptado");
	            }
			}while(!fechaCorrecto);
			//creación del fichero
			File archivo = new File("fechas.txt");	
			FileWriter escribir = new FileWriter(archivo, true);
			//guardamos lo que paso en esa fecha
			System.out.println("evento");
			evento = sc.nextLine();
			
			//introducimos en el fichero la fecha remplazando el "/" por un espacio + lo que pasa en esa fecha
			
			escribir.write(fecha.replaceAll("/", " ") +  " " + evento);
            escribir.write("\r\n"); 
            escribir.close();
			//preguntamos si quiere poner otra fechas mas
			System.out.println("Desea poner otra fecha más ?");
			respuesta = sc.nextLine();
			
		}while(respuesta.equalsIgnoreCase("si"));
		
		
		} catch (FileNotFoundException e) {
		System.out.println("Fichero no encontrado ");
		}
	}
	
	static void buscar() {
		
		boolean fechaCorrecto, encontrado=false;
		String fechai;
		//contador de fila que empieza por una para que no salga como fila 0 la primera fila
		int contadorfila = 1;
		
		try {
			Scanner teclat = new Scanner (System.in);
			//scanner sobre el fichero creado
			Scanner sc=new Scanner(new File("fechas.txt"));
			//mismo do while par ael formato de fecha
			do {
				fechaCorrecto = true;
				System.out.println("Fecha (dd/mm/yyyy) que desea buscar");
				fechai = teclat.nextLine();
	            fechaCorrecto=fechai.matches("\\d{1,2}/\\d{2}/\\d{4}");
	            if(!fechaCorrecto) {
	            	System.out.println("Formato de fecha no aceptado");
	            }
			}while(!fechaCorrecto);
			
			//mientras haya otra linia
			while (sc.hasNextLine()) {
			//en este string guardamos la linia para luego pintarlo
			String linia=sc.nextLine();
			//en este string solo guardaremos la fecha , como la fecha tiene un formato ,sabemos que de la 0 a la posicion 10 es la fecha , pues 
			//en este string solo guardamos desde la posicion 0 a la 10 de la linia entera
			String fecha= linia.substring(0,10);
			
			//cuando la fecha introducida (reemplazando el "/" por un espacio) sea igual a la fecha que esta en el fichero
			if((fechai.replaceAll("/", " ")).equalsIgnoreCase(fecha)) {
				System.out.println("numero de fila = " + contadorfila);
				System.out.println(linia);
				encontrado = true;
			}
			contadorfila++;
			}
			
			sc.close();
		}catch(FileNotFoundException e){
			System.out.println("error");
		}
		//si no se encuentra de muestra -1
		if(!encontrado) {
			System.out.println("numero de fila = -1");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		crear();
		buscar();
		
	}

}
