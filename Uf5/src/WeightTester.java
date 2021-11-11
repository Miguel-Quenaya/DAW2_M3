
public class WeightTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {98, 99, 98, 99, 100, 101, 102, 100,
				 104, 105, 105, 106, 105, 103, 104, 103, 105, 106,
				107,
				 106, 105, 105, 104, 104, 103, 102, 102, 102, 100};
				 Weight june = new Weight(values);
				 int avg;
				 avg = june.avg();
				 System.out.println("Average = " + avg );
				 june.pintar();
	}

}
