import java.util.Scanner;
public class A5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclat = new Scanner (System.in);
		 System.out.print("num =");
		 num = teclat.nextInt();
		 String xifres = Integer.toString(num);
		 
		 System.out.print(num + " té " + xifres.length() + " xifres");
	}

}
