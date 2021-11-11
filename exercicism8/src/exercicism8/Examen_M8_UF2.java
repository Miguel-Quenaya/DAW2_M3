package exercicism8;

import java.util.Scanner;

public class Examen_M8_UF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom="";
		int entradesadult= 0,entradesnen=0,adult = 7,nen = 3,total=0,opcio=0,entrades=10 ;
		boolean comprobador = false;
		Scanner teclat = new Scanner (System.in);
		while (entrades >0&&opcio!=2) {
		System.out.println("1. Insertar nom del comprador ,comprar entrades i mostrar resultat de la compra");
		System.out.println("2. Sortir");
		System.out.println("Que vols fer ? ");
		opcio = teclat.nextInt();
		if (opcio ==1) {
			do {
				System.out.println("Nom= ");
				nom = teclat.next();
				System.out.println("Numero d'entrades de adult = ");
				entradesadult = teclat.nextInt();
				System.out.println("Numero d'entrades de nen = ");
				entradesnen = teclat.nextInt();
				if ((entradesadult+entradesnen)<=entrades) {
					total = (entradesadult*adult) + (entradesnen * nen);
					entrades -= entradesadult+entradesnen;
					System.out.println("Nom = " + nom);
					System.out.println("entrades adult = " + entradesadult);
					System.out.println("entrades nens = " + entradesnen);
					System.out.println("total preu = " + total);
					
					
				}else {
					System.out.println("Numero de entrades insuficients");
					System.out.println("Entrades totals = "+ entrades );
				}
			}while ((entradesadult+entradesnen)>entrades&&entradesadult==0);
			
		}
		if ( entrades == 0 ) {
			System.out.println("S'han acabat les entrades");
		}
		}
		if(opcio==2) {
			System.out.println("Adeu");
		}
		
		

	}

}
