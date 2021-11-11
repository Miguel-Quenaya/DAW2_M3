import java.util.Scanner;

public class A6_v_ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, num;
		int [] vector;
		boolean oletu=false;
		Scanner teclat = new Scanner (System.in);
		System.out.println("n =");
		n = teclat.nextInt();
		vector = new int [n];
		System.out.println(" num=");
		num= teclat.nextInt();
		
		for(int i = 0 ; i < vector.length ; i++) {
			System.out.println("num posició " + i );
			vector[i] = teclat.nextInt();
			}
		for(int i = 0 ; i < vector.length ; i++) {
			if(vector[i]==num) {
				oletu=true;
			}
		}
		if(oletu) {
			System.out.println("apareix");
		}
	}

}
