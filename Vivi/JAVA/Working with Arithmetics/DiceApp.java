public class DiceApp {
	public static void main(String[] args) {
		int roll;
		String msg = " Here are 100 roles from random of the dice:";
		System.out.println(msg);
		for ( int i=0; i<100; i++);
		{

			roll = randomInt(1, 6);
			System.out.println( roll + " ");
		}
		System.out.println();
	}

	}
}