public class NestedLoop {
	public static void main(String[] args) {
		for (int x = 1; x < 10; x ++)
		{
			for (int y = 1; y < 10; y++)
				System.out.println(x + " - " + y + "  ");
			System.out.println();
		}
	}
}