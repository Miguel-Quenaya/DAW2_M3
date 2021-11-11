import java.util.Scanner;

public class problemag {
	
	static void caso(Scanner sc) {
		int numn = sc.nextInt();
		int nums = sc.nextInt();
		int nump = sc.nextInt();
		int numk = sc.nextInt();
		int finalnum =0;
		if(numn%2==0) {
			finalnum = numn /2;
		}else {
			finalnum= ((numn-1)/2)+1;
		}
		
		int [] vector = new int[numn];
		
		for(int i = 0 ; i < vector.length;i++) {
			
			vector[i] = 1;
		}
		
		int j=0;
		int kill =0;
		do {
			j +=numk;
			if(j>vector.length-1) {
				System.out.println("entro");
				j = j - (vector.length-1);
			}
			vector[j] = 0;
			kill++;
		}while(kill<finalnum);
		for(int i = 0 ; i < vector.length;i++) {
			System.out.println(vector[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("P");
		int numc = sc.nextInt();
		for(int i = 0 ; i <numc;i++) {
			caso(sc);
		}
	}

}
