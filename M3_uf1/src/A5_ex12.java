
import java.util.Scanner;

public class A5_ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10 ,cp=0,cn=0;
		boolean sn=true;
		String otro="";
		Scanner teclat = new Scanner (System.in);
		
		while (sn){
			
			System.out.println("num =");
			num = teclat.nextInt();
			
			while (num%10!=0) {
				System.out.println("Incorrecte, numeros acabats en zero");
				System.out.println("num =");
				num = teclat.nextInt();
			}
				
				if(num>=0) {
					cp++;
				}else {
					cn++;
				}
				System.out.println("Vols posar un altre numero ?");
				otro = teclat.next();
				if(otro.equalsIgnoreCase("si")) {
					sn =true;
				}
				else{
					sn =false;
				}		
		}
		if(cp>cn) {
			System.out.print("hi ha més positius");
		}
		else {
			System.out.print("hi ha més negatius");
		}
	}

}
