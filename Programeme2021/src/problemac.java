import java.util.Scanner;

public class problemac {
	
	static boolean caso(Scanner sc) {
		int numd = sc.nextInt();
		if(numd == 0) {
			sc.close();
			return false;
		}
		int [] vector = new int[numd];
		int contador = 1;
		int grande =0, peque;
		int posg =0,posp;
		for(int i = 0 ; i < vector.length ; i++) {
			vector[i]=sc.nextInt();
			if(i==0) {
			
			}
			if(vector[i]>grande) {
				grande = vector[i];
				posg = i;
			}
		}
		
		System.out.println(contador);
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		while(caso(sc));
	}

}
