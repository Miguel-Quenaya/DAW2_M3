import java.util.Scanner;

public class A5_2_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alumnes , mes8=0 , mes5=0 , menys6=0 ;
		double nota , notam3 = 0 ;
		Scanner  teclat = new Scanner (System.in);
		
		System.out.print("Alumnes =");
		alumnes = teclat.nextInt();
		
		for ( int i = 1 ; i <= alumnes ; i++) {
			for(int j = 1 ; j<=3 ; j++) {
				do {
					System.out.println("Nota UF" + j + " =");
					nota = teclat.nextInt();
					if(nota<0||nota>10) {
						System.out.println("Valor incorrecte");
					}
				}while(nota<0||nota>10);
				
				if (nota>8) {
					mes8++;
				}
				if (nota>6||nota<=8) {
					mes5++;
				}
				if (nota>=5||nota <=6) {
					menys6++;
				}
				
				if(i ==1) {
					notam3+= (nota*0.4);
				}
				if(i ==2) {
					notam3+= (nota*0.35);
				}
				if(i ==3) {
					notam3+= (nota*0.25);
				}
				
			}
			System.out.println("nota m3 = " + notam3);
			notam3 = 0;
		}
	}

}
