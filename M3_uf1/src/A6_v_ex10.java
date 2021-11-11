import java.util.Scanner;

public class A6_v_ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] resto = new int [23];
		String [] letra = {"T","R", "W", "A", "G", "M", "Y", "F", "P", "D", "X" , "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		int residu, dni;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("dni");
		dni = teclat.nextInt();
		
		for (int i = 0 ; i < resto.length ; i++) {
			resto[i]=i;
		}
		residu = dni%23;
		
		System.out.print( "DNI = " + dni);
		for(int i = 0 ; i < resto.length ; i++) {
			if(residu==resto[i]) {
				System.out.print(letra[i]);
			}
		}
		
		
	}

}
