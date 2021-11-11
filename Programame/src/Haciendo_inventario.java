import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Haciendo_inventario {
	
	static boolean casoDePrueba(Scanner sc) {
		int casos = Integer.parseInt(sc.nextLine());
		
		if(casos == 0 ) {
			sc.close();
			return false;
		}
		else {
			int contador = 0;
			String [] vector = new String[casos];
			ArrayList<String> lista = new ArrayList<String>();
			for(int i = 0 ; i < vector.length ; i++) {
				vector[i] = sc.nextLine().toLowerCase();
				if(lista.isEmpty()) {
					lista.add(vector[i]);
					contador++;
				}else if(!lista.contains(vector[i])){
					lista.add(vector[i]);
					contador++;
				}
				
			}
			
			System.out.println(contador);
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while(casoDePrueba(sc));
	}

}
