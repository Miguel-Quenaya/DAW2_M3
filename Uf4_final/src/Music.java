

public class Music {
	private String nom;
	private String nif;
	private int edat;
	private String instrument;
//	
	public Music(String nom_in, String nif_in, int edat_in, String instrument_in) {
		this.nom = nom_in;
		this.nif = nif_in;
		this.edat = edat_in;
		this.instrument = instrument_in;
	}
	
	public boolean major() {
		if(edat > 65) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Nom complet : " + nom + "\n NIF : " + nif + "\n Edat : " + edat + "\n Instrument : " + instrument;
	}
	
	
}
