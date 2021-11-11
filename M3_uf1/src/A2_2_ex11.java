import java.util.Scanner;

public class A2_2_ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia,mes,any;
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("any =");
		any = teclat.nextInt();
		
		while (any<1500||any>2020) {
			System.out.print("error, reintenta");
			System.out.print("any =");
			any = teclat.nextInt();
		}
		
		System.out.print("mes =");
		mes = teclat.nextInt();
		
		while (mes<1||mes>12) {
			System.out.print("error, reintenta");
			System.out.print("mes =");
			mes = teclat.nextInt();
		}
		
		System.out.print("dia =");
		dia = teclat.nextInt();
		
		if (mes==2) {
			while (dia<1||dia>28) {
				System.out.print("error, reintenta");
				System.out.print("dia =");
				dia = teclat.nextInt();
			}
		}
		if (mes==4||mes==6||mes==4||mes==9||mes==11) {
			while (dia<1||dia>30) {
				System.out.print("error, reintenta");
				System.out.print("dia =");
				dia = teclat.nextInt();
			}
		}
		else {
			while (dia<1||dia>31) {
				System.out.print("error, reintenta");
				System.out.print("dia =");
				dia = teclat.nextInt();
			}
		}
		System.out.print("dia " + dia + " mes " + mes + " any " + any);
	}

}
