import java.util.Scanner;

public class AA1_vols {
	/*Funcion para buscar el numero de vuelos que tiene el origen*/
	static int numero_vols(int[][] vols, int origen) {
		int nvols=0;
		for (int i = 0 ; i < vols.length ;i++) {
			/*cuando sea igual a 0 se sumara al contador de numvuelos*/
			if(vols[origen][i] != 0) {
				nvols++;
			}
		}
		return (nvols);
	}
	/*funcion para rellenar la matriz*/
	static int [][] rellenar (Scanner sc){
		int[][] vols;
		int respuesta;
		System.out.println("N=");
		respuesta = sc.nextInt();
		
		vols = new int [respuesta][respuesta];
		
		for(int i = 0 ; i < vols.length ; i++) {
			for (int j = 0 ; j < vols[i].length ; j++) {
				System.out.println("posicion " + i + " - " + j);
				vols[i][j] = sc.nextInt();
			}
		}
		return(vols);
	}
	/*funcion para enseñar matriz*/
	static void mostrar (int [][] vols) {
		for(int i = 0 ; i < vols.length ; i++) {
			for (int j = 0 ; j < vols[i].length ; j++) {
				System.out.print(vols[i][j] + "  ");
			}
			System.out.println();
		}
	}
	/*funcion para el menu, devuelve la respuesta*/
	static int menu(Scanner sc) {
		int respuesta;
		do {
			System.out.println("1.Mostrar nombre de vols que surten d'aquesta ciutat");
			System.out.println("2. Veure ciutat on es fa escala a un destí (se li haurà de demanar el destí a l'usuari si escull aquesta opció)");
			System.out.println("3.Sortir");
			System.out.println("que vols fer ?");
			respuesta = sc.nextInt();
		}while(respuesta < 1 || respuesta >3);
		
		return(respuesta);
	}
	/*funcion para saber la escala mas buena */
	static void escalas(int[][]vols, int origen, int desti) {
		int nvector, j=0, petit=0;
		/*vectores paralelos para guardar cada escala con su tiempo*/
		int [] vectora, vectorb;
		/*utilizamos la funcion de buscar el numero de vuelos que tiene el origen para darle el tamaño a los vectores*/
		nvector = numero_vols(vols, origen);
		vectora = new int [nvector];
		vectorb = new int [nvector];
		
		/*si el origen tiene vuelo directo al destino se lo comunicamos con su tiempo*/
		if(vols[origen][desti] != 0) {
			System.out.println("no es necessari fer escala, temps = " + vols[origen][desti]);
		}
		/*si no tiene vuelo directo buscamos la mejor escala*/
		else {
			/*en el vector a guardamos ls ciudades con las que podemos hacer escala*/
			for (int i = 0 ; i < vols.length ;i++) {
				if(vols[origen][i] != 0) {
					vectora[j] = i;
					j++;
				}
				
			}
			/*en el vector b guardamos los tiempos*/
			for(int i = 0 ; i < vectora.length ; i++) {
				/*primero le damos el tiempo desde el origen a la primera posible escala*/
				vectorb[i] = vols[origen][vectora[i]];
				 /*segundo le sumamos el tiempo desde la primera escala al destino*/
				if(vols [vectora[i]][desti]==0) {
					/* si no hay vuelo le sumamos 9999*/
					vectorb[i] += 9999;
				}
				else {
					
					vectorb[i] += vols [vectora[i]][desti];
				}
				
			}
			/*buscamo la escala mas pequeña*/
			for(int i = 0 ; i < vectora.length ; i++) {
				if (i==0) {
					petit = vectorb[i];
					
				}
				if (i!=0) {
					if (vectorb[i] < petit) {
						petit = vectorb[i];
					}
				}
				
			}
			
			/*enseñamos la/s escala/s con el menor tiempo*/
			System.out.println();
			System.out.println("__ESCALA/S__");
			for(int i = 0 ; i < vectora.length ; i++) {
				if(vectorb[i] == petit) {
					System.out.println("Escala en ciutat " + vectora[i] + " amb un temps total de " + vectorb[i]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] vols ;
		int respuesta , nvols, origen, desti;
		Scanner sc = new Scanner (System.in);
		/*rellenar y mostrar matriz*/
		vols = rellenar(sc);
		mostrar(vols);
		
		do {
			respuesta = menu(sc);
			
			if(respuesta==1) {
				/*preguntamos origen y se lo pasamos a la funcion*/
				System.out.println("ciutat origen");
				origen = sc.nextInt();
				nvols = numero_vols(vols , origen);
				System.out.println("numero de vols = " + nvols);
			}
			if(respuesta == 2) {
				/*pregunatmos origen y destino y se lo pasamos a la funcion*/
				System.out.println("origen =");
				origen = sc.nextInt();
				System.out.println("desti = ");
				desti = sc.nextInt();
				
				escalas(vols, origen, desti);
			}
			System.out.println();
		}while(respuesta !=3);
		
	}

}
