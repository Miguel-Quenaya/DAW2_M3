
public class A5_rellotge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rellotge primero = new Rellotge(10,59,40);
		Rellotge segundo = new Rellotge();
		System.out.println(segundo.toString());
		System.out.println(primero.toString());
		primero.sumarSegons(130);
		System.out.println(primero.toString());
		primero.setH(25);
		primero.setMin(59);
		primero.setSeg(60);
		System.out.println(primero.toString());
		primero.sumarSegon();
		System.out.println(primero.toString());
		System.out.println(primero.modificarHora(25, 59, 59));
		System.out.println(primero.modificarHora(23, 59, 59));
	}

}
