import java.util.Scanner;

public class problemad {
	
	static void casodeprueba(Scanner sc) {
		String numa = sc.next();
		String numb = sc.next();
		String largo,corto,cortof="";
		String resultado = "";
		if(numa.length() >= numb.length()) {
			largo = numa;
			corto = numb;
			}else {
				largo = numb;
				corto = numa;
			}
		for(int i = 0 ; i < largo.length()-corto.length() ;i++) {
			cortof += "0";
		}
		cortof += corto;
		
		int extra = 0, resul,a,b;
		for(int i = largo.length()-1 ; i >= 0 ; i--) {
			//ystem.out.println(largo.charAt(i));
			
			a = Character.getNumericValue(largo.charAt(i));
			b = Character.getNumericValue(corto.charAt(i));
			resul = a * b;
			String resulstring = String.valueOf(resul);
			if(resul > 9) {
				
				int num2 = Character.getNumericValue(resulstring.charAt(1));
				
				num2 += extra;
				int num2f =num2;
				extra=0;
				if(num2>10) {
					String resulstring2 = String.valueOf(num2);
					num2f = Character.getNumericValue(resulstring2.charAt(1));
					extra += Character.getNumericValue(resulstring2.charAt(0));
					
				}
				resultado += num2f;
				extra += Character.getNumericValue(resulstring.charAt(0));
			}else {
				resul += extra;
				
				if(resul >9) {
					int num2f =resul;
					String resulstring2 = String.valueOf(resul);
					num2f = Character.getNumericValue(resulstring2.charAt(1));
					extra += Character.getNumericValue(resulstring2.charAt(0));
					resultado += num2f;
				}
				resultado += resul;
			}
		}
		StringBuilder builder=new StringBuilder(resultado);
		String sCadenaInvertida=builder.reverse().toString();
		System.out.println(sCadenaInvertida);
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numc = sc.nextInt();
		for(int i = 0 ; i < numc ; i++) {
			casodeprueba(sc);
		}
	}

}
