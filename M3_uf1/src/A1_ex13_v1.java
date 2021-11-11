import java.util.Scanner;
public class A1_ex13_v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalseg,h=0,min=0;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("total segons = ");
		totalseg = teclat.nextInt();
		
		if(totalseg>=3600) {
			while (totalseg>=3600) {
				h++;
				totalseg-=3600;
			}
		}
		if (totalseg>=60) {
			while (totalseg>=60) {
				min++;
				totalseg-=60;
			}
		}
		
		
		
		
		System.out.println(h + " hores");
		System.out.println(min + " minuts");
		System.out.println(totalseg + " segons");
	}

}
