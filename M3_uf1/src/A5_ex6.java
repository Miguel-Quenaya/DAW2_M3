import java.util.Scanner;
public class A5_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,fi=0;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("a = ");
		a = teclat.nextInt();
		System.out.print("b = ");
		b = teclat.nextInt();
		
		for (int i = 0; i < b ; i++) {
			fi+=a;
		}
		System.out.print(fi);
	}

}
