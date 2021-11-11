
public class ArraySum2DTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[][] data = {{3, 2, 5},
				{1, 4, 4, 8, 13},
				{9, 1, 0, 2},
				{0, 2, 6, 3, -1, -8}
		};
		//sumamos todos los valores
		for (int row=0; row < data.length; row++) {
			for (int col=0; col < data[row].length; col++) {
				sum += data[row][col];
			}
		} 
		//imprimprimimos el resultado
		System.out.println(sum);
	}

}
