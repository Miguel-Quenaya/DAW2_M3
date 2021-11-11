import java.util.Scanner;

public class A6_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alumnes;
		double nota,ex=0,not=0,be=0,suf=0,ins=0,suma=0;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("num de alumnes = ");
		alumnes = teclat.nextInt();
		
		for(int i = 1 ; i <= alumnes ; i++) {
			System.out.println("nota uf1 de m3 del alumne " + i + " = ");
			nota = teclat.nextInt();
			while(nota<0||nota>10) {
				System.out.println("Valor incorrecte");
				System.out.println("nota uf1 de m3 del alumne " + i + " = ");
				nota = teclat.nextInt();
			}
			suma+=nota;
			if(nota<5) {
				ins++;
			}
			if(nota>=5&&nota<6) {
				suf++;
			}
			if(nota>=6||nota<7) {
				be++;
			}
			if(nota>=7||nota<9) {
				not++;
			}
			if(nota>=9) {
				ex++;
			}
			
		}
		System.out.println("Num d'alumnes amb Excel·lent = " + ex);
		System.out.println("Num d'alumnes amb Notable = " + not);
		System.out.println("Num d'alumnes amb Bé = " + be);
		System.out.println("Num d'alumnes amb Suficient = " + suf);
		System.out.println("Num d'alumnes amb Insuficient = " + ins);
		System.out.println("Nota mitja de ka classe = " + (suma/alumnes));
		System.out.println("Percentatge d'alumnes que han tret excel·lent o notable = " + ((ex+not)*100)/alumnes);
		System.out.print("%");
		System.out.println("Percentatge d'alumnes que han tret be o suficient= " + ((be+suf)*100)/alumnes);
		System.out.print("%");
		System.out.println("Percentatge d'alumnes que han tret insuficient= " + (ins*100)/alumnes);
		System.out.print("%");
		
	}

}
