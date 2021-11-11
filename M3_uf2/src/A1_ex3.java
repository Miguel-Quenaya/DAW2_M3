import java.util.Scanner;
public class A1_ex3 {
	static void castella(String nombre, String dia) {
		if(dia.equalsIgnoreCase("mati")) {
			System.out.println("Buenos dias " + nombre);
		}
		else {
			System.out.println("Buenas noches " + nombre);
		}
	}
	
	static void catala(String nom , String dia) {
		if(dia.equalsIgnoreCase("mati")) {
			System.out.println("Bon dia " + nom);
		}
		else {
			System.out.println("Bona nit " + nom);
		}
	}
	
	static void angles (String name, String day) {
		if(day.equalsIgnoreCase("mati")) {
			System.out.println("Good morning " + name);
		}
		else {
			System.out.println("Good night " + name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom, idioma, dia;
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
		
		do {
			System.out.println("estem de ... (mati o nit)");
			dia = teclat.next();
			
			if(!(dia.equalsIgnoreCase("mati") || dia.equalsIgnoreCase("nit"))) {
				System.out.println("incorrecto");
			}
		} while(!(dia.equalsIgnoreCase("mati") || dia.equalsIgnoreCase("nit")));
		
		if(idioma.equalsIgnoreCase("castella")) {
			castella(nom, dia);
		}
		if(idioma.equalsIgnoreCase("catala")) {
			catala(nom, dia);
		}
		if(idioma.equalsIgnoreCase("angles")) {
			angles(nom, dia);
		}
	}

}