import java.util.Scanner;

public class A5_ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num1,contador = 0;
		int digito;
		String largo;
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("num = ");
		num = teclat.nextInt();
		System.out.print("digito =");
		digito = teclat.nextInt();
		largo = Integer.toString(num);
		num1 = largo.length();
		
		for (int i = 0; i< num1;i++) {
			if(num%10==digito) {
				contador++;
			}
			num = num/10;
			
		}
		System.out.print(contador);
	}

}
