import java.util.Arrays;
import java.util.Scanner;

public class A6_v_ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a, b;
		int n,num;
		boolean noval = false,repetit = false;
		Scanner teclat = new Scanner (System.in);
		System.out.println("quants numeros ?");
		n = teclat.nextInt();
		a = new int [n];
		b = new int [n];
		for (int i = 0 ; i < n ; i++) {
			do {
				System.out.println("numero = " );
				num = teclat.nextInt();
				for(int j = 0 ; j < n ; j++) {
					if(num==a[j]) {
						repetit = true;
					}
				}
				if(repetit) {
					noval=true;
					System.out.println("error, numero repetit");
				}
				if (num<=0) {
					noval=true;
					System.out.println("error, ha de ser mejor que 0");
				}
				if(!repetit&&num>0) {
					a[i]=num;
					b[i]=a[i];
					noval=false;
				}
				repetit=false;
			}while(noval);
			
		}
		Arrays.sort(b);
		System.out.println("vector a");
		for ( int i = 0 ; i < n ; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Vector b");
		for ( int i = 0 ; i < n ; i++) {
			System.out.println(b[i]);
		}

	}

}
