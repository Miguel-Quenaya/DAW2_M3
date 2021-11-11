import java.util.Scanner;

public class Simplificame {
	
	static void casoprueba(Scanner sc) {
		double p = sc.nextDouble();
		double q = sc.nextDouble();
		double fip=0, fiq;
		
		String nump = String.valueOf(p);
		String numq = String.valueOf(q);
		
		String repetido = "";
		
			if(nump.substring(0,1).equalsIgnoreCase(numq.substring(0,1))||nump.substring(0,1).equalsIgnoreCase(numq.substring(1,2))) {
				repetido = nump.substring(0,1);
			}else if (nump.substring(1,2).equalsIgnoreCase(numq.substring(0,1))||nump.substring(1,2).equalsIgnoreCase(numq.substring(1,2))) {
				repetido = nump.substring(1,2);
			}
			
			if(nump.substring(0,1).equalsIgnoreCase(repetido)){
				fip = Double.parseDouble(nump.substring(1,2));
			}else {
				fip = Double.parseDouble(nump.substring(0,1));
			}
			
			if(numq.substring(0,1).equalsIgnoreCase(repetido)){
				fiq = Double.parseDouble(numq.substring(1,2));
			}else {
				fiq = Double.parseDouble(numq.substring(0,1));
			}
			
			if((p/q) == (fip/fiq)) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numC = sc.nextInt();
		for (int i = 0 ; i< numC ; i++) {
			casoprueba(sc);
		}
	}

}
