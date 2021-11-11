import java.util.Scanner;

public class A1_ex6 {
	static boolean multiplede2 (int num){
		boolean multiple=false ;
		
		if(num%2==0) {
			multiple = true;
		}
		return (multiple);
	}
	static boolean multiplede5 (int num){
		boolean multiple=false ;
		
		if(num%5==0) {
			multiple = true;
		}
		return (multiple);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("num = ");
		num = teclat.nextInt();
		if(multiplede2(num)) {
			System.out.println("es multiple de 2");
		}
		else {
			System.out.println(" no es multiple de 2");
		}
		if( multiplede5(num)){
			System.out.println("es mupltiple de 5");
		}
		else {
			System.out.println("no es multiple de 5");
		}
	}

}
