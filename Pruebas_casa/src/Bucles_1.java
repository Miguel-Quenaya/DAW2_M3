import javax.swing.*;
public class Bucles_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contra="miguel";
		String contra1="";
		
		while (contra.equals(contra1)==false) {
			contra1= JOptionPane.showInputDialog("Contraseña?");
			
			if (contra.equals(contra1)==false) {
				System.out.println("Incorrecto");
			}
		}
		
		System.out.println("Correcto");

	}

}
