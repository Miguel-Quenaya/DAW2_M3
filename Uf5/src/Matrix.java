import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// usuario acepta el reto : teilor
		Scanner sc = new Scanner(System.in);
		int medida = 0;
		do{
			//leemos primer valor para las medidas de la matriz, si el valor es = 0 no hacemos nada y salimos del bucle
			medida = sc.nextInt();
			if(medida != 0) {
				int[][] matriz = new int[medida][medida];
				//leemos los valores y rellenamos la matriz
				for(int i = 0; i < medida ; i++) {
					for(int j = 0; j < medida ; j++) {
						matriz[i][j] = sc.nextInt();
					}
				}
				//si la funcion de comprobación nos devuelve true imprimimos "SI" y en caso contrario imprimimos "no"
				if(comprobación(matriz)) {
					System.out.println("SI");
				}else {
					System.out.println("NO");
				}
			}
			
		}while(medida != 0);
		

	}
	/**
	 * funcion para comprobar si la diagonal principal de una matriz cuadrada son todos 1 y el resto 0
	 * devolvera true si cumple los requisitos y en caso contrario devolvera false
	 * @param matriz
	 * @return
	 */
	static boolean comprobación(int[][] matriz) {
		for(int i = 0; i < matriz.length ; i++) {
			for(int j = 0; j < matriz.length ; j++) {
				//comprobación que devolvera false si en la diagonal (i=J) hay un valor que no se aun 0
				//o si en el resto hay un valor que no sea 0
				if((i==j && matriz[i][j] != 1) || (i!=j && matriz[i][j]!=0)) {
					return false;
				}
			}
		}
		return true;
	}

}
