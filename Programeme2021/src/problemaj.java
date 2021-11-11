import java.util.Scanner;

public class problemaj {
	
	static boolean caso(Scanner sc) {
		
		if(!sc.hasNextInt()) {
			
			return false;
		}
		
		int num = sc.nextInt();
		String nums = "";
		for(int i = 0 ; i < Integer.toString(num).length() ; i++) {
			nums +="1";
		}
		int sol=Integer.parseInt(nums);
		
		do {
			
			if(sol%num!=0) {
				sol = (sol*10)+1;
			}
		}while(sol%num!=0);
		System.out.println(Integer.toString(sol).length());
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(caso(sc));
	}

}
