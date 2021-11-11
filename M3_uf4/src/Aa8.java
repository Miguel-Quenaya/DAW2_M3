
public class Aa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteCorrent cc1 = new CompteCorrent("Miguel", 12345678);
		CompteCorrent cc2 = new CompteCorrent("Angel", 87654321);
		
		cc1.Ingressar(2000);
		cc1.TreureDiners(1500);
		cc1.Transferencia(100, cc2);
		System.out.println("CC1 \n" + cc1.toString());
		System.out.println();
		System.out.println("CC2 \n" + cc2.toString());
	}

}
