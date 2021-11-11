
public class A7_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] matriu = {
				{"T","C","A","Q","K","A","C","T"},
				{"P","P","P","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"p","p","p","p","p","p","p","p"},
				{"t","c","a","q","k","a","c","t"}
				
			
		};
		for(int i = 0 ; i < matriu.length ; i++) {
			System.out.println();
			for ( int j = 0 ; j < matriu[i].length ; j++) {
				System.out.print(matriu[i][j] + " ");
			}
		}
	}

}
