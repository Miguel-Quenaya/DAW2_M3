import java.util.Scanner;
public class A2_2_ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char lletra;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("lletra = ");
		lletra = teclat.next().charAt(0);
		
		
		if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u') {
			System.out.print("es una vocal");
		}
		else {
			System.out.print("es una consonant");
		}
	}

}
