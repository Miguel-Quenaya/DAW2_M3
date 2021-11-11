import java.util.Scanner;
public class A2_2_ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2;
		char lletra=0;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("num1 = ");
		num1 = teclat.nextDouble();
		System.out.print("num2 = ");
		num2 = teclat.nextDouble();
		System.out.print("lletra = ");
		lletra = teclat.next().charAt(0);
		
		while (lletra != 's' && lletra != 'r' && lletra != 'm' && lletra != 'd') {
			System.out.print("error, reintenta");
			System.out.print("lletra = ");
			lletra = teclat.next().charAt(0);
		}
		if (lletra == 's') {
			System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		if (lletra == 'r') {
			System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
		}
		if (lletra == 'm') {
			System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		if (lletra == 'd') {
			System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
		}
	}

}
