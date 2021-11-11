import java.util.Scanner;

public class ActA2_Compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner (System.in);
		int dimensioVectors;
		int i;
		int[] vectorA, vectorB;
		
		//DIMENSIONAR VECTORS
		System.out.println("Quants nombres vols entrar?");
		dimensioVectors = teclat.nextInt();
		vectorA = new int [dimensioVectors];
		vectorB = new int [dimensioVectors]; //En aquest cas A i B tindran la mateixa mida
		
		//ENTRA DADES VECTOR A
		for (i = 0; i < vectorA.length; i++) {
			System.out.println("Omple la casella " + i);
			vectorA[i] = teclat.nextInt();
			vectorB[i] = vectorA[i]; //Copiem les dades d'A a B. Així, quan tractem les dades de B no modificarem les del vector A
		}
		
		//ORDENEM LES DADES DEL VECTOR B
		for (int k = 0; k < dimensioVectors-1; k++) {
            for (i = 0; i < dimensioVectors-1-k; i++) {
                if (vectorB [i] > vectorB [i+1]) {
                    int aux;
                    aux=vectorB[i];
                    vectorB[i] = vectorB[i+1];
                    vectorB[i+1] = aux;
                    System.out.println("bucle2--if");
                    
                }
               System.out.println("bucle2");
            }
            System.out.println("bucle1");
		}
		
		System.out.println("Nombres ordenats: ");
		
		for (i = 0; i < dimensioVectors; i++) {
			System.out.println(vectorB[i]);
		}
		

	
		teclat.close();
	}

}
