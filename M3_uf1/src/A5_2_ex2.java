import java.util.Scanner;
public class A5_2_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,intent,intents=1;
		Scanner teclat = new Scanner (System.in);
		
		num = (int) (Math.random() * 100) + 0;
		System.out.println(num);
		System.out.println("Quin num és ?");
		intent = teclat.nextInt();
		
		while(intent!=num) {
			if (intent<num) {
				System.out.println("Major");
			}else {
				System.out.println("Menor");
			}
			intents++;
			System.out.println("Quin num és ?");
			intent = teclat.nextInt();
		}
		System.out.println("Correcte! amb " + intents + " intents");
		
	}

}
