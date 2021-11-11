
public class Persona {
	
	private String nom;
	private Data fecha;
	private Nif dni;
	
	public Persona(String nom_in, int dia_in, int mes_in, int any_in, int numero_in) {
		this.nom = nom_in;
		this.fecha = new Data(dia_in ,mes_in,any_in);
		this.dni = new Nif(numero_in);
	}
	
	public String toString() {
		return (nom + " - " + fecha.toString() + " - " + dni.toString());
	}
}
