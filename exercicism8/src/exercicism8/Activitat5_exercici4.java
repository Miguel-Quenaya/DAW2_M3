package exercicism8;
import javax.swing.*;

public class Activitat5_exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quees;
		String edats;
		String grup;
		String estu;
		boolean profe;
		boolean visi;
		boolean grup1,grup2;
		boolean estu1,estu2;
		boolean potEntrarSensePagar = false;
		int edat = 0;
		
		
		do {
			quees = JOptionPane.showInputDialog("Ets visitant o professor ?");
			profe = quees.equalsIgnoreCase("professor");
			visi = quees.equalsIgnoreCase("visitant");
			
			if (profe) {
				do {
					edats = JOptionPane.showInputDialog("Professor quina es la teva edat ?");
					edat = Integer.parseInt(edats);
					if (edat<=0) {
						JOptionPane.showMessageDialog(null, "Eleccio incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
					} 
				} while (edat<=0);

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
						do {
							estu = JOptionPane.showInputDialog("Ets un estudiant?");
							estu1 = estu.equalsIgnoreCase("si")||estu.equalsIgnoreCase("sí");
							estu2 = estu.equalsIgnoreCase("no");
							
							if (estu1) {
								potEntrarSensePagar = true;
							}
							if (estu2) {
								potEntrarSensePagar = false;
							}
							if (!estu1&&!estu2) {
								JOptionPane.showMessageDialog(null, "Eleccio incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
							}
							
						} while (!estu1&&!estu2);
					}
					if (edat>=25&&edat>0) {
						potEntrarSensePagar = false;
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
		
		

	}

}
