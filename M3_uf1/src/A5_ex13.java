import java.util.Scanner;
public class A5_ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("num =");
		num = teclat.nextInt();
		
		while (num<0) {
			System.out.print("incorrecte, ha de ser un positiu");
			System.out.print("num =");
			num = teclat.nextInt();
		}
		for (int i = num-1 ; i>=0 ; i--) {
			System.out.println(i);
			if(num%i==0) {
				System.out.print("divisor més gran = " + i);
				i= -1;
			}
		}
	}

}
