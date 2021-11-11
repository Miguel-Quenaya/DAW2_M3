import java.util.Scanner;

public class AA1 {

	public static void main(String[] args) {
		//variables
		int corda =0,fusta=0, metall=0,totali=0;
		double preu=0, mitja=0,sumac=0, sumaf=0,sumam=0,total=0;
		String tipus, respuesta;
		Scanner teclat = new Scanner(System.in);
		
		
		
		
		//se pregunta si quiere introducir instrumentos
		System.out.println("Quieres introducir instrumentos ?");
		respuesta = teclat.next();
		//si dice que si se hara todo el codigo, pero sin no dice que si no hara nada ya que no hay instrumentos con los que hacer los calculos
		if(respuesta.equalsIgnoreCase("si")) {
			do {
				//este do while sireve para que vaya preguntando si quiere poner mas instrumentos, cada ve que se diga que se introduce los datos 
				do {
					//este do while sirve para que admita solo como respuesta los 3 tipos qeu se dicen
					System.out.println("Tipus d'instrument (corda, fusta o metall)= ");
					tipus = teclat.next();
					
					//cada if es para cada que se introduza el precio de cada tipo y se guarde en su variable 
					if(tipus.equalsIgnoreCase("corda")) {
						corda++;
						do {
							System.out.println("preu = ");
							preu = teclat.nextDouble();
							if(preu>0) {
								sumac+=preu;
							}
							if(preu<0) {
								System.out.println("Valor incorrecte");
							}
						}while(preu<0);
					}
					if(tipus.equalsIgnoreCase("fusta")) {
						fusta++;
						do {
							System.out.println("preu = ");
							preu = teclat.nextDouble();
							if(preu>0) {
								sumaf+=preu;
							}
							if(preu<0) {
								System.out.println("Valor incorrecte");
							}
						}while(preu<0);
					}
					if(tipus.equalsIgnoreCase("metall")) {
						metall++;
						do {
							System.out.println("preu = ");
							preu = teclat.nextDouble();
							if(preu>0) {
								sumam+=preu;
							}
							if(preu<0) {
								System.out.println("Valor incorrecte");
							}
						}while(preu<0);
					}
					if(!(tipus.equalsIgnoreCase("corda")||tipus.equalsIgnoreCase("fusta")||tipus.equalsIgnoreCase("metall"))) {
						System.out.println("Valor incorrecte");
					}
				}while(!(tipus.equalsIgnoreCase("corda")||tipus.equalsIgnoreCase("fusta")||tipus.equalsIgnoreCase("metall")));
				
				//se pregunta si quiere seguir , si dice otra cosa que no sea que si se acaba el programa y se dan los resultados
				System.out.println("vols posar un altre instrument més");
				respuesta =teclat.next();
			}while (respuesta.equalsIgnoreCase("si"));
			//se dan los resultados
			total = sumac + sumaf + sumam;
			totali = corda + fusta + metall;
			System.out.println("instruments de corda = " + corda);
			System.out.println("instruments de fusta = " + fusta);
			System.out.println("instruments de metall = " + metall);
			System.out.println("mitja de corda = " + (sumac/corda));
			System.out.println("mitja de fusta = " + (sumaf/fusta));
			System.out.println("mitja de metall = " + (sumam/metall));
			System.out.println("mitja toal de tots els instruments = " + (total/totali));
		}
		
		//calcul
		
		

	}

}
