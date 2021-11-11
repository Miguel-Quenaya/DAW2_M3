import java.util.Scanner;

public class A1_ex8 {
	
	static int gran (int a, int b, int c) {
		int gran=a;
		
		if(a>b&&a>c) {
			gran=a;
		}
		if(b>a&&b>c) {
			gran=b;
		}
		if(c>b&&c>a) { 
			gran=c;
		}
		
		return (gran);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("num 1");
		a = teclat.nextInt();
		System.out.println("num2");
		b = teclat.nextInt();
		System.out.println("num3");
		c = teclat.nextInt();
		
		System.out.println("num més gran = " + gran(a,b,c));
	}

}
