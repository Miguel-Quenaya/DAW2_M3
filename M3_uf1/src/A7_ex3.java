
public class A7_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriu = {
				{3,5,6,7,8},
				{2,4,5,7,9},
				{1,4,0,7,3},
				{2,5,6,8,4}		
		};
		int suma = 0;
		
		for(int i = 0 ; i < matriu.length ; i++) {
			System.out.println();
			for ( int j = 0 ; j < matriu[i].length ; j++) {
				System.out.print(matriu[i][j] + " ");
			}
		}
		System.out.println();
		for(int i = 0 ; i < matriu.length ; i++) {
			for(int j = 0 ; j< matriu[i].length ; j++) {
				if(i==0 || i==(matriu.length-1)) {
					suma += matriu [i][j]; 
					System.out.println(matriu[i][j]);
				}
				if(i!=0 && i!=(matriu.length-1)) {
					if(j==0 || j == matriu.length) {
						suma += matriu[i][j];
						System.out.println(matriu[i][j]);
					}
				}
			}
		}
		System.out.println(suma);
		
	}

}
