import java.util.Scanner;

public class A2_2_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2,num3,petit=0,gran=0;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("num1 = ");
		num1 = teclat.nextDouble();
		
		System.out.print("num2 = ");
		num2 = teclat.nextDouble();
		
		System.out.print("num3 = ");
		num3 = teclat.nextDouble();
		
		gran=num1;
		petit = num3;
		
		if (num2>=num1||num3>=num1) {
			gran =num2;
			if(num3>=num2) {
				gran=num3;
			}
		}
		if(num2<=num3||num1<=num3) {
			petit= num2;
			if(num1<=num2) {
				petit=num1;
			}
		}
		
		System.out.println("gran = " + gran);
		System.out.println("petit = " + petit);
	}

}
