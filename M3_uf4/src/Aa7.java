import java.util.Scanner;

public class Aa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona [] personas = new Persona[3];
		Scanner sc = new Scanner (System.in);
		boolean incorrecto = false;
		int dia,mes,any;
		for(int i = 0 ; i < 3 ; i++) {
			String nom = sc.next();
			do {
				 dia = sc.nextInt();
				 mes = sc.nextInt();
				 any = sc.nextInt();
				
				Data fecha = new Data(dia, mes,any);
				 incorrecto = fecha.toString().equalsIgnoreCase("01/01/2021");
				 if(incorrecto) {
					 System.out.println("Fecha incorrecta");
				 }
			}while(incorrecto);
			
			int num = sc.nextInt();
			personas[i] = new Persona(nom,dia,mes,any,num);
		}
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(personas[i].toString());
		}
	}
	
}
