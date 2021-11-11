import java.util.Scanner;
public class A6_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom, sexe, sigue;
		int curs;
		Scanner teclat = new Scanner (System.in);
		
		do {
			System.out.println("nom = ");
			nom = teclat.next();
			
			do {
				System.out.println("curs = ");
				curs = teclat.nextInt();
				
				if (curs<1||curs>3) {
					System.out.println("Valor incorrecte, entre 1 - 3 ");
				}
			}while (curs<1||curs>3);
			
			do {
				System.out.println("sexe = ");
				sexe = teclat.next();
				
				if (!(sexe.equalsIgnoreCase("H")||sexe.equalsIgnoreCase("M"))) {
					System.out.println("Valor incorrecte, H o M");
				}
			}while (!(sexe.equalsIgnoreCase("H")||sexe.equalsIgnoreCase("M")));
			
			do {
				System.out.println("Vols entrar més dades ?");
				sigue = teclat.next();
				
				if (!(sigue.equalsIgnoreCase("S")||sigue.equalsIgnoreCase("N"))) {
					System.out.println("Valor incorrecte, S o N");
				}
			}while (!(sigue.equalsIgnoreCase("S")||sigue.equalsIgnoreCase("N")));
		}while(!sigue.equalsIgnoreCase("N"));
	}

}
