public class Example2 { 
	public static void main(String[] args) {
	
		int user = 70;

		if (user <= 18) {
			System.out.println("User is younger than 18");
			 }
			 else if (user > 21 && user < 65) {
			System.out.println("User can buy liquor!");
		}
		else if (user >= 18 && user < 21) {
			System.out.println("User is older than 18 and can't buy liquor");
		}
		else {
			System.out.println("WHo cares");
		}
		
		

	}
}