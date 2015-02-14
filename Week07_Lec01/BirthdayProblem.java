import java.util.Random;

public class BirthdayProblem {

	static Random randGen = new Random();
	static final int DAYSINYEAR = 365;

	public static void main(String[] args) {
		int numExperiments = 2000000; // 3 million
		int numOfPeople = 23;
		int matchCount = 0;
		int[] birth_list;
		boolean out_come;
		double percentage;

		if (numOfPeople <= DAYSINYEAR) {
			// repeat experiment
			for (int i = 0; i < numExperiments; i++) {
				birth_list = BirthdayGen(numOfPeople);
				out_come = BirthdayMatch(birth_list);

				if (out_come)
					matchCount++;
			}

			percentage = (double) matchCount / numExperiments;
			System.out.printf("Given %d people in a room.\n", numOfPeople);
			System.out.printf("The chance of having birthday match is %.6f\n",
					percentage);
		} else
			System.out.println("Has more than 365 people, must has a match");

	} // end main

	// randomly generate a list of N birthday
	// and return the list
	// note the syntax of returning an array 
	public static int[] BirthdayGen(int N) {
		int[] birth_list = new int[N];

		for (int i = 0; i < N; i++)
			birth_list[i] = randGen.nextInt(DAYSINYEAR);

		return birth_list;
	} // end BirthdayGen

	// Given a list of birthday
	// return true if it finds a match, otherwise return false
	public static boolean BirthdayMatch(int[] list) {
		boolean hasMatch = false;
		boolean[] hasThisDay = new boolean[DAYSINYEAR];
		int day;

		for (int i = 0; i < DAYSINYEAR; i++)
			hasThisDay[i] = false;

		for (int i = 0; i < list.length; i++) {
			day = list[i];
			if (hasThisDay[day]) {
				hasMatch = true;
				break;
			} else
				hasThisDay[day] = true;
		}

		return hasMatch;
	} // BirthdayMatch
}
