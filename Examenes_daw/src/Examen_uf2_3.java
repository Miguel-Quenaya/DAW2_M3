import java.io.File;
import java.util.Scanner;

public class Examen_uf2_3 {
	static int[][] leer_matriu() {
		int [][] matriu = {
				{1,2}
		};
		//variables, a para filas de la matriz, l para la columnas de la matriz, i y j para guardar en cada
		//posicion de la matriz
		int l=0,a=0, i=0, j=0;
		try {
			
			Scanner sc=new Scanner(new File("prueba.txt"));
			//para controlar el numeroque estamos
			int num = 0;
			//mostrar todo el contenido del fichero en linias
			while (sc.hasNextInt()) {
				if(num==0) {
					//si es el primer numero sera el num de filas
					a = sc.nextInt();
					num++;

				}
				else if(num==1) {
					//si es el segundo numero sera el num de columnas
					l = sc.nextInt();
					num++;
					//cuadno tengmos el num de columnas significa que tambien tenemos las filas
					//asi que dimensionamos la matriz
					matriu = new int[a][l];
					
				}
				else if(num>1) {
					//guardamos cada numero en posicion diferente
					matriu[i][j] = sc.nextInt();
					//sumamos 1 a j para pasar a la siguiente columna
					j++;
					//cuando llenemos la primera fila pasamos a la siguiente fila
					if(j == (matriu[i].length )) {
						i++;
						//y ponemos j a 0 para empezar de 0
						j=0;
					}
				}
			}
			sc.close();
			
		}catch (Exception e) {
            System.out.println("Error al escribir");
        }
		return(matriu);
	}
	
	//funcion del apartado 2
	static int[] retornar_array(int[][] matriu) {
		//creamos array con la misma longitud que la matriz
		int [] array = new int [matriu.length];
		//variables para saber las posicion de la matriz, primero sera [0][0]
		int y = 0,j = 0;
		for(int i = 0 ; i < array.length ; i++) {
			//la posicion i del array sera igual a la de la matriz[y][j]
			array[i] = matriu[y][j];
			//sumamos 1 a "y" y "j" para que pase a lasiguiente fila y columna (la diagonal)
			y++;
			j++;
		}
		return (array);
	}
	
	//funcion del apartado 3
	static int [][] retornar_matriu(int [][] matriu){
		//nueva matriz que tednra las mismas dimensiones que la principal
		int [][] nova_matriu = new int [matriu.length][matriu[0].length];
		//obtenemos el vector on la funcion anterior
		int [] array = retornar_array(matriu);
		int suma = 0 ;
		//obtenemos la suma del vector
		for(int i = 0 ; i< array.length ; i++) {
			suma += array[i];
		}
		for(int i = 0 ; i < nova_matriu.length ; i++) {
			for(int j = 0 ; j < nova_matriu[i].length ; j++) {
				//cada posicion sera la suma del vector menos el contenido que tenga la matriu 
				//principal en la misma posicion
				nova_matriu[i][j] = suma - matriu[i][j];
			}
		}
		return(nova_matriu);
	}
	
	//Funcion para mostar una matriu
	static void mostrar_matriu(int[][] matriu) {
		for(int i = 0 ; i < matriu.length; i++) {
			for (int j = 0; j < matriu[i].length ; j++) {
				System.out.print(matriu[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//funcion para mostrar un array
	static void mostrar_array(int [] array) {
		for(int i = 0 ; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriu, nova_matriu;
		int []array;
		matriu = leer_matriu();
		array = retornar_array(matriu);
		nova_matriu = retornar_matriu(matriu);
		
		System.out.println("MATRIU PRINCIPAL DEL FITXER");
		mostrar_matriu(matriu);
		System.out.println();
		System.out.println("ARRAY DE LA DIAGONAL");
		mostrar_array(array);
		System.out.println();
		System.out.println();
		System.out.println("MATRIU DE LA SUMA DE LA DIAGONA MENYS EL VALOR DE CADA CELA");
		mostrar_matriu(nova_matriu);
		
		
	}

}
