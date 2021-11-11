import java.util.Scanner;

public class A2_ex1 {
	static void introduir_compres(String[] dni, String[] instrument, double[] preus) {
			Scanner teclat = new Scanner (System.in);
			for ( int i = 0 ; i < dni.length ; i++) {
			
			System.out.println("DNI = ");
			dni[i] = teclat.next();
			
			System.out.println("instrument = ");
			instrument[i] = teclat.next();
			
			System.out.println("preu = ");
			preus[i] = teclat.nextDouble();
		}
	}
	
	static void mostrar_compres(String[] dni, String[] instrument, double[] preus) {
			for ( int i = 0 ; i < dni.length ; i++) {
						
				System.out.println("compra " + (i+1)  + ": " + dni[i] + " - " + instrument[i] + " - " + preus[i]);
			}
	}
	
	static int preu_major(double[] preus) {
		int preu_major=0;
		double grande=0;
		for ( int i = 0 ; i < preus.length ; i++) {
			
			if(preus[i] > grande) {
				grande = preus[i];
				preu_major = i;
			}
		}
		return(preu_major);
	}
	
	static void mostrar_compra(int posició,String[] dni, String[] instrument, double[] preus ) {
		System.out.println("compra " + (posició+1)  + ": " + dni[posició] + " - " + instrument[posició] + " - " + preus[posició]);
	}
	
	static boolean existeix_dni(String dni, String[] dnis) {
		Scanner teclat = new Scanner (System.in);
		boolean encontrado = false;
		System.out.println("DNI del client que volem = ");
		dni = teclat.next();
		
		for( int i = 0 ; i < dnis.length ; i++) {
			if(dni.equalsIgnoreCase(dnis[i])) {
				encontrado = true;
			}
		}
		return(encontrado);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] dni, instrument;
		double [] preu_instrument;
		int num_compradors, posició;
		//variables para buscar un dni y su total
		String dni2="";
		boolean encontrado = false;
		double total = 0;
		//variable para encontrar el mas grande
		double grande = 0;
		Scanner teclat = new Scanner (System.in);
		
		//Preguntamos el num de compradores con la condicion que tiene que ser como minimo 3, y lo guardamos en la variable
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
		introduir_compres(dni, instrument, preu_instrument);
		
		//Mostrem totes les compres fetes
		mostrar_compres(dni, instrument, preu_instrument);
		
		
		System.out.println();
		posició = preu_major (preu_instrument);
		System.out.println("posicio de la compra més gran = " +  posició);
		
		//Mostrem tot de la compra més gran
		mostrar_compra(posició, dni, instrument, preu_instrument);
		System.out.println( "Compra/es més gran :");
		
		
		//Creamos una espacio para que se vea mejor
		System.out.println();
		
		//intoduïr un dni i buscarlo , si no el trobem, mostrar error i tornar a preguntar el dni
		encontrado = existeix_dni(dni2, dni);
		System.out.println(encontrado);
		
		
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
