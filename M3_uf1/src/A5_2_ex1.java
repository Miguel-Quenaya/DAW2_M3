import java.util.Scanner;

public class A5_2_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,suma=0;
		boolean sn=true;
		String otro="";
		Scanner teclat = new Scanner (System.in);
		
		while (sn){
			
			System.out.println("num =");
			num = teclat.nextInt();
				suma+=num;

				System.out.println("Vols posar un altre numero ?");
				otro = teclat.next();
				if(otro.equalsIgnoreCase("si")) {
					sn =true;
				}
				if(otro.equalsIgnoreCase("no")) {
					sn =false;
				}		
		}

		System.out.print("la suma es " + suma  );
	}

}
