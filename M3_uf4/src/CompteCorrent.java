
public class CompteCorrent {
	private String titular;
	private int numCC;
	private double saldo;
	
	

	public CompteCorrent(String titular_in, int numcc_in) {
		this.titular = titular_in;
		this.numCC = numcc_in;
		this.saldo = 0;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumCC() {
		return numCC;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean TreureDiners(double quantitat) {
		if(saldo >= quantitat) {
			saldo -= quantitat;
			return true;
		}else {
			return false;
		}
	}
	public void Ingressar(double quantitat) {
		saldo += quantitat;
	}
	
	public boolean Transferencia (double quantitat, CompteCorrent destino) {
		if(quantitat <1000 && quantitat != 0) {
			if(TreureDiners(quantitat+1)) {
				destino.Ingressar(quantitat);
				return true;
			}else {
				return false;
			}
		}else {
			if(TreureDiners(quantitat)) {
				destino.Ingressar(quantitat);
				return true;
			}else {
				return false;
			}
		}
		
		
	}
	public String toString() {
		return ("Titular: " + titular + "\nNúmero: " + numCC + "\nSaldo: " + saldo + "€");
	}
	
	
	
	

}
