

import java.util.Scanner;

public class problemab {
	
	static boolean casoDePrueba(Scanner sc) {
		String palabras = sc.nextLine();
		if(palabras.equalsIgnoreCase(".")) {
			sc.close();
			return false;
		}
		int contv=0,conti=0;
		
		String[] parts = palabras.split(" ");
		for(int i = 0 ; i <parts.length; i++) {
			if(parts[i].equalsIgnoreCase("A")) {
				contv++;
				conti++;
			}else if(parts[i].equalsIgnoreCase("V")) {
				contv++;
			}else if(parts[i].equalsIgnoreCase("I")) {
				
				
				conti++;
			}
		}
		if(contv > conti) {
			System.out.println("VERANO");
		}else if(conti > contv) {
			System.out.println("INVIERNO");
		}else {
			System.out.println("EMPATE");
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while (casoDePrueba(sc));

	}

}
