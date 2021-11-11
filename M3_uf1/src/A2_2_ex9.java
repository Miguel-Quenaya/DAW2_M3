import java.util.Scanner;

public class A2_2_ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anys;
		double soua;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("anys = ");
		anys = teclat.nextInt();
		soua = 40000;
		if (anys>=10) {
			soua = soua * 1.1;
		}
		if (anys<10&&anys>=5) {
			soua = soua * 1.07;
		}
		if (anys<5&&anys>=3) {
			soua = soua * 1.05;
		}
		if (anys<3) {
			soua = soua * 1.03;
		}
		System.out.print("sou que li correspon = " + soua);
	}
		

}
