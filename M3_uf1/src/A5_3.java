import java.util.Scanner;

public class A5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , suma=0;
		Scanner teclat = new Scanner(System.in);
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("num = ");
			num = teclat.nextInt();
			
			if(num%2==0) {
				i=10;
				num=0;
			}
			
			suma += num;
		}
		System.out.println(suma);
	}

}
