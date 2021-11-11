import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Principal {
	
	

	public static void main(String[] args) {
		Music [] rafaga_musics;
		Music [] socios_musics;
		// CREAR FITXER PER ESCRIPTURA
		File archivo = new File("sortida.txt");
		
		// CREAR AGRUPACIÓ1 I AFEGIR ELS MÚSICS
		Agrupacio rafaga = new Agrupacio("Rafaga", "Banda", "Argentina");
		rafaga_musics = rafaga.afegirmusics();
		// CREAR AGRUPACIÓ2 I AFEGIR ELS MÚSICS
		Agrupacio LosSociosDelRitmo = new Agrupacio("LosSociosDelRitmo", "Banda", "Bolivia");
		socios_musics = rafaga.afegirmusics();
		//ESCRIURE EL FITXER sortida.txt
		// informació agrupació + nombre de músics + nombre majors de 55 anys
		try {
 
            FileWriter escribir = new FileWriter(archivo);

            escribir.write(rafaga.toString() + "\n num musics : " + rafaga_musics.length + "\n num majors de 65 : " + rafaga.nombrejubilats(rafaga_musics));
            escribir.write("\r\n"); 
            escribir.write(LosSociosDelRitmo.toString() + "\n num musics : " + socios_musics.length + "\n num majors de 65 : " + LosSociosDelRitmo.nombrejubilats(socios_musics));
            escribir.write("\r\n");
            

            escribir.close();
        } 
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
	}

}
