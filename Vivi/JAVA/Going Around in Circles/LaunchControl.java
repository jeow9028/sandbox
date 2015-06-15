public class LaunchControl {
	public static void main(String[] args) {
		System.out.println("We are ready to go in T-minus...");
		for (int count = 10; count >= 0; count --)
			if (count == 8)
			{
				System.out.println("Ignition ready");
			}
			else {
				System.out.println(count + "....... ");
			} 
		System.out.println("All engines are go");
		System.out.println(" Lift off!! We have lift off!");

	}
}