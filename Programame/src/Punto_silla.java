import java.util.Scanner;

public class Punto_silla {
	static boolean buscar(short a,short b,short[][] matriu) {
		boolean grande=true, pequeño=true;
		
		for(short i = 0;i < matriu[a].length ;i++) {
			System.out.print(matriu[a][i]);
			if(matriu[a][b] < matriu[a][i] && grande) {
				grande =false;
				
			}
		}
		System.out.println();
		for(short i = 0;i < matriu.length ;i++) {
			System.out.println(matriu[i][b]);
			if(matriu[a][b] > matriu[i][b] && pequeño) {
				pequeño =false;
			
			}
		}
		System.out.println(grande);
		System.out.println(pequeño);
		if((grande && pequeño) || (!grande && !pequeño)) {
			return true;
		}else {
			return false;
		}
	}
	
	static boolean casoDePrueba(Scanner sc) {
		short numx = sc.nextShort(),numy = sc.nextShort();
		
		if(numx == 0 && numy ==0) {
			return false;
		}else {
			boolean encontrado = false;
			short [][] matriu = new short[numx][numy];
			for(short i = 0;i < matriu.length ;i++) {
				for(short j = 0 ; j< matriu[i].length ; j++) {
					matriu[i][j] = sc.nextShort();
				}
			}
			for(short i = 0;i < matriu.length ;i++) {
				for(short j = 0 ; j< matriu[i].length ; j++) {
					encontrado = buscar(i,j,matriu);
					if (encontrado) {
						System.out.println("SI");
						return true;
					}
				}
			}
			System.out.println("NO");
			return true;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while (casoDePrueba(sc));
	}

}
