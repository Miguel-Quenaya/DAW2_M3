import java.util.Scanner;
public class AA2 {

	public static void main(String[] args) {
		//booleanos , "cotxe" para cuando el parking de coches este lleno , "moto" lo mismo con el parking de motos 
		// y exit para seguir preguntando hasta que diga "exit"
		boolean cotxe=false, moto=false, exit=false;
		//matrizes para simular cada parking
		String [][] pcotxes, pmotos;
		//String para guardar la respuesta
		String respuesta;
		//int para saber el numero de filas/columnas de cada parking
		int ncotxe, nmoto;
		//contadores para calcular el porcenatje 
		double contc=0, contm=0, ccont=0, mcont=0;
		//variables para guardar cada porcentaje
		double porcc, porcm ;
		
		Scanner teclat = new Scanner (System.in);
		
		
		//Preguntar el num de filas/columnas de cada matriz
		System.out.println("ncotxes = ");
		ncotxe = teclat.nextInt();
		System.out.println("nmotos = ");
		nmoto = teclat.nextInt();
		
		pcotxes = new String [ncotxe][ncotxe];
		pmotos = new String [nmoto][nmoto];
		
		
		//Rellenar cada celda con un "O" para que se pueda ver bien el parking. 
		//"O" Significa un plaça de parking vacia
		for (int i = 0 ; i < pcotxes.length ; i ++) {
			for ( int j = 0 ; j < pcotxes[i].length ; j++) {
				//tambien contamos el num de plaças que hay para calcular el porcentaje
				ccont++;
				pcotxes[i][j] = "O";
			}
		}
		for (int i = 0 ; i < pmotos.length ; i ++) {
			for ( int j = 0 ; j < pmotos[i].length ; j++) {
				//tambien contamos el num de plaças que hay para calcular el porcentaje
				mcont++;
				pmotos[i][j] = "O";
			}
		}
		
		
		
		//Enseñamos cada parking 
		System.out.println();
		System.out.println("__PARKING DE COTXES__");
		for (int i = 0 ; i < pcotxes.length ; i ++) {
			for ( int j = 0 ; j < pcotxes[i].length ; j++) {
				System.out.print(pcotxes[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("__PARKING DE MOTOS__");
		for (int i = 0 ; i < pmotos.length ; i ++) {
			for ( int j = 0 ; j < pmotos[i].length ; j++) {
				System.out.print(pmotos[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		//Como siempre he utilizado un do while para ir preguntando mientras el boolean "exit" sea falso
		System.out.println();
		do {
			
			//preguntamos que entra , opciones cotxe, moto y exit
			System.out.println("Quin tipus de vehicle és ?");
			respuesta = teclat.next();
			
			
			//cuando ponga "cotxe" haremos lo siguiente
			if(respuesta.equalsIgnoreCase("cotxe")) {
				System.out.println();
				
				//como vamos asignando las plaças en orden, miramos si la ultima plaça esta ocupada(Que contenga una "X")
				//si esta ocuapda ponemos el booleano "cotxe" true , lo que significara que esta lleno
				if (pcotxes[pcotxes.length-1][pcotxes[1].length-1].equalsIgnoreCase("X")){
					cotxe=true;
				}
				
				//Si no esta lleno se le assignara la primera plaça libre
				if(!cotxe) {
					for (int i = 0 ; i < pcotxes.length ; i ++) {
						for ( int j = 0 ; j < pcotxes[i].length ; j++) {
							
							//cuando encuentre la primera plaça libre (="O")
							if (pcotxes[i][j].equalsIgnoreCase("O")) {
								//se informa que plaça se le a assignado
								System.out.println("numero de parking de cotxes assignat = [" + (i+1) + "][" + (j+1) + "]");
								
								//sumamos 1 al contador de coches que entran
								contc++;
								
								//a la celda que nos encontramos ponemos una X, que significara que esta ocuapdo
								pcotxes[i][j] = "X";
								
								//Hacemos que el bucle for se acabe y se cierre
								j = pcotxes[i].length -1;
								i = pcotxes.length-1;
							}
							
						}
					}
				}
				
				//si el booleano "cotxe" esta true informamos que esta lleno
				else {
					System.out.println("Parking de cotxes al 100%");
				}
				
			}
			
			
			//cuando ponga "moto" haremos lo mismo que hacemos cuando ponemos cotxe pero con la matriz(parking) de motos, vamos que seria lo mismos pasos
			if(respuesta.equalsIgnoreCase("moto")) {
				System.out.println();
				
				if(pmotos[pmotos.length-1][pmotos[1].length-1].equalsIgnoreCase("X")) {
					moto = true;
				}
				
				if(!moto) {
					for (int i = 0 ; i < pmotos.length ; i ++) {
						for ( int j = 0 ; j < pmotos[i].length ; j++) {
							if (pmotos[i][j].equalsIgnoreCase("O")) {
								System.out.println("numero de parking de motos assignat = [" + (i+1) + "][" + (j+1) + "]");
								contm++;
								pmotos[i][j] = "X";
								j = pmotos[i].length -1;
								i = pmotos.length-1;
							}
						}
					}
				}
				else {
					System.out.println("Parking de motos al 100%");
				}
			}
			
			
			
			//Si no pone como respuesta cotxe, moto o exit mostrara el siguiente mensaje .
			if (!(respuesta.equalsIgnoreCase("cotxe") || respuesta.equalsIgnoreCase("moto") || respuesta.equalsIgnoreCase("exit"))) {
				System.out.println("opció incorrecta. Opcions = cotxe, moto o exit");
			}
			
			
			//si pone como respuesta "exit" , el booleano "exit" lo ponemos true. lo que hara salir del bucle
			if (respuesta.equalsIgnoreCase("exit")) {
				exit= true;
			}
			
			
		//vemos que si exit es true se sale del bucle	
		}while(!exit);
		
		
		//volvemos a enseñar como quedo cada parking
		System.out.println();
		System.out.println("__PARKING DE COTXES__");
		for (int i = 0 ; i < pcotxes.length ; i ++) {
			for ( int j = 0 ; j < pcotxes[i].length ; j++) {
				System.out.print(pcotxes[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("__PARKING DE MOTOS__");
		for (int i = 0 ; i < pmotos.length ; i ++) {
			for ( int j = 0 ; j < pmotos[i].length ; j++) {
				System.out.print(pmotos[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//calculamos los porcentajes 
		porcc = (contc/ccont) *100;
		porcm = (contm/mcont) * 100;
		
		
		//enseñamos los porcentajes
		System.out.println();
		System.out.println(String.format("%.2f", porcc) + "% del parking de cotxes ocupat " );
		System.out.println(String.format("%.2f", porcm) + "% del parking de motos ocuapt");
		
		teclat.close();
	}

}
