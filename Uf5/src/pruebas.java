
public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0};
		boolean b = ola(a);
		System.out.println(a[0]);
	}
	
	static boolean ola(int[] a) {
		a[0] = 20;
		return true;
	}

}
