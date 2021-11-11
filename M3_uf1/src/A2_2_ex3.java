import java.util.Scanner;

public class A2_2_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("num = ");
		num = teclat.nextInt();
		
		if (num % 2 ==0) {
			System.out.println("multiple de 2");
		}
		if (num % 5 ==0) {
			System.out.println("multiple de 5");
		}
		if (num%2!=0&&num%5!=0){
		 System.out.println("no és multiple de cap");
		}
	}

}
