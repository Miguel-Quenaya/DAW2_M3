import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class f {
	
	static void mostrar_mapa(String[][] matriu) {
		for(int i = 0 ; i < matriu.length;i++) {
			System.out.println();
			for (int j = 0 ; j < matriu[i].length ; j++) {
				System.out.print(matriu[i][j]);
			}
		}
	}
	
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
	
	static String jugador_nombre(Scanner teclat) {
		String nombre;
		System.out.println("[ Pulsa Q si quieres salir.]");
		System.out.println("Nombre jugador =");
		nombre = teclat.next();
		
		return(nombre); 
	}
	
	static int limite_partidas (Scanner teclat) {
		int numpartidas =0;
		
		do {
			System.out.println("Límite de partidas (Max 10)= ");
			numpartidas = teclat.nextInt();
		}while(numpartidas < 0 || numpartidas > 10);
		
		return(numpartidas);
	}
	
	static void fichero_resultados(int [] controladores, int nivel, String jugador) {
		int nummov = 0, gana =0;
		String puntuacion;
		
		
		for(int i = 0 ; i < controladores.length ; i++) {
			if(i == 0) {
				gana = controladores[i];
			}
			if(i == 1) {
				nummov = controladores[i];
			}
			
		}
		
		try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("C:\\Users\\mquen\\Desktop\\resultados_pepito\\resultados.txt");

            
            FileWriter escribir = new FileWriter(archivo, true);
            if(gana ==1) {
            	puntuacion = "Victoria";
            }
            else {
            	puntuacion = "Derrota";
            }
 
            escribir.write("Jugador: " + jugador + " Nivel:" + nivel + " " + puntuacion + "  Número de movimientos : " + nummov);
            escribir.write("\r\n"); 
            

            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
	}
	
	static void mostrar_resultados() {
		try {
			Scanner sc=new Scanner(new File("C:\\Users\\mquen\\Desktop\\resultados_pepito\\resultados.txt"));
			while (sc.hasNextLine()) {
			String s=sc.nextLine();
			//tratamiento de s, por ejemplo:
			System.out.println(s);
			}
			sc.close();
		}catch (Exception e) {
            System.out.println("Error al escribir");
        }
	}
	
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
	
	static int [] movimiento(String [][] matriu) {
		Scanner teclat = new Scanner (System.in);
		int posicioni=0,posicionj=0,num_mov=0, gana=0;;
		boolean victoria = false;
		int [] controladores = {0,0};
		
		String mov="",aux="";
		
		
		do {
			for(int i = 0 ; i < matriu.length ;i++) {
				for(int j = 0 ; j < matriu[i].length ; j++) {
					if (matriu[i][j].equalsIgnoreCase("☺")) {
						posicioni=i;
						posicionj=j;
					}
				}
			}
			mov = teclat.next();
			if(mov.equalsIgnoreCase("S")) {
				for(int i = 0 ; i < matriu.length ;i++) {
					for(int j = 0 ; j < matriu[i].length ; j++) {
						if ((i==posicioni&&j==posicionj)&& matriu[i+1][j].equalsIgnoreCase("♥")) {
							victoria = true;
							num_mov++;
						}
						if ((i==posicioni&&j==posicionj)&& !matriu[i+1][j].equalsIgnoreCase("█")&& !matriu[i+1][j].equalsIgnoreCase("♥")) {
							aux=matriu[i][j];
							matriu[i][j] = matriu[i+1][j];
							matriu[i+1][j]= aux;
							num_mov++;
						}
					}
				}
				if(!victoria) {
					mostrar_mapa(matriu);
				}
			}
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
			if(mov.equalsIgnoreCase("q")) {
				System.out.println("Saliste");
			}
			if(victoria) {
				
				System.out.println("GANASTE!");
				gana=1;
			}
		}while(!mov.equalsIgnoreCase("q") && !victoria);
		
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
		int respuesta , eleccion, numpartidas;
		int[] controladores = {0,0};
		String jugador="";
		String [][] nivel ;
		
		do {
			jugador = jugador_nombre(teclat);
			
			if(!jugador.equalsIgnoreCase("q")) {
				numpartidas = limite_partidas(teclat);
				
				
				do {
					
					respuesta = menu(teclat);
					
					if (respuesta == 1 && numpartidas != 0) {
						
						do {
							eleccion = eleccion_nivel(teclat);
							
							if(eleccion != 0) {
								nivel = obtener_mapa(eleccion);
								
								mostrar_mapa(nivel);
								
								controladores =movimiento(nivel);
								
								fichero_resultados(controladores, eleccion , jugador);
								numpartidas--;
								System.out.println(numpartidas);
								
							}
						}while(numpartidas != 0 && eleccion != 0);
							
					}
					
					if(respuesta == 1 && numpartidas == 0) {
						System.out.println("Llegaste al límite de partidas !");
					}
					
					if(respuesta == 2) {
						mostrar_resultados();
					}
				} while(respuesta!=3);
			}
		} while(!jugador.equalsIgnoreCase("q"));
		
		
			
	}

}
