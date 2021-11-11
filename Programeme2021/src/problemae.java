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
			boolean otraseñal = false;
			boolean otraseñal2 = false;
			for (int i = 0;  i < n;  i++) {
				temperatura = teclado.nextInt();
				
				if (temperatura <= 4 && !otraseñal) {
					vecesSenal++;
					otraseñal = true;
				}
				else if(otraseñal) {
					if(temperatura >6) {
						otraseñal2 = true;
					}else if(otraseñal2) {
						if(temperatura <= 4) {
							vecesSenal++;
							otraseñal2 = false;
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
