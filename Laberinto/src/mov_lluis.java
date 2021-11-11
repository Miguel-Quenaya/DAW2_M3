import java.util.Scanner;

public class mov_lluis {

static void mostrarResultats(String [][] totalResultats){
		
		
		for (int i = 0;  i < totalResultats.length;  i++) {
			for (int j = 0;  j < totalResultats[i].length;  j++) {
				System.out.print(totalResultats [i][j] + " ");
				}
				System.out.println(""); 
			}
	}
	
	static String [][] acumularResultats (String [] resultatPartida) {
		String[][] totalResultats = new String [2][3];
		
		for (int i = 0;  i < totalResultats.length;  i++) {
			for (int j = 0;  j < totalResultats[i].length;  j++) {
				if (totalResultats[i][j] == null) {
					totalResultats[i][j] = resultatPartida[i];
				}

			}
		}
		//dubtes: com controlem que no entri sempre a la primera fila?? 
		//Es reinicia la matriu cada cop que sortim del mètode?
		//Si ho controlem amb una variable que acumuli les files plenes, no tornarà a 0 quan sortim del mètode?
		
		return totalResultats;
	}
	
	static String[] guardarResultats (int comptadorMoviments, int grandariaLaberint, boolean finalPartida) {
		String[] resultats = new String [3];
		
		//omplim el vector amb els resultats
		
		//nivell
		if (grandariaLaberint == 9) {
			resultats[0] = "Nivell: Fàcil";
		}
		else if (grandariaLaberint == 12) {
			resultats[0] = "Nivell: Mitjà";
		}
		else {
			resultats[0] = "Nivell: Difícil";
		}
		
		//total de moviments
		resultats[1] = "Moviments: " + Integer.toString(comptadorMoviments);
		
		//ha arribat a la sortida
		if (finalPartida) {
			resultats [2] = "Has arribat a la sortida";
		}
		
		else {
			resultats [2] = "Has acabat abans d'hora";
		}
		
		return (resultats);
	}
    
    static void juga(Scanner teclat, String[][] laberint) {
        int comptadorMoviments = 0;
        String moviment;
        boolean finalPartida = false;
        int i, j; //indexs per moure al pepito
        boolean volSortir = false;
        String[] resultatPartida;
        
        System.out.println("COMANDAMENTS DEL JOC");
        System.out.println("w: pujar");
        System.out.println("s: baixar");
        System.out.println("a: esquerra"); 
        System.out.println("d: dreta");
        System.out.println("q: sortir");
        
        //situem en Pepito a la posició inicial
        laberint[1][0] = "☻";
        
        i = 1;
        j = 0;
        
        while (!finalPartida && !volSortir) {
        	comptadorMoviments++;
        	
        	for (int f = 0;  f < laberint.length; f++) {
                for (int c = 0;  c < laberint[f].length; c++) {
                    System.out.print(laberint[f][c]);
                }
                System.out.println();
            }
        	
        	moviment = teclat.next();
        	
        	if (moviment.equalsIgnoreCase("w")) {
        		if (i-1 < laberint.length) {
        			if (laberint[i-1][j] == " ") {
        				laberint[i-1][j] = "☻";
                        laberint[i][j] = " ";
                        i--;
        			}
        			finalPartida = laberint[i-1][j].equalsIgnoreCase("♥"); 
        		}
        	}
        	if (moviment.equalsIgnoreCase("s")) {
        		finalPartida = laberint[i+1][j].equalsIgnoreCase("♥");
        		if (finalPartida) {
                    laberint[i][j] = " ";
                    laberint[i+1][j] = "☻";
        		}
        		if (i+1 < laberint.length) {
        			if (laberint[i+1][j] == " ") {
        				laberint[i+1][j] = "☻";
                        laberint[i][j] = " ";
                        i++;
        			}
        		}
        	}
        	if (moviment.equalsIgnoreCase("a")) {
        		finalPartida = laberint[i][j-1].equalsIgnoreCase("♥"); 
        		if (finalPartida) {
                    laberint[i][j] = " ";
        		}
        		if (j-1 < laberint.length) {
        			if (laberint[i][j-1] == " ") {
        				laberint[i][j-1] = "☻";
                        laberint[i][j] = " ";
                        j--;
        			}
        			
        		}
        	}
        	if (moviment.equalsIgnoreCase("d")) {
        		finalPartida = laberint[i][j+1].equalsIgnoreCase("♥"); 
        		if (finalPartida) {
                    laberint[i][j] = " ";
                    laberint[i][j+1] = "☻";
        		}
        		if (j+1 < laberint.length) {
        			if (laberint[i][j+1] == " ") {
        				laberint[i][j+1] = "☻";
                        laberint[i][j] = " ";
                        j++;
        			}
        		}
        	}
        	volSortir = moviment.equalsIgnoreCase("q");
        	for (int f = 0;  f < laberint.length; f++) { //clar que no hi havia manera que es mostrés l'ültim moviment: en acabar partida
                for (int c = 0;  c < laberint[f].length; c++) { //ja no tornava a imprimir la matriu, pq es fa al principi del bucle
                    System.out.print(laberint[f][c]);
                }
                System.out.println();
        	}
        }
      System.out.println("CONGRATS!!****");
    
    }
        
        
        
        
    static void triarNivell(Scanner teclat) {
        int opcioNivell;
        String[][] laberintFacil =
                         {{"█", "█", "█", "█", "█", "█", "█", "█", "█"},
                          {"☻", " ", " ", " ", " ", " ", "█", " ", "█"},
                          {"█", " ", "█", "█", "█", "█", "█", " ", "█"},
                          {"█", " ", " ", " ", "█", " ", "█", " ", "█"},
                          {"█", " ", "█", "█", "█", " ", "█", " ", "█"},
                          {"█", " ", " ", " ", " ", " ", " ", " ", "█"},
                          {"█", " ", "█", "█", "█", " ", "█", " ", "█"},
                          {"█", " ", "█", " ", " ", " ", "█", " ", "█"},
                          {"█", "█", "█", "█", "█", "█", "█", "♥", "█"}};
        
        String[][] laberintDificil =
        	{{"█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█"},
        	 {"█", "☻", " ", " ", "█", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "█", "█"},
        	 {"█", "█", "█", " ", "█", " ", "█", "█", "█", "█", "█", " ", "█", "█", "█", "█", "█", "█", "█", "█", " ", "█", "█"},
        	 {"█", "█", " ", " ", "█", " ", " ", " ", " ", " ", "█", " ", " ", " ", " ", " ", " ", " ", " ", "█", " ", "█", "█"},
        	 {"█", "█", " ", "█", "█", "█", "█", " ", "█", "█", "█", "█", "█", "█", " ", "█", "█", "█", "█", "█", " ", "█", "█"},
        	 {"█", "█", " ", " ", "█", " ", " ", " ", " ", " ", " ", " ", "█", " ", " ", " ", " ", " ", " ", "█", " ", "█", "█"},
        	 {"█", "█", "█", " ", "█", " ", "█", "█", " ", "█", "█", "█", "█", "█", "█", "█", "█", "█", " ", "█", " ", "█", "█"},
        	 {"█", "█", " ", " ", "█", " ", "█", " ", " ", " ", "█", " ", " ", " ", " ", " ", " ", " ", " ", "█", " ", "█", "█"},
        	 {"█", "█", " ", "█", "█", " ", "█", " ", "█", " ", "█", " ", "█", "█", "█", "█", "█", "█", "█", "█", " ", "█", "█"},
        	 {"█", "█", " ", "█", " ", " ", " ", " ", "█", " ", "█", " ", " ", "█", " ", " ", " ", " ", " ", "█", " ", "█", "█"},
        	 {"█", "█", " ", "█", " ", "█", "█", "█", "█", "█", "█", "█", " ", "█", "█", "█", " ", "█", " ", "█", "█", "█", "█"},
        	 {"█", "█", " ", " ", " ", " ", " ", " ", "█", " ", " ", " ", " ", " ", " ", " ", " ", "█", " ", " ", " ", " ", "♥"},
        	 {"█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█", "█"}};
                          
        System.out.println("TRIA UN NIVELL DE DIFICULTAT"); 
        System.out.println("1-FÀCIL");
        System.out.println("2-MITJÀ");
        System.out.println("3-DIFÍCIL");
        opcioNivell = teclat.nextInt();
        switch (opcioNivell) {
            case 1:
                juga(teclat, laberintFacil);
                break;
        /*    case 2:
                juga(teclat, laberintMitja);
                break;
            case 3:
                juga(teclat, laberintDificil);
                break; */
        }
    }
    
    static int cridarMenu(Scanner teclat) {
         int opcioMenu;
         int partidesJugades = 0;
         
         if (partidesJugades == 2) { //Partides máximes del jugador
        	 System.out.println("Fi de les teves partides. INSERT COIN");
         }
         else {
        	 System.out.println("MENU");
             System.out.println("1-Jugar partida");
             System.out.println("2-Resultats partides");
             System.out.println("3-Sortir");
             opcioMenu = teclat.nextInt();
             
             switch (opcioMenu) {
                 case 1:
                     triarNivell(teclat);
                     partidesJugades++;
                     break;
                 case 2:
                    // mostrarResultats();
                     break;
                 case 3:
                     System.out.println("Fi de la partida");
             }
         }
         return (partidesJugades);
    }
    
    public static void main(String args[]) {
     //VARIABLES
     Scanner teclat = new Scanner (System.in);
     int partidesJugades = 0;
     
     //cridem el menú mentre el jugador no hagi esgotat el màxim de partides
     while (partidesJugades < 2) {
    	 partidesJugades = cridarMenu(teclat);
     }
     
      
    }
}