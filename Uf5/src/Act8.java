import java.util.Scanner;
import java.util.StringTokenizer;

public class Act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*StringBuffer mito = new StringBuffer();
		mito.append(sc.next());
		System.out.println(mito);
		if(mito.toString().equals("ff")) {
			System.out.println("FF");
		}*/
		
		do {
			int contadornumeros = 0;
			String isbn = sc.next();
			StringTokenizer stk = new StringTokenizer(isbn,"-");

			while (stk.hasMoreTokens()) { 
				StringBuffer isbnpart = new StringBuffer(stk.nextToken());
				for(int i = 0; i < isbnpart.length() ; i++) {
					int num = isbnpart.charAt(i);
				}
			}
		}while(true);
	}

}
