import java.util.Scanner;

public class problemag {
	
	static void casoDePrueba(String palabra) {
		
		int contador = 0;
		//Si tinc 3 lletres o més busco la cades RAV
		
		if(palabra.length() >= 3) {							
			//variable per posicionar dins la paraula
			int i=0;
			//mentre no arribi a final de parala segueixo buscant
			while (i< palabra.length()-2){
				if(!(palabra.substring(i,i+3).equalsIgnoreCase("RAV"))){
					i++;
				}
				else {
					//(palabra.substring(i,i+3).equalsIgnoreCase("RAV")) 
					contador++;
					if (i < palabra.length()-2) {
						String palabra2="";
						palabra2 += palabra.substring(0, i)  ;
						palabra2 += palabra.substring(i+3, palabra.length());
						
						palabra = palabra2;
						i=0;
					}
				}
			}
			System.out.print(contador);
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String palabra;
		
		while (sc.hasNext()) {
			System.out.println();
			palabra = sc.next();
			casoDePrueba (palabra);
		}
		sc.close();
	}

}
