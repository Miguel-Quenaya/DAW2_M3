import java.util.Scanner;

public class uri {

	
	public static void main(String[] args) {
	
		// Fes un menú on hi hagi les següents opcions:
		/*
		 1. Insertar el nom del comprador i comprar entrades
		 2. Mostrar resultats de la compra

		Explicació:
		
		El menú ha de continuar sortint mentre hi hagi entrades per poder vendre a un altre comprador.
		
		1. Demanar el nom del comprador.
		Com a màxim al cinema es poden comprar 10 entrades.
		Preguntar quantes entrades vol comprar i per cada entrada, indicar si es adult(7€) o nen (3€).
		
		2. Mostrar el resultat de la compra
		Nom
		Entrades adults
		Entrades nens
		Total preu

		 */
		
		Scanner teclat = new Scanner (System.in);
		
		String nom;
		int entrades;
		String edat;
		int adult = 0;
		int nen = 0;
		int adultf;
		int nenf;
		int total;
		int entradest = 10;
		boolean t = false;
				
		System.out.println("Nom?");
		nom = teclat.next();
		
		System.out.println("Quantes entrades vols comprar? Recorda màxim 10!");
		entrades = teclat.nextInt();
			
			while ((entrades > 10)||(entrades < 1)) {
				
							
				System.out.println("Error");
				System.out.println("Quantes entrades vols comprar? Recorda màxim 10!");
				entrades = teclat.nextInt();
				
			} 
		entradest = entradest - entrades;
			
		for (int i = 1; i <= entrades; i++) {
			
			System.out.println("Ets adult o nen?");
			edat = teclat.next();
			
				while ((!edat.equals("adult"))&&(!edat.equals("nen"))) {
					System.out.println("Ets adult o nen?");
					edat = teclat.next();
					
				}
				
				if (edat.equals("adult")) {
					
					adult++;
			
				}

				if (edat.equals("nen")) {
					
					nen++;
			
				}
		}
		
		adultf = adult * 7;
		nenf = nen * 3;
		total = nenf + adultf;
				
		System.out.println();
		System.out.println("Ticket:");
		System.out.println("Nom = " + nom);
		System.out.println();
		System.out.println("Entrades adults = " + adult + " entrades " + adultf + " €");
		System.out.println("Entrades nen    = " + nen + " entrades " + nenf + " €");
		System.out.println("TOTAL = " + total + " €");
		System.out.println();
		
		System.out.println("Has acabat? (Respon amb true o false)");
		t = teclat.nextBoolean();
		
		// SOBREN ENTRADES?
				
		while (!t) {
			
			adult = 0;
			nen = 0;
			
			System.out.println("Nom?");
			nom = teclat.next();
			
			System.out.println("Entrades restants = " + entradest);
			System.out.println("Quantes entrades vols comprar? Recorda màxim 10!");
			entrades = teclat.nextInt();
			
						
				while ((entrades > entradest)||(entrades < 1)) {
						
					System.out.println("Error");
					System.out.println("Quantes entrades vols comprar? Recorda màxim 10!");
					entrades = teclat.nextInt();
						
				}
								
			entradest = entradest - entrades;
				
			for (int i = 1; i <= entrades; i++) {
				
				System.out.println("Ets adult o nen?");
				edat = teclat.next();
				
					while ((!edat.equals("adult"))&&(!edat.equals("nen"))) {
						System.out.println("Ets adult o nen?");
						edat = teclat.next();
					}
					
					if (edat.equals("adult")) {
						
						adult++;
				
					}

					if (edat.equals("nen")) {
						
						nen++;
				
					}
			}
			
			adultf = adult * 7;
			nenf = nen * 3;
			total = nenf + adultf;
					
			System.out.println();
			System.out.println("Ticket:");
			System.out.println("Nom = " + nom);
			System.out.println();
			System.out.println("Entrades adults = " + adult + " entrades " + adultf + " €");
			System.out.println("Entrades nen    = " + nen + " entrades " + nenf + " €");
			System.out.println("TOTAL = " + total + " €");
			
		

			t = (entradest == 0);
			System.out.println("Has acabat? (Respon amb true o false)");
			t = teclat.nextBoolean();
			System.out.println();
		}
		
		teclat.close();
	}

}
