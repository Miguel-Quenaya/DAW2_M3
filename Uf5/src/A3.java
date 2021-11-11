import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		double[] array = new double[1];
		double suma = 0;
		
		//leemos fichero. guardamos en array y sumamos valores
		try {
			Scanner sc=new Scanner(new File("resultados.txt"));
			
			
			
			while (sc.hasNextDouble()) {
				
			double s=sc.nextDouble();
			if(i==0) {
				
				array = new double[(int)s];
			}
				
			if(i!=0) {
				
				array[i-1] = s;
				suma+=s;
				
			}
			i++;
			
			}
			sc.close();
			
		}catch (Exception e) {
            System.out.println(e);
        }
		double avg = suma / array.length;
		
		System.out.println("Average" + avg);
		Arrays.sort(array);
		double rest = 0,resbig = 0,lejano=0;
		for (double valor : array) {
			rest = valor -avg;
			if(rest < 0) {
				rest*= -1;
			}
			if (rest > resbig) {
				resbig = rest;
				lejano = valor;
			}
		}
		System.out.println("most distante value" + lejano);
		suma -= lejano;
		avg = suma /(array.length-1);
		System.out.println("new average" + avg);
		
		
		
	}

}
