import java.util.Scanner;

public class problemae {
	
	static boolean casoDePrueba(Scanner teclado) {
		int n = teclado.nextInt();
		if (n == 0) {
			return false;
		}
		else {
			int vecesSenal = 0;
			int temperatura;
			int tempAnterior = 41;
			int grande=0;
			boolean otrase�al = false;
			boolean otrase�al2 = false;
			for (int i = 0;  i < n;  i++) {
				temperatura = teclado.nextInt();
				
				if (temperatura <= 4 && !otrase�al) {
					vecesSenal++;
					otrase�al = true;
				}
				else if(otrase�al) {
					if(temperatura >6) {
						otrase�al2 = true;
					}else if(otrase�al2) {
						if(temperatura <= 4) {
							vecesSenal++;
							otrase�al2 = false;
						}
					}
					
					
				}
				
				
			}
			System.out.println(vecesSenal);
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while (casoDePrueba(teclado));
		teclado.close();
	}

}
