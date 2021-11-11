import java.util.Scanner;

public class Sudokus {
	static boolean ComprobarRotacion(String[][] sudoku, String[][] rotado) {
		//comporbamos si es simetrico
		for(int i = 0; i < sudoku.length ; i++) {
			
			for(int j = 0; j < sudoku[i].length ; j++) {
				if(sudoku[i][j].equalsIgnoreCase("-")){
					if(!rotado[i][j].equalsIgnoreCase("-")) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	static void casoDePrueba(Scanner sc) {
		//Creación matriz con medidas de un sudoku
		String [][] sudoku = new String[9][9];
		//contador para saber cuantos numeros hay
		int numeroscont = 0;
		//controlador index para obtener los caracteres del string recibido
		int index = 0;
		
		//Guardamos en matriz los datos introducidos y aprovechamos para controlar la cantidad de numeros introducidos
		for(int i = 0; i < sudoku.length ; i++) {
			String entrada = sc.next();
			index = 0;
			for(int j = 0; j < sudoku[i].length ; j++) {
				sudoku[i][j] = entrada.substring(index, index + 1);
				if(!sudoku[i][j].equalsIgnoreCase("-")) {
					numeroscont++;
				}
				
				index ++;
			}
		}
		
		//si hay mas de 32 numeros devolvemos "NO"
		if(numeroscont > 32) {
			System.out.println("NO");
		}else {
			//Si no creamos matriz para guardar el sudoku rotado 180 grados
			String [][] rotado = new String[9][9];
			int fil = 0, col = 0;
			for(int i = sudoku.length-1; i >= 0 ; i--) {
				col = 0;
				for(int j = sudoku[i].length-1; j >= 0 ; j--) {
					
					rotado[fil][col] = sudoku[i][j];
					col++;
				}
				fil++;
			}
			//Llamamos a la funcion para comprobar si es simetrico
			boolean simetrico = ComprobarRotacion(sudoku, rotado);
			
			//Imprimimos "SI" o "NO" depende de si es simetrico
			if(simetrico) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// Usuario AceptaElReto: teilor
		Scanner sc = new Scanner(System.in);
		int numCasos = sc.nextInt();
		
		for(int i = 0 ; i < numCasos ; i++) {
			casoDePrueba(sc);
		}
	}

}
