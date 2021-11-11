import java.util.Scanner;

public class A6_v_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated metd stub
		int [] numeros = new int [10];
		int pos=0, neg=0,suman=0, sumap=0;
		double mitjan, mitjap;
		Scanner teclat = new Scanner (System.in);
		
		for(int i = 0 ; i< numeros.length ; i++) {
			System.out.println("num = ");
			numeros[i] = teclat.nextInt();
			if(numeros[i]>=0) {
				pos++;
				sumap+=numeros[i];
			}
			else {
				neg++;
				suman+=numeros[i];
			}
		}
		
		mitjap=sumap / pos;
		mitjan = suman / neg;
		
		System.out.println("mitja dels positius = " + mitjap);
		System.out.println("mitja dels negatius = " + mitjan);
	}

}
