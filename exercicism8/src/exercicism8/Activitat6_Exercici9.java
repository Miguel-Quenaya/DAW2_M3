package exercicism8;

import java.util.Scanner;

public class Activitat6_Exercici9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player1=0,player2=0;
		String play1,play2;
		
		Scanner teclat = new Scanner (System.in);
		while (player1!=3&&player2!=3) {
			System.out.println("jugada de player1 = ");
			play1 = teclat.next();
			System.out.println("jugada de player2 = ");
			play2 = teclat.next();
			if (play1.equalsIgnoreCase("tisora")) {
				if (play2.equalsIgnoreCase("tisora")) {
					
				}
				if (play2.equalsIgnoreCase("paper")) {
					player1++;
				}
				if (play2.equalsIgnoreCase("pedra")) {
					player2++;
				}
				
			}
			if (play1.equalsIgnoreCase("paper")) {
				if (play2.equalsIgnoreCase("tisora")) {
					player2++;
				}
				if (play2.equalsIgnoreCase("paper")) {
					
				}
				if (play2.equalsIgnoreCase("pedra")) {
					player1++;
				}
				
			}
			if (play1.equalsIgnoreCase("pedra")) {
				if (play2.equalsIgnoreCase("tisora")) {
					player1++;
				}
				if (play2.equalsIgnoreCase("paper")) {
					player2++;
				}
				if (play2.equalsIgnoreCase("pedra")) {
					
				}
				
			}
			System.out.println(player1 + " - " + player2);
		}

	}

}
