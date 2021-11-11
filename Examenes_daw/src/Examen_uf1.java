import java.util.Scanner;

public class Examen_uf1 {

	public static void main(String[] args) {
		//creamos variables y vectores que se necesita, tambn el scanner
		String [] dni, instrument;
		double [] preu_instrument;
		int num_compradors;
		//variables para buscar un dni y su total
		String dni2;
		boolean encontrado = false;
		double total = 0;
		//variable para encontrar el mas grande
		double grande = 0;
		Scanner teclat = new Scanner (System.in);
		
		//Preguntamos el numde compradores con la condicion que tiene que ser como minimo 3, y lo guardamos en la variable
		do {
			
			System.out.println("num de compradors =");
			num_compradors = teclat.nextInt();
			
			if(num_compradors < 3) {
				System.out.println("Almenys ha d'haver-hi 3 compradors");
			}
			
		} while ( num_compradors <3 );
		
		//definimos el num de columnas que hay en los 3 vectores 
		dni = new String[num_compradors];
		instrument = new String[num_compradors];
		preu_instrument = new double[num_compradors];
		
		//introduïm els dnis, instruments i preus en vectors en paral·lel
		for ( int i = 0 ; i < dni.length ; i++) {
			
			System.out.println("DNI = ");
			dni[i] = teclat.next();
			
			System.out.println("instrument = ");
			instrument[i] = teclat.next();
			
			System.out.println("preu = ");
			preu_instrument[i] = teclat.nextDouble();
			
			
		}
		
		//Mostrem totes les compres fetes
		for ( int i = 0 ; i < dni.length ; i++) {
			
			System.out.println("compra " + (i+1)  + ": " + dni[i] + " - " + instrument[i] + " - " + preu_instrument[i]);
			
			//aprofitem i busquem la més gran
			if(i == 0) {
				grande = preu_instrument[i];
			}
			if( i != 0 && preu_instrument[i] > grande) {
				grande = preu_instrument[i];
			}
		}
		
		//Creamos una espacio para que se vea mejor
		System.out.println();
		
		//Mostrem tot de la compra més gran
		System.out.println( "Compra/es més gran :");
		for ( int i = 0 ; i < dni.length ; i++) {
			
			if(preu_instrument[i] == grande) {
				
				System.out.println("compra " + (i+1)  + ": " + dni[i] + " - " + instrument[i] + " - " + preu_instrument[i]);
			}
		}
		
		//Creamos una espacio para que se vea mejor
		System.out.println();
		
		//intoduïr un dni i buscarlo , si no el trobem, mostrar error i tornar a preguntar el dni
		do {
			
			System.out.println("DNI del client que volem = ");
			dni2 = teclat.next();
			
			for( int i = 0 ; i < dni.length ; i++) {
				if(dni2.equalsIgnoreCase(dni[i])) {
					encontrado = true;
				}
			}
			
			if(!encontrado) {
				System.out.println("ERROR , dni no trobat");
			}
			
		} while (!encontrado);
		
		//mostrem les compres d'aquest client i tambe anem suman les seves compres en la varibale total
		for(int i = 0 ; i < dni.length ; i++) {
			
			if(dni2.equalsIgnoreCase(dni[i])) {
				System.out.println("compra " + (i+1)  + ": " + dni[i] + " - " + instrument[i] + " - " + preu_instrument[i]);
				total += preu_instrument[i];
			}
		}
		//mostrem el total d'aquest client
		System.out.println();
		System.out.println("Resultat : " + dni2 + " - " + total);
	}

}
