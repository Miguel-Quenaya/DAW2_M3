import java.util.Scanner;

public class Escacs {
	
	static void casoDePrueba(Scanner sc) {
		int [][] tablero = {{7,7,7,7,7,7,7,7},
							{7,9,9,9,9,9,9,7},
							{7,9,11,11,11,11,9,7},
							{7,9,11,13,13,11,9,7},
							{7,9,11,13,13,11,9,7},
							{7,9,11,11,11,11,9,7},
							{7,9,9,9,9,9,9,7},
							{7,7,7,7,7,7,7,7}
				
			};
		String pos = sc.next();
		
		int posi=Integer.parseInt(pos.substring(1,2)), posy=0;
		String letras = "abcdefgh";
		char lletra = pos.charAt(0);
		for (int i = 0;  i < 8;  i++) {
			if (lletra == letras.charAt(i)) {
				posy = i;
				
			}
		}
		//System.out.println(tablero.length + " " + tablero[0].length);
		System.out.println(tablero[posi - 1][posy]);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		for (int i = 0 ; i< num ; i++) {
			casoDePrueba(sc);
		}
	}

}
