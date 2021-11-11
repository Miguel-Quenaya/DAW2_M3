import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1_repas {
static int buscar(String fichero) {
		
		int suma = 0;	
		try {
			Scanner sc=new Scanner(new File(fichero));

			while (sc.hasNextInt()) {
			
			int num =sc.nextInt();

			suma += num;
			}
			
			sc.close();
			System.out.println(suma);
		}catch(FileNotFoundException e){
			System.out.println("error");
		}
		
		return(suma);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String nom;
		int suma;
		
		System.out.println("nom del fitxer");
		nom = sc.next();
		suma = buscar(nom);
		System.out.println(suma);

	}

}
