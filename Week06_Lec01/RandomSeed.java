import java.util.Random;

public class RandomSeed {

	public static void main(String args[]) {
		final int NUM_ITR = 10;
		Random rnd1 = new Random();
		Random rnd2 = new Random();

		int num1, num2;
		for (int i = 0; i < NUM_ITR; i++) {
			num1 = rnd1.nextInt();
			num2 = rnd2.nextInt();
			System.out.println(num1 + " " + num2);
		}
	}
}
