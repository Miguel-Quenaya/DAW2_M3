import java.util.Scanner;

public class A2_2_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclat = new Scanner (System.in);
		
		System.out.print("num = ");
		num = teclat.nextInt();
		
		while (num>7||num<=0) {
			System.out.print("Error , Reintenta");
			System.out.print("num = ");
			num = teclat.nextInt();
		}
		switch (num){
		case 1 : System.out.print("lunes");
		 break;
		case 2 : System.out.print("martes");
		 break;
		case 3 : System.out.print("miercoles");
		 break;
		case 4 : System.out.print("jueves");
		 break;
		case 5 : System.out.print("viernes");
		 break;
		case 6 : System.out.print("sabado");
		 break;
		case 7 : System.out.print("somingo");
		 break;
		}
	}

}
