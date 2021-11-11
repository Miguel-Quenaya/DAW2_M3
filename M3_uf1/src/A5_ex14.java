import java.util.Scanner;

public class A5_ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("num = ");
		num = teclat.nextInt();
		
		while(num<1||num>10) {
			System.out.println("Incorrecte, ha de ser un número entre 1 i 10");
			System.out.println("num = ");
			num = teclat.nextInt();
			}
		
		for(int i = 0 ; i <=10 ; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		}

}
