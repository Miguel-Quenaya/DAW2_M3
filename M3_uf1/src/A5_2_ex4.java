import java.util.Scanner;

import javax.swing.JOptionPane;

public class A5_2_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean entracotxe, sigue=true, gasoils, gasolinas;
		double lgasoil=0, lgasolina=0 , gasoil=0, gasolina=0, litres;
		int hora, cotxes=0;
		String respuesta;
		Scanner teclat = new Scanner (System.in);
		
		do {
			respuesta = JOptionPane.showInputDialog("Entra cotxe ?");
			entracotxe = respuesta.equalsIgnoreCase("si");
			if (entracotxe) {
				
				respuesta = JOptionPane.showInputDialog("Quina hora es ? (nomes en h)");
				hora = Integer.parseInt(respuesta);
				
				if(hora>9&&hora<21) {
					cotxes++;
					respuesta = JOptionPane.showInputDialog("gasolina o gasoil ?");
					gasoils = respuesta.equalsIgnoreCase("gasoil");
					gasolinas = respuesta.equalsIgnoreCase("gasolina");
					if(gasolinas) {
						gasolina++;
						respuesta = JOptionPane.showInputDialog("litres =");
						litres = Integer.parseInt(respuesta);
						lgasolina+=litres;
					}
					if(gasoils) {
						gasoil++;
						respuesta = JOptionPane.showInputDialog("litres =");
						litres = Integer.parseInt(respuesta);
						lgasoil+=litres;
					}
				}
				
				if(hora<9||hora>21) {
					JOptionPane.showMessageDialog(null, "Fora de horari. Torni més tard", "Tancat", JOptionPane.WARNING_MESSAGE);
					sigue = false;
				}
			}
			if (!entracotxe) {
				respuesta = JOptionPane.showInputDialog("Vols tancar ?");
				sigue = respuesta.equalsIgnoreCase("no");
			}
		}while(sigue);
		
		JOptionPane.showMessageDialog(null, "Num cotxes avui =" + cotxes, "numero de cotxes", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Num cotxes gasolina =" + gasolina + " Litres de gasolina =" + lgasolina, "Cotxes gasolina", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Num cotxes gasoil =" + gasoil + " Litres de gasoil =" + lgasoil, "Cotxes gasolina", JOptionPane.INFORMATION_MESSAGE);
	}

}
