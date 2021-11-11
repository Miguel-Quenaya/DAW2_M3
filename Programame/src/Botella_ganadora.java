import java.util.Scanner;

public class Botella_ganadora {
	static void casoDePrueba(Scanner sc) {
		int numC, numParticipante = 0, entrada, ganador=0, total=0, dif = 1;
		do {
			numC = sc.nextInt();
		}while(numC < 0 || numC >100000);
		
		numC *= 8;
		
		do {
			do {
				entrada = sc.nextInt();
			}while(entrada < 0 || entrada > 10000);
			if(entrada!=0) {
				numParticipante++;
				numC -= entrada;
				
				if(numC <= 0 && dif == 1) {
					ganador = numParticipante;
					dif =0;
				}
			}
			
		}while(entrada != 0);
		
		if(total >= numC) {
			System.out.println(ganador);
		}else {
			System.out.println("SIGAMOS RECICLANDO");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numCasos = sc.nextInt();
		
		for(int i = 0 ; i < numCasos ; i++) {
			casoDePrueba(sc);
		}

	}

}
