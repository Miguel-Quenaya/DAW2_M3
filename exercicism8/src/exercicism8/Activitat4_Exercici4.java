package exercicism8;
import javax.swing.*;

public class Activitat4_Exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String respuesta;
		//String respuestas = "";
		int respuesta1 = 0;
		int dau1,dau2,dau3;
		int punts = 0;
		
		
		respuesta = JOptionPane.showInputDialog("Vols llen�ar el daus? (1-Si 2-No)");
		
		//while (respuesta==respuestas&&respuesta!=respuestas) {
			//JOptionPane.showMessageDialog(null, "Eleccio incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
			//respuesta = JOptionPane.showInputDialog("Vols llen�ar el daus? (1-Si 2-No)");
			//respuesta1 = Integer.parseInt(respuesta);
		//}
		
		respuesta1 = Integer.parseInt(respuesta);
		
		if (respuesta1!=2) {
				do {
					if (respuesta1==1) {
						dau1= (int) (Math.random() * 6) + 1;
						dau2= (int) (Math.random() * 6) + 1;
						dau3= (int) (Math.random() * 6) + 1;
						
						JOptionPane.showMessageDialog(null, "Els daus s'han llen�at", "Suerte", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, dau1, "Primer dau", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, dau2, "Segon dau", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, dau3, "Tercer dau", JOptionPane.INFORMATION_MESSAGE);
						
						if (dau1==6) {
							punts++;
						}
						if (dau2==6) {
							punts++;
						}
						if (dau3==6) {
							punts++;
						}
						
						if (punts==3) {
							JOptionPane.showMessageDialog(null, "Excel�lent", "Els tres daus s�n 6", JOptionPane.INFORMATION_MESSAGE);
						} else if (punts==2) {
							JOptionPane.showMessageDialog(null, "Molt b�", "Dos daus s�n 6", JOptionPane.INFORMATION_MESSAGE);
						} else if (punts==1) {
							JOptionPane.showMessageDialog(null, "Regular", "Un dau �s 6", JOptionPane.INFORMATION_MESSAGE);
						} else if (punts==0) {
							JOptionPane.showMessageDialog(null, "Malament", "Cap dau �s 6", JOptionPane.INFORMATION_MESSAGE);
						}
						
						punts = 0;
						
						respuesta = JOptionPane.showInputDialog("Vols tornar a llen�ar el daus? (1-Si 2-No)");
						respuesta1 = Integer.parseInt(respuesta);
					}
					if (respuesta1!=1&&respuesta1!=2) {
						JOptionPane.showMessageDialog(null, "Eleccio incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
						respuesta = JOptionPane.showInputDialog("Vols llen�ar el daus? (1-Si 2-No)");
						respuesta1 = Integer.parseInt(respuesta);
					}

				} while (respuesta1==1||respuesta1!=2);
				
				JOptionPane.showMessageDialog(null, "Torna quan vulguis", "No jugar", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Torna quan vulguis", "No jugar", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

}
