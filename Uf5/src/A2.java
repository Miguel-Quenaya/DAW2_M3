import java.util.Scanner;

public class A2 {
	//usuario de AceptaElReto : teilor
	static boolean casoDePrueba(Scanner teclado) {
		
		int n = teclado.nextInt();
		int n2= n, res =0, invertido =0;
		boolean first = true;
		
		if (n == 0) {
			return false;
		}
		//INVERTIR Y COMPROBAR QUE ULTIMO DIGITO DEL NUM INTRODUCIDO ES UN 0 LO CUAL SALIR Y DECIR "NO"
		while(n2>0) {
			res = n2 % 10;
			invertido = invertido * 10 +res;
			n2 /= 10;
			if(first && res == 0) {
				
				System.out.println("NO");
				return true;
			}
			first = false;
		}
		
		//OBTENER SUMA
		int suma = n + invertido;
		//System.out.println(suma);
		//COMPROBAR DIGITOS DE LA SUMA
		while(suma > 0) {
			res = suma%10;
			suma = suma/10;
			
			if(res%2 == 0) {
				
				first = false;
				System.out.println("NO");
				return true;
			}
		}
		
		System.out.println("SI");
		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while (casoDePrueba(teclado));
		teclado.close();
	}

}
