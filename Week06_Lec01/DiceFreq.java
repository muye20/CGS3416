import java.util.Scanner;
import java.util.Random;

public class DiceFreq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int SIDES = 6;
		final int NUM_DICE = 1;
		final int MAX_ROLL = SIDES * NUM_DICE;
		int[] freqCount = new int[MAX_ROLL];

		int numTrials, diceRoll;

		System.out.println("Please enter number of trials to perform");
		numTrials = input.nextInt();
		// seed random number generator
		Random randNum = new Random();

		for (int i = 0; i < MAX_ROLL; i++)
			freqCount[i] = 0;

		for (int i = 0; i < numTrials; i++) {
			diceRoll = randNum.nextInt(6) + 1;  // roll dice
			// System.out.printf("Trial %d, roll = %d\n", i + 1, diceRoll);
			freqCount[diceRoll - 1]++;   // update frequency count
		}

		System.out.printf("%-10s\t%-10s\t%s\n", "Dice Roll", "Frequency",
				"Percentage");
		for (int i = 0; i < MAX_ROLL; i++) {
			System.out.printf("%-10d\t%-10d\t%.2f\n", i + 1, freqCount[i],
					((double) freqCount[i] / numTrials));
		}
		input.close();
	}
}
