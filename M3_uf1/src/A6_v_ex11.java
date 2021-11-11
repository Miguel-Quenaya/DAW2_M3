import java.util.Scanner;

public class A6_v_ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num , num2, numdigitos;
		int [] a , b;
		int aux;
		boolean palindrom=true;
		String numl;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("num =");
		num = teclat.nextInt();
		numl = Integer.toString(num);
		numdigitos = numl.length();
		
		a = new int [numdigitos];
		b = new int[numdigitos];
		for(int i = 0 ; i < a.length ; i++) {
			a[i]= num%10;
			num = num/10;
			b[i]=a[i];
		}
		for (int i=0; i<b.length/2; i++) {
            aux = b[i];
            b[i] = b[b.length-1-i];
            b[b.length-1-i] = aux;
        }
		
		for(int i = 0 ; i < b.length ; i++) {
			if(b[i]!=a[i]) {
				palindrom = false;
				i=b.length;
			
			}
		}
		
		if(palindrom) {
			System.out.println("ole");
		}
		else {
			System.out.println("FF");
		}
		for(int i= 0 ; i< b.length ; i++) {
			System.out.println(a[i] + "   " + b[i]);
		}
		
		
		
	}

}
