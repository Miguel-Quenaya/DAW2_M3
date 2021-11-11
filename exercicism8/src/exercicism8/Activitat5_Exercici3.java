package exercicism8;

import javax.swing.JOptionPane;

public class Activitat5_Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String edat;
		int edat1 = -1;
		boolean disco;
		
		while (edat1<0) {
			edat = JOptionPane.showInputDialog("Quina es la teva edta ?");
			edat1 = Integer.parseInt(edat);
			disco = (edat1>=16&&edat1>0);
			if (disco) {
				System.out.println("Pots entrar en una discoteca");
			}else {
				System.out.println(" No Pots entrar en una discoteca");
			}
			if (edat1<0) {
				System.out.println("Edat no realista");
			}
		}

	}

}
