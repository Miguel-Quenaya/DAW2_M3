import java.util.Scanner;

public class A2_2_ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char dia =0;
		String day;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("dia  = ");
		day = teclat.next();
		
		while(!(day.equalsIgnoreCase("Dilluns")||day.equalsIgnoreCase("Dimarts")||day.equalsIgnoreCase("Dimecres")||day.equalsIgnoreCase("Dijous")||day.equalsIgnoreCase("Divendres")||day.equalsIgnoreCase("Dissabte")||day.equalsIgnoreCase("Diumenge"))) {
			System.out.print("error, reintenta");
			System.out.print("dia  = ");
			day = teclat.next();
		}
		
		if(day.equalsIgnoreCase("Dilluns")) {
			dia = '1';
		}
		if(day.equalsIgnoreCase("Dimarts")) {
			dia = '2';
		}
		if(day.equalsIgnoreCase("Dimecres")) {
			dia = '3';
		}
		if(day.equalsIgnoreCase("Dijous")) {
			dia = '4';
		}
		if(day.equalsIgnoreCase("Divendres")) {
			dia = '5';
		}
		if(day.equalsIgnoreCase("Dissabte")) {
			dia = '6';
		}
		if(day.equalsIgnoreCase("Diumenge")) {
			dia = '7';
		}
		System.out.print("dia  = " + dia);

	}

}
