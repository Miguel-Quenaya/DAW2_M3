package exercicism8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso;
		double altura;
		double imc;
		//imc
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("Pes0 (kg) = ");
		peso = teclat.nextDouble();
		System.out.print("altura (m) = ");
		altura = teclat.nextDouble();
		imc = peso / (altura * altura);
		
		 DecimalFormat df = new DecimalFormat("#.00");
		 System.out.println(df.format(imc));
		 System.out.print("Clasificacion = ");
		 
		 if (imc < 16) {
			 System.out.print("Delgadez Severa");
		 } else if (imc < 18.50){
			 System.out.print("Delgadez moderada");
		 } else if (imc < 25){
			 System.out.print("Normal");
		 } else if (imc < 30){
			 System.out.print("Sobrepeso");
		 } else if (imc < 35){
			 System.out.print("Obeso Tipo I");
		 } else if (imc < 40){
			 System.out.print("Obeso Tipo II");
		 } else if (imc >= 40){
			 System.out.print("Obeso Tipo I");
		 }
		 
		 teclat.close();

	}

}
