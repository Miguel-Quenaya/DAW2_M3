import java.util.Arrays;
import java.util.Scanner;

public class Poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String numeros[] = new String[4];
		String numero = "";
		String palo = "";
		boolean paloencontrado = false;
		boolean mismopalo = true;
		int contador = 0;
		do {
			
			numero = sc.next();
			
			if(!numero.equalsIgnoreCase("0")) {
				if(!paloencontrado) {
					palo = sc.next();
					paloencontrado = true;
				}else if(!sc.next().equalsIgnoreCase(palo)){
					
					mismopalo = false;
				}
				
				numeros[contador] = numero;
				contador++;
				
				if(contador == 4) {
					contador = 0;
					paloencontrado = false;
					
					if(mismopalo) {
						String resultado = comprobacion(numeros);
						System.out.println((resultado.equalsIgnoreCase("-")) ? "NADA" :resultado + " " + palo );
					}else {
						System.out.println("NADA");
					}
					
				}
			}
			
		}while(!numero.equalsIgnoreCase("0"));

	}
	
	static String comprobacion(String[] numeros) {
		
		String[] escalera = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0; j < escalera.length ; j++) {
				if(numeros[i].equalsIgnoreCase(escalera[j])) {
					escalera[j] = "-";
				}
				//System.out.print(escalera[j]);
			}
		}
		boolean escaleraon = false, huecoencontrado = false ,paloaceptado = false;
		int contador = 0;
		String valor = "";
		for(int j = 0; j < escalera.length ; j++) {
			if(escalera[j].equalsIgnoreCase("-")) {
				escaleraon = true;
				contador++;
			}
			if(huecoencontrado && !escalera[j].equalsIgnoreCase("-")) {
				//System.out.println(escalera[j]);
				
				return "-";
			}
			if(escaleraon && !escalera[j].equalsIgnoreCase("-")) {
				huecoencontrado = true;
				valor = escalera[j];
			}
			
			
			if(contador == 4) {
				if(huecoencontrado) {
					return valor;
				}else if(j == escalera.length -1) {
					return escalera[j-4];
				}
				else  {
					return escalera[j+1];
				}
			}
		}
		
		return "-";
	}

}
