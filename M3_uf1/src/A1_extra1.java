import java.util.Scanner;
public class A1_extra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mpg,km;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("mpg = ");
		mpg = teclat.nextDouble();
		km=  235.21 / mpg;
		
		
		System.out.print(mpg + " mpg = " + km + " L/100Km");
	}

}
