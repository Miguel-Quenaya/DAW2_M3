import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A9 {
	
static void buscar() {
		
		
		//contador de fila que empieza por una para que no salga como fila 0 la primera fila
		int contadorfila = 0;
		String [] vector=  new String[1];
		try {
			Scanner teclat = new Scanner (System.in);
			//scanner sobre el fichero creado
			Scanner sc=new Scanner(new File("persones.txt"));
			//mismo do while par ael formato de fecha
			
			
			//mientras haya otra linia
			while (sc.hasNextLine()) {
				String linia=sc.nextLine();
			if(contadorfila == 0) {
				 vector = new String[Integer.parseInt(linia)];
			}else {
				vector[contadorfila - 1] = linia;
			}
			contadorfila++;
			}
			for(int i = 0 ; i < vector.length ; i++) {
				System.out.println(vector[i]);
			}
			
			sc.close();
		}catch(FileNotFoundException e){
			System.out.println("error");
		}
		//si no se encuentra de muestra -1
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buscar();
	}

}
