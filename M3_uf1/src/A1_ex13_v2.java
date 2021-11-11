import java.util.Scanner;

public class A1_ex13_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set=0,dias=0,h=0,min;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("minuts = ");
		min = teclat.nextInt();
		
		if(min>=10080) {
			while(min>=10080) {
				set++;
				min-=10080;
			}
		}
		if(min>=1440) {
			while(min>=1440) {
				dias++;
				min-=1440;
			}
		}
		if(min>=60) {
			while(min>=60) {
				h++;
				min-=60;
			}
		}
		System.out.println(set + " setmanes");
		System.out.println(dias + " dias");
		System.out.println(h + " hores");
		System.out.println(min + " min");
		
		
	}

}
