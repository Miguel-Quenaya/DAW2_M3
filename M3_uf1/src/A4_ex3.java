import java.util.Scanner;

import javax.swing.JOptionPane;

public class A4_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quees;
		String edats;
		String grup;
		String estu;
		String torna;
		boolean profe;
		boolean visi;
		boolean grup1,grup2;
		boolean estu1,estu2;
		boolean tornasi;
		boolean potEntrarSensePagar = false;
		int edat = 0;
		
		
		do {
			do {
				quees = JOptionPane.showInputDialog("Ets estudiant o professor ?");
				profe = quees.equalsIgnoreCase("professor");
				visi = quees.equalsIgnoreCase("estudiant");
				
				if (profe) {
					

					do {
						grup = JOptionPane.showInputDialog("Estas amb grup de classe ?");
						grup1 = grup.equalsIgnoreCase("si")||grup.equalsIgnoreCase("sí");
						grup2 = grup.equalsIgnoreCase("no");
						
						if (grup1) {
							potEntrarSensePagar = true;
						}
						if (grup2) {
							potEntrarSensePagar = false;
						}
						
						if (!grup1&&!grup2) {
							JOptionPane.showMessageDialog(null, "Eleccio incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
						}
						
					} while (!grup1&&!grup2);
					
				}
				
				if (visi) {
					do {
						edats = JOptionPane.showInputDialog("Quina es la teva edat ?");
						edat = Integer.parseInt(edats);
						
						if (edat<25&&edat>0) {
							potEntrarSensePagar = true;
						}
						if (edat<0) {
							JOptionPane.showMessageDialog(null, "Eleccio incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
						}
					} while (edat<0);
				}
				
				if (!profe&&!visi) {
					JOptionPane.showMessageDialog(null, "Eleccio incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
				}
				
			} while (!profe&&!visi);
			
			if (potEntrarSensePagar) {
				JOptionPane.showMessageDialog(null, "Entrada Gratuita !", "Informació", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "No tens entrada gratuita", "Informació", JOptionPane.INFORMATION_MESSAGE);
			}
			
			torna = JOptionPane.showInputDialog("Hi ha més persones?");
			tornasi = torna.equalsIgnoreCase("si");
		}while (tornasi);
	}

}
