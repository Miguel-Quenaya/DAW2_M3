
public class Weight {
	
	private int [] values;
	public Weight(int [] values) {
		this.values = values;
	}
	
	public int avg () {
		int suma = 0;
		for(int i : values) {
			suma += i;
		}
		return (suma/values.length);
	}
	public void pintar() {
		for(int i : values) {
			System.out.println(i);
		}
	}
}
