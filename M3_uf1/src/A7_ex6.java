import java.util.Scanner;
public class A7_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner (System.in);
		
		boolean magica = true;
		int num = 0, suma = 0, sumacompa = 0;
		int[][] m;
		m = new int [3][3];
		
		for(int i = 0;i < m.length;i++) {
			for(int j = 0;j < m[i].length;j++) {
				do {
					System.out.println("Ingresa numero [" + i + "][" + j + "] :");
					num = teclat.nextInt();
					if (num < 1 || num > 9) {
						System.out.println("Incorrecto");
					}
				} while (num < 1 || num >9);
				m[i][j] = num;
			}
			
			
		}
		for(int i = 0 ; i < m.length ; i++) {
			System.out.println();
			for ( int j = 0 ; j < m[i].length ; j++) {
				System.out.print(m[i][j] + " ");
			}
		}
		
		for(int i = 0;i < m.length;i++) {
			for(int j = 0;j < m[i].length;j++) {
				if (i==0) {
					sumacompa = sumacompa + m[i][j];
					suma = sumacompa;
				}
				if (i!=0) {
					suma = suma + m[i][j];
				}
			}
			if (sumacompa != suma) {
				magica = false;
			}
			suma = 0;
		}
		System.out.println();
		suma = 0;
		sumacompa = 0;
		for(int i = 0;i < m.length;i++) {
			System.out.println();
			for(int j = 0;j < m[i].length;j++) {
				if (i==0) {
					sumacompa = sumacompa + m[j][i];
					suma = sumacompa;
				}
				if (i!=0) {
					suma = suma + m[j][i];
				}
			}
			if (sumacompa != suma) {
				magica = false;
			}
			suma = 0;
		}
		
		suma= 0;
		sumacompa= 0;
		System.out.println();
		for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(i==j){
                    sumacompa += m[i][j];
                }
                 
                if(i+j == m.length-1){
                    suma += m[i][j];
                }
            }
        }
		if(sumacompa != suma) {
			magica = false;
		}
		System.out.println(magica);

	}

}
