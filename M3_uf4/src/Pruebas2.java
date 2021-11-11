
public class Pruebas2 {
	static public boolean gg(int x) {
		if(x!=0) {
			System.out.println("Hola");
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gg(5);
		if(gg(5)) {
			System.out.println("adios");
		}

	}

}
