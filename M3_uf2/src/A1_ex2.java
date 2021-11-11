import java.util.Scanner;
public class A1_ex2 {
	static void castella(String nombre) {
		System.out.println("Buenos dias " + nombre);
	}
	
	static void catala(String nom) {
		System.out.println("Bon dia " + nom);
	}
	
	static void angles (String name) {
		System.out.println("Good morning " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom, idioma;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("nom = ");
		nom = teclat.next();
		
		do {
			System.out.println("idioma (castella, catala o angles)= ");
			idioma = teclat.next();
			
			if(!(idioma.equalsIgnoreCase("castella") || idioma.equalsIgnoreCase("catala") || idioma.equalsIgnoreCase("angles"))) {
				System.out.println("incorrecto");
			}
		} while(!(idioma.equalsIgnoreCase("castella") || idioma.equalsIgnoreCase("catala") || idioma.equalsIgnoreCase("angles")));
		
		if(idioma.equalsIgnoreCase("castella")) {
			castella(nom);
		}
		if(idioma.equalsIgnoreCase("catala")) {
			catala(nom);
		}
		if(idioma.equalsIgnoreCase("angles")) {
			angles(nom);
		}
	}

}
