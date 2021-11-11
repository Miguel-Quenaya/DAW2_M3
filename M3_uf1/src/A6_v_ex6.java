import java.util.Scanner;

public class A6_v_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [5],b;
		int parells=0;
		Scanner teclat = new Scanner (System.in);
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("num = ");{
				a[i]= teclat.nextInt();
				if(a[i]%2==0) {
					parells++;
				}
			}
		}
		b = new int [parells];
		int c = 0;
		for(int j = 0 ; j < a.length ; j++) {
			if(a[j]%2==0) {
				b[c]=a[j];
				System.out.println(b[c]);
				c++;
				
			}
		}

	}

}
