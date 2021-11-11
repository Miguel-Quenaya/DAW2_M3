import javax.swing.JOptionPane;

public class A3_1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String respuesta;
		
		//int respuesta1 = 0;
		int dau1,dau2,dau3;
		int punts = 0;
		boolean elecciosi;
		boolean elecciono;
		
		
		respuesta = JOptionPane.showInputDialog("Vols llençar el daus? (Si o No)");
		elecciosi = (respuesta.equalsIgnoreCase("si"));
		elecciono = (respuesta.equalsIgnoreCase("no"));
		

		
		if (!elecciono) {
				do {
					if (elecciosi) {
						dau1= (int) (Math.random() * 6) + 1;
						dau2= (int) (Math.random() * 6) + 1;
						dau3= (int) (Math.random() * 6) + 1;
						
						JOptionPane.showMessageDialog(null, "Els daus s'han llençat", "Suerte", JOptionPane.INFORMATION_MESSAGE);
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
							JOptionPane.showMessageDialog(null, "Excel·lent", "Els tres daus són 6", JOptionPane.INFORMATION_MESSAGE);
						} else if (punts==2) {
							JOptionPane.showMessageDialog(null, "Molt bé", "Dos daus són 6", JOptionPane.INFORMATION_MESSAGE);
						} else if (punts==1) {
							JOptionPane.showMessageDialog(null, "Regular", "Un dau és 6", JOptionPane.INFORMATION_MESSAGE);
						} else if (punts==0) {
							JOptionPane.showMessageDialog(null, "Malament", "Cap dau és 6", JOptionPane.INFORMATION_MESSAGE);
						}
						
						punts = 0;
						
						respuesta = JOptionPane.showInputDialog("Vols tornar a llençar el daus? (Si o No)");
						elecciosi = (respuesta.equalsIgnoreCase("si"));
						elecciono = (respuesta.equalsIgnoreCase("no"));
					}
					if (!elecciosi&&!elecciono) {
						JOptionPane.showMessageDialog(null, "Eleccio incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
						respuesta = JOptionPane.showInputDialog("Vols llençar el daus? (Si o No)");
						elecciosi = (respuesta.equalsIgnoreCase("si"));
						elecciono = (respuesta.equalsIgnoreCase("no"));
					}

				} while (elecciosi||!elecciono);
				
				JOptionPane.showMessageDialog(null, "Torna quan vulguis", "No jugar", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Torna quan vulguis", "No jugar", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
