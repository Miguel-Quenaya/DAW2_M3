

import java.util.Scanner;

public class Ecadenando {
	
	static boolean casoDePrueba(Scanner sc) {
		
		if(!sc.hasNext()) {
			return false;
		}
		String palabras = sc.nextLine();
		
		String[] parts = palabras.split(" ");
		for(int i = 0 ; i <parts.length; i++) {
			if(i < parts.length -1) {
				
				int lon = parts[i].length();
				
				if(!(parts[i].substring(lon -2, lon).equalsIgnoreCase(parts[i+1].substring(0, 2)))) {
					System.out.println("NO");
					return true;
				}
			}
		}
		System.out.println("SI");
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while (casoDePrueba(sc));

	}

}
