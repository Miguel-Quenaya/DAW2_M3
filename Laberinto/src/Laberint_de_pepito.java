import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class Laberint_de_pepito {
	
	//funcion que muestra el mapa
	static void mostrar_mapa(String[][] matriu) {
		for(int i = 0 ; i < matriu.length;i++) {
			System.out.println();
			for (int j = 0 ; j < matriu[i].length ; j++) {
				System.out.print(matriu[i][j]);
			}
		}
	}
	
	//Funcion que hace de menu y devuelve la opcion elegida
	static int menu(Scanner teclat) {
		int respuesta = 0;
		do {
			System.out.println("1-Jugar partida");
			System.out.println("2-Resultats partidas");
			System.out.println("3-Sortir");
			System.out.println("opcion =");
			respuesta = teclat.nextInt();
			
			if(respuesta < 1 || respuesta > 3) {
				System.out.println("Error");
			}
			
		}while(respuesta < 1 || respuesta > 3);
		
		return(respuesta);
	}
	
	//funcion que pregunta el nombvre de jugadro y lo devuelve, tambien hay la opcion de salir completamente introduciendo la q
	static String jugador_nombre(Scanner teclat) {
		String nombre;
		System.out.println("[ Pulsa Q si quieres salir.]");
		System.out.println("Nombre jugador =");
		nombre = teclat.next();
		
		return(nombre); 
	}
	
	//funcion que pregunta el numero de partidas que quiere , con un maximo de 10, y devolviendo la decision.
	static int limite_partidas (Scanner teclat) {
		int numpartidas =0;
		
		do {
			System.out.println("Límite de partidas (Max 10)= ");
			numpartidas = teclat.nextInt();
		}while(numpartidas < 0 || numpartidas > 10);
		
		return(numpartidas);
	}
	
	//funcion que crea el fichero donde escribe los resultados
	static void fichero_resultados(int [] controladores, int nivel, String jugador) {
		int nummov = 0, gana =0;
		String puntuacion;
		
		
		for(int i = 0 ; i < controladores.length ; i++) {
			if(i == 0) {
				//la primera celda del vector es si el jugador gana o pierde y lo guardamos para despues utilizar
				gana = controladores[i];
			}
			if(i == 1) {
				//la segunda celda del vector es el numero de movimientos que ha hecho y lo guardamos para despues utilizar
				nummov = controladores[i];
			}
			
		}
		
		try {
            //creacion fichero
            File archivo = new File("resultados.txt");

            //metodo para escribir
            FileWriter escribir = new FileWriter(archivo, true);
            
            if(gana ==1) {
            	//si la variable gana es 1 es victoria
            	puntuacion = "Victoria";
            }
            else {
            	//si no es derrota
            	puntuacion = "Derrota";
            }
 
            //escribimos en el ficher lo siguente.
            escribir.write("Jugador: " + jugador + " Nivel:" + nivel + " " + puntuacion + "  Número de movimientos : " + nummov);
            escribir.write("\r\n"); 
            

            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
	}
	
	//funcion para mostrar resultados
	static void mostrar_resultados() {
		try {
			Scanner sc=new Scanner(new File("resultados.txt"));
			
			//mostrar todo el contenido del fichero en linias
			while (sc.hasNextLine()) {
				
			String s=sc.nextLine();
			
			System.out.println(s);
			}
			sc.close();
			
		}catch (Exception e) {
            System.out.println("Error al escribir");
        }
	}
	
	//funcion que hara de menu de seleccion de nivel y devuleve lo elegido.
	static int eleccion_nivel(Scanner teclat) {
		int nivel;
		
		do {
			
			System.out.println("1-Nivel Facil");
			System.out.println("2-Nivel Intermedio");
			System.out.println("3-Nivel Dificil");
			System.out.println("0-SALIR");
			System.out.println("Eleccion =");
			nivel = teclat.nextInt();
		}while (nivel<0 || nivel > 3);
		return(nivel);
	}
	
	//funcion que pasara el mapa del nivel seleccionado al main
	static String [][] obtener_mapa(int eleccion){
		String[][] mapa = {{""},{""}};
		String [][] nivel1 = {
				{"█","█","█","█","█","█","█","█"},
				{"█","☺","█"," "," "," "," ","█"},
				{"█"," ","█"," ","█","█","█","█"},
				{"█"," "," "," "," "," ","█","█"},
				{"█"," ","█"," ","█"," "," ","█"},
				{"█"," ","█"," ","█"," ","█","█"},
				{"█"," "," "," ","█"," "," ","♥"},
				{"█","█","█","█","█","█","█","█"}
		};
		
		String [][] nivel2 = {
				{"█","█","█","█","█","█","█","█","█","█","█","█"},
				{"█"," "," "," "," "," "," "," ","█","☺","█","█"},
				{"█","█"," ","█","█"," ","█","█","█"," ","█","█"},
				{"█","█"," ","█"," "," "," "," "," "," ","█","█"},
				{"█"," "," ","█"," ","█","█","█","█","█","█","█"},
				{"█","█","█"," "," "," "," "," "," ","█","█","█"},
				{"█","█","█"," ","█","█"," ","█","█","█","█","█"},
				{"█","█","█"," "," "," "," "," "," ","█","█","█"},
				{"█","█"," "," ","█","█","█","█"," "," "," ","█"},
				{"█","█"," ","█","█","█","█","█"," ","█"," ","█"},
				{"█","█"," ","█","█"," "," "," "," ","█"," ","█"},
				{"█","█"," ","█","█","█","█","█","█","█"," ","█"},
				{"█","█"," "," "," "," "," "," "," ","█"," ","█"},
				{"█","█","█"," ","█","█","█","█"," ","█"," ","█"},
				{"█","█","█"," ","█","█","█","█"," ","█"," ","█"},
				{"█","█","█"," ","█","█"," "," "," ","█"," ","█"},
				{"█","█"," "," ","█","█"," ","█","█","█"," ","█"},
				{"█","█","█","█","█"," "," ","█"," "," "," ","█"},
				{"█","█","█","♥"," "," ","█","█","█","█","█","█"},
				{"█","█","█","█","█","█","█","█","█","█","█","█"}
		};
		
		String [][] nivel3 = {
				{"█","█","█","█","█","█","█","█","█","█","█","█","█","█","█","█"},
				{"█","☺"," "," "," "," "," ","█","█","█"," ","█","█","█","█","█"},
				{"█","█","█"," ","█","█"," ","█"," "," "," ","█","█"," ","█","█"},
				{"█","█","█"," ","█","█"," "," "," ","█"," "," "," "," ","█","█"},
				{"█","█","█"," ","█","█"," ","█"," ","█","█","█"," ","█","█","█"},
				{"█","█","█"," ","█"," "," ","█"," "," "," "," "," ","█","█","█"},
				{"█","█"," "," ","█"," ","█","█","█","█"," ","█"," ","█","█","█"},
				{"█","█"," ","█","█"," ","█","█","█","█","█","█"," "," ","█","█"},
				{"█"," "," ","█"," "," "," ","█"," "," "," ","█","█"," ","█","█"},
				{"█"," ","█","█"," ","█"," ","█"," ","█"," ","█","█"," ","█","█"},
				{"█"," "," "," "," ","█"," "," "," ","█"," ","█","█"," ","█","█"},
				{"█","█","█"," ","█","█","█"," ","█","█"," "," ","█"," "," ","█"},
				{"█","█","█"," ","█","█","█"," ","█","█","█"," ","█","█","█","█"},
				{"█"," "," "," ","█","█","█"," "," "," ","█"," "," "," ","█","█"},
				{"█"," ","█"," "," ","█","█","█","█"," ","█","█","█"," ","█","█"},
				{"█"," ","█","█"," ","█"," "," "," "," ","█","█","█"," ","█","█"},
				{"█","█","█","█"," ","█"," ","█","█","█"," "," "," "," ","█","█"},
				{"█","█"," "," "," ","█"," ","█","█","█"," ","█","█"," ","█","█"},
				{"█","█"," ","█","█","█","█","█"," "," "," ","█"," "," ","█","█"},
				{"█"," "," ","█","█"," "," "," ","█","█","█"," "," "," ","█","█"},
				{"█","█","█","█"," "," ","█"," "," "," ","█","█"," ","█","█","█"},
				{"♥"," "," "," "," ","█","█","█","█"," "," "," "," ","█","█","█"},
				{"█","█","█","█","█","█","█","█","█","█","█","█","█","█","█","█"}
		};
		
		//si eleccion de nivel se pasara el mapa 1 (nivel1), si eleccion nivel es 2 se pasara mapa2 ...
		switch(eleccion) {
		case 1 : mapa = nivel1;
		break;
		case 2: mapa = nivel2;
		break;
		case 3: mapa = nivel3;
		break;
		}
		
		return (mapa);
	}
	
	//funcion permite al jugador jugar (hacer los movimientos) , devuelve si gana o pierde y el numero de movimientos
	static int [] movimiento(String [][] matriu, Scanner teclat) {
		//variables posicioni/j represntan la posición del jugador (☺), num_mov es el contador de los movimientos y gana sera 1 si llega al final.
		int posicioni=0,posicionj=0,num_mov=0, gana=0;
		
		//boolean para saber si gana
		boolean victoria = false;
		
		//este vector sera lo que devolvemos, la primera celda sera si gana o pierde (1=gana y 0=pierde) y la segunda sera el numero de movimientos.
		int [] controladores = {0,0};
		
		//String mov para guardar lo que el jugador introduce (el movimiento) y aux nos ayudara para hacer el intercambio (movimiento)
		String mov="",aux="";
		
		//do while mientras el jugador no introduce "q" o gane.
		do {
			
			//buscamos la posicion del jugador (☺) y la guardamos
			for(int i = 0 ; i < matriu.length ;i++) {
				for(int j = 0 ; j < matriu[i].length ; j++) {
					if (matriu[i][j].equalsIgnoreCase("☺")) {
						posicioni=i;
						posicionj=j;
					}
				}
			}
			
			//esperamos respuesta del jugador
			mov = teclat.next();
			
			//si introduce "S" 
			if(mov.equalsIgnoreCase("S")) {
				for(int i = 0 ; i < matriu.length ;i++) {
					for(int j = 0 ; j < matriu[i].length ; j++) {
						
						//si lo que hay debajo del jugador esta el ♥ , victoria sera true y sumamos al contador de movimientos 1
						if ((i==posicioni&&j==posicionj)&& matriu[i+1][j].equalsIgnoreCase("♥")) {
							victoria = true;
							num_mov++;
						}
						
						//si lo que hay debajo del jugador es no es pared (█) y no es ♥.
						if ((i==posicioni&&j==posicionj)&& !matriu[i+1][j].equalsIgnoreCase("█")&& !matriu[i+1][j].equalsIgnoreCase("♥")) {
							//intercambiamos al jugador con lo que hay debajo (un espacio)
							aux=matriu[i][j];
							matriu[i][j] = matriu[i+1][j];
							matriu[i+1][j]= aux;
							//sumamos al contador de movimientos 1
							num_mov++;
						}
					}
				}
				
				//si aun no es victoria mostrar mapa
				if(!victoria) {
					mostrar_mapa(matriu);
				}
			}
			
			//A continuacion seria totalmente lo mismo con w, a y d, pero con w seria lo de encima, a con lo del lado izquierdo y d con lo del lado derecho.
			if(mov.equalsIgnoreCase("W")) {
				for(int i = 0 ; i < matriu.length ;i++) {
					for(int j = 0 ; j < matriu[i].length ; j++) {
						if ((i==posicioni&&j==posicionj)&& matriu[i-1][j].equalsIgnoreCase("♥")) {
							victoria = true;
							num_mov++;
						}
						if ((i==posicioni&&j==posicionj)&& !matriu[i-1][j].equalsIgnoreCase("█")&& !matriu[i-1][j].equalsIgnoreCase("♥")) {
							aux=matriu[i][j];
							matriu[i][j] = matriu[i-1][j];
							matriu[i-1][j]= aux;
							num_mov++;
						}
					}
				}
				if(!victoria) {
					mostrar_mapa(matriu);
				}
			}
			if(mov.equalsIgnoreCase("a")) {
				for(int i = 0 ; i < matriu.length ;i++) {
					for(int j = 0 ; j < matriu[i].length ; j++) {
						if ((i==posicioni&&j==posicionj)&& matriu[i][j-1].equalsIgnoreCase("♥")) {
							victoria = true;
							num_mov++;
						}
						if ((i==posicioni&&j==posicionj)&& !matriu[i][j-1].equalsIgnoreCase("█")&& !matriu[i][j-1].equalsIgnoreCase("♥")) {
							aux=matriu[i][j];
							matriu[i][j] = matriu[i][j-1];
							matriu[i][j-1]= aux;
							num_mov++;
						}
					}
				}
				if(!victoria) {
					mostrar_mapa(matriu);
				}
			}
			if(mov.equalsIgnoreCase("d")) {
				for(int i = 0 ; i < matriu.length ;i++) {
					for(int j = 0 ; j < matriu[i].length ; j++) {
						if ((i==posicioni&&j==posicionj)&& matriu[i][j+1].equalsIgnoreCase("♥")) {
							victoria = true;
							num_mov++;
						}
						if ((i==posicioni&&j==posicionj)&& !matriu[i][j+1].equalsIgnoreCase("█")&& !matriu[i][j+1].equalsIgnoreCase("♥")) {
							aux=matriu[i][j];
							matriu[i][j] = matriu[i][j+1];
							matriu[i][j+1]= aux;
							num_mov++;
						}
						
					}
				}
				if(!victoria) {
					mostrar_mapa(matriu);
				}
			}
			
			//si introduce q mensjae de saliste
			if(mov.equalsIgnoreCase("q")) {
				System.out.println("Saliste");
			}
			
			//si victoria es true mensjae de ganaste.
			if(victoria) {
				
				System.out.println("GANASTE!");
				//y a la varibale gana le damos = 1.
				gana=1;
			}
		}while(!mov.equalsIgnoreCase("q") && !victoria);
		
		//guardar si gana o pierde y el numero de movimientos en el vector en su lugar correspondinte
		for(int i = 0; i < controladores.length ; i++) {
			if(i==0) {
				controladores[i] = gana;
			}
			if(i == 1) {
				controladores[i] = num_mov;
			}
		}
		return(controladores);
	}

	public static void main(String[] args) {
		
		Scanner teclat = new Scanner (System.in);
		//int repuesta par ala repsuesta del menu, int eleccion para guardar la eleccion de nivel, numpartidas para definir el limite de partidas
		//y para ir controlando cuando se acaben este numero de partidas.
		int respuesta , eleccion, numpartidas;
		//Vector int para guardar si gana o pierde i el numero de movimientos que nos da la funcion de movimiento (jugando)
		int[] controladores = {0,0};
		//String para guardar el nombre del jugador
		String jugador="";
		//Vector String para guardar el mapa del nivel seleccionado
		String [][] nivel ;
		
		//do while que nos ira preguntando el nombre del jugador y el juego proceda mientras que ni pulse la "q".
		do {
			
			//llamar a la función que nos devuelve el nombre del jugador y guardarlo.
			jugador = jugador_nombre(teclat);
			
			//si el jugador no pulsa "q" .
			if(!jugador.equalsIgnoreCase("q")) {
				
				//llamar  a la función quennos devuelve el numero de partidas que quiere jugar y guardarlo.
				numpartidas = limite_partidas(teclat);
				
				
				do {
					
					//llamar a la función que nos devuelve la decisión del menu y guardarlo.
					respuesta = menu(teclat);
					
					//si la decisión es "1" y el numero de partidas no llego a 0.
					if (respuesta == 1 && numpartidas != 0) {
						
						//do while mientras el numero de partidas no llego a 0 y en la eleccionde nivel el jugador no decide salir (opcion "0").
						do {
							
							//llamar a la funciónque nos devuelve la eleccion de nivel. (tambien puede decidir salir)
							eleccion = eleccion_nivel(teclat);
							
							//si el jugador no decide salir (opcion "0").
							if(eleccion != 0) {
								
								//llamar a la función para obtener el mapa del nivel seleccionado y guardarlo.
								nivel = obtener_mapa(eleccion);
								
								//llamar a la función que nos muestra el mapa al inciar.
								mostrar_mapa(nivel);
								
								//llamar a la funcion que nos devuelve si el jugador llego al final del laberinto y cuantos movimientos ha hecho.
								controladores =movimiento(nivel, teclat);
								
								//llamar a la funcion que crea el archivo txt donde se guarda los resultados.
								fichero_resultados(controladores, eleccion , jugador);
								
								//restar 1 al numero de partidas.
								numpartidas--;
								
							}
						}while(numpartidas != 0 && eleccion != 0);
							
					}
					
					//si el jugador decide jugar y tengo el numero de partidas a 0.
					if(respuesta == 1 && numpartidas == 0) {
						
						//mostrar mensaje de que llego al limite de partidas
						System.out.println("Llegaste al límite de partidas !");
					}
					
					//si respuesta de menu es 2 
					if(respuesta == 2) {
						
						//llamar a la funcion que nos muestra los resultados
						mostrar_resultados();
					}
					
					//si respuesta de menu es 3
					if(respuesta == 3) {
						
						//mostrar mensaje de despedida al jugador .
						System.out.println("HASTA PRONTO " + jugador + "!!");
					}
				} while(respuesta!=3);
			}
			//si pulsa q
			if(jugador.equalsIgnoreCase("q")) {
				
				//mostrar mensaje de saliendo del juego
				System.out.println("Saliendo del Juego...");
				System.out.println("Completado.");
			}
		} while(!jugador.equalsIgnoreCase("q"));
		
		
			
	}

}
