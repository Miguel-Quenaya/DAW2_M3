import java.util.Scanner;

public class A2_2_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,p,s,t;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("num1 = ");
		num1 = teclat.nextInt();
		
		System.out.print("num2 = ");
		num2 = teclat.nextInt();
		
		System.out.print("num3 = ");
		num3 = teclat.nextInt();
		
		p=num1;
		s=num2;
		t=num3;
		
		if(num3<=num1||num2<=num1) {
			p=num2;
			if(num3<=num2) {
				p=num3;
			}
		}

		if(num2>=num3||num1>=num3) {
			t=num2;
			if(num1>=num3) {
				t=num1;
			}
		if((p==num2||p==num3)&&(t==num2||t==num3)) {
			s=num1;
		}
		if((p==num1||p==num3)&&(t==num1||t==num3)) {
			s=num2;
		}
		if((p==num2||p==num1)&&(t==num2||t==num1)) {
			s=num3;
		}
		}
		System.out.println(p);
		System.out.println(s);
		System.out.println(t);
		
	}

}
