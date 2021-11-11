import java.util.Scanner;

public class problemac {
	
	static void casoDePrueba(Scanner sc) {
		
		
		String palabras = sc.nextLine();
		
		String[] parts = palabras.split(" ");
		
		
		if(parts[0].equalsIgnoreCase(parts[parts.length -1])) {
			System.out.println("TAUTOLOGIA");
		}else {
			System.out.println("NO TAUTOLOGIA");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numc =Integer.parseInt(sc.nextLine());
		for(int i = 0 ; i< numc ; i++) {
			casoDePrueba(sc);
		}
			
	}
}