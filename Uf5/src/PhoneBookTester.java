import java.util.Scanner;

public class PhoneBookTester {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String name= "violet Smith";
		 PhoneBook pb = new PhoneBook();
		 // Search for "Violet Smith"
		 do {
			 System.out.println("Name? ");
			 name = sc.nextLine();
			 String entry = pb.search( name );
			 if (name.equalsIgnoreCase("quit")) {
				 System.out.println("Good-by");
			 }else {
				 System.out.println(entry );
			 }
		 }while(!name.equalsIgnoreCase("quit"));
		 } 
}
