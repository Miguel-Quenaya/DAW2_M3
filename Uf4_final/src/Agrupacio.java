import java.util.Scanner;

public class Agrupacio {
	private String nom;
	private String tipus;
	private String ubi;
	private Music[] musics;
//	
	public Agrupacio(String nom_in, String tipus_in, String ubi_in) {
		this.nom = nom_in;
		this.tipus = tipus_in;
		this.ubi = ubi_in;
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTipus() {
		return tipus;
	}
	public void setTipus(String tipus) {
		this.tipus = tipus;
	}
	public String getUbi() {
		return ubi;
	}
	public void setUbi(String ubi) {
		this.ubi = ubi;
	}
	
	public String toString() {
		return "Nom agrupació : " + nom + "\n Tipus : " + tipus + "\n Ubicació : "+ ubi;
	}
	
	public Music[] afegirmusics()  {
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.println("num de musics :");
		num = sc.nextInt();
		Music [] musics = new Music [num];
		
		for(int i = 0 ; i < musics.length ; i++) {
			System.out.println("nom music " + (i+1) + " :");
			String nom_music = sc.next();
			System.out.println("nif music " + (i+1) + " :");
			String nif_music = sc.next();
			System.out.println("edat music " + (i+1) + " :");
			int edat_music = sc.nextInt();
			System.out.println("instrument music " + (i+1) + " :");
			String instrument = sc.next();
			
			musics[i] = new Music(nom_music, nif_music, edat_music, instrument);
		}
		
		this.musics = musics;
		return musics;
	}
	
	public int nombrejubilats (Music[] musics) {
		int contador = 0;
		
		for(int i = 0 ; i < musics.length ; i++) {
			if(musics[i].major()) {
				contador++;
			}
		}
		return contador;
	}
}
