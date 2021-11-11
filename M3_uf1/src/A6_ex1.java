import java.util.Scanner;

public class A6_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, posi=0, negi=0;
		Scanner teclat = new Scanner (System.in);
		
		do {
			System.out.println("num = ");
			num = teclat.nextInt();
			
			if (num<0) {
				negi++;
			}
			if (num>0) {
				posi++;
			}
		}while(num!=0);
		System.out.println("positius = " + posi);
		System.out.println("negatius = " + negi);
	}

}
