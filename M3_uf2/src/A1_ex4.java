import java.util.Scanner;
public class A1_ex4 {
	static boolean primer(int num) {
		boolean loes = true;
		for(int i = 2 ; i < num-1 ; i++) {
			if(num%i==0) {
				loes = false;
			}
			
		}
		return (loes);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("n = ");
		n = teclat.nextInt();
		
		if(primer(n)) {
			System.out.println("el numero es primer");
		}
		else {
			System.out.println("el numero no es primer");
		}
		for(int j = 2 ; j < n-1 ; j++) {
			if(primer(j)) {
				System.out.println(j);
			}
		}
		
	}

}
