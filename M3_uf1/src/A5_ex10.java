import java.util.Scanner;

public class A5_ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,suma=0,contador=0,mitja;
		boolean sn=true;
		String otro;
		Scanner teclat = new Scanner (System.in);
		
		while (sn){
			
			System.out.println("num =");
			num = teclat.nextInt();
			
			while (num%10!=0||num<0) {
				System.out.println("Incorrecte, nombre no negatius acabats en zero");
				System.out.println("num =");
				num = teclat.nextInt();
			}

				suma+=num;
				contador++;
				System.out.println("Vols posar un altre numero ?");
				otro = teclat.next();
				if(otro.equalsIgnoreCase("si")) {
					sn =true;
				}
				if(otro.equalsIgnoreCase("no")) {
					sn =false;
				}		
		}
		mitja = suma/contador;
		System.out.print("mitjana artimètica de " + suma + " = " + mitja);
	}

}
