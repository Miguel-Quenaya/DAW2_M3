
import java.util.Scanner;

// Problema 338 https://www.aceptaelreto.com/problem/statement.php?id=338
public class ProblemaB{
	
	static boolean casoDePrueba(Scanner teclado) {
		int tx = teclado.nextInt(), ty = teclado.nextInt();
		
		if (tx == 0  &&  ty == 0) {
			return false;
		}
		else {
			char[][] circuito = new char[tx][ty];
			int sortidaI = 0, sortidaJ = 0;
			
			for (int i = 0;  i < tx;  i++) {
				for (int j = 0;  j < ty;  j++) {
					circuito[i][j] = teclado.next().charAt(j);
					if (circuito[i][j] == 'O') {
						sortidaI = i;
						sortidaJ = j;
					}
				}
			}
			
			for (int i = 0;  i < tx;  i++) {
				System.out.println();
				for (int j = 0;  j < ty;  j++) {
					System.out.print(circuito[i][j]);
				}
			}
			// recorremos una vuelta del circuito0
			boolean meta = false;
			int girsDreta = 0, girsEsquerra = 0;
			int i = sortidaI, j = sortidaJ;
			int ultimaI = sortidaI, ultimaJ = sortidaJ;	// per no anar cap enrera
			
//			do {
//				if (circuito[i-1][j] != '.'  &&  i-1 != ultimaI) {	// la pista va cap a dalt 	puede ser que vaya recto hacia arriba o acabe de girar a la derecha o a la izquierda
//					if (circuito[i+1][j] == '.') {  		// ha girado si la casilla inferior a i no tiene pista
//						if (circuito[i][j+1] != '.') {
//							girsDreta++;
//						} else {
//							girsEsquerra++;
//						}
//					}
//					if (circuito[i-1][j] != 'O') {
//						meta = true;
//					}
//					ultimaI = i;
//					i--;	// movem la posició un casella cap amunt
//				} 
//				
//				else if (circuito[i][j+1] != '.'  &&  j+1 != ultimaJ) {	// la pista va una casella cap a la dreta	-> por haver girat venint de dalt o d'abaix
//					if (circuito[i][j-1] == '.') {		// ha girat
//						if (circuito[i-1][j] != '.') { // ve de dalt, ha girat a l'esquerra
//							girsEsquerra++;
//						} else {						//ve de baix, ha girat a la dreta
//							girsDreta++;
//						}
//					}
//					if (circuito[i][j+1] == 'O') {
//						meta = true;
//					}
//					ultimaJ = j;
//					j++;
//				} 
//					
//				else if (circuito[i+1][j] != '.'  &&  i+1 != ultimaI) {  	// la pista va una casella cap abaix
//					if (circuito[i-1][j] == '.') {		//si no ve de dalt ha girat
//						if (circuito[i][j-1] != '.') {
//							girsDreta++;
//						} else {
//							girsEsquerra++;
//						}
//					}
//					if (circuito[i+1][j] == 'O') {
//						meta = true;
//					}
//					ultimaI = i;
//					i++;
//				} 
//				
//				else {	//circuito [i][j-1]			<-- la pista va cap a l'esquerra
//					if (circuito[i][j+1] == '.') { 
//						if (circuito[i-1][j] != '.') {		// ve de dalt, ha girat a la dreta
//							girsDreta++;
//						} else {
//							girsEsquerra++;
//						}
//					}
//					if (circuito[i][j-1] == '0') {
//						meta = true;
//					}
//					ultimaJ = j;
//					j--;
//				}
//			} while (!meta);
			
			System.out.println(girsEsquerra + " " + girsDreta);
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while (casoDePrueba(teclado));
		teclado.close();
	}

}
