import java.util.Scanner;

public class A5_2_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int treballadors;
		double salarit, allsalari=0, salarimin=0, salarimax=0;
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("num treballadors = ");
		treballadors = teclat.nextInt();
		
		for (int i = 1 ; i<=treballadors ; i++) {
			System.out.println("salari treballador " + i + " =");
			salarit = teclat.nextDouble();
			allsalari+=salarit;
			
			if (i==1) {
				salarimin = salarit;
				salarimax = salarit;
			}
			else {
				if (salarit>salarimax) {
					salarimax = salarit;
				}
				if (salarit<salarimin) {
					salarimin = salarit;
				}
			}
		}
		System.out.println("salari max = " + salarimax);
		System.out.println("salari min = " + salarimin);
		System.out.println("salari mig = " + (allsalari/treballadors));
		
		if (salarimin < 735.90) {
			System.out.println("alarma! el salari min de l'empresa es inferior al salari minim interprofessional");
		}
	}

}
