
public class A6_v_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] parells = new int[20];
		int i=0 ,j=0;
		parells[i]= 0;
		while(i !=20) {
			if(j%2==0) {
				parells[i]=j;
				System.out.print(parells[i] + " ");
				i++;
			}
			j++;
		}
	}

}
