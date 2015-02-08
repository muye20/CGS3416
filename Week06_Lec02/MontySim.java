import java.util.Random;

public class MontySim {

	static Random randNum = new Random();
	static final int NUM_DOORS = 3;

	public static void main(String[] args) {
		int[] door_list = new int[NUM_DOORS];
		int trials = 3000000; // run this game 3 million times
		int win_count = 0;
		boolean outcome;
		boolean isSwitch = true;

		// repeat 3 million times
		for (int i = 0; i < trials; i++) {
			DoorInit(door_list);
			outcome = Simulation(door_list, isSwitch);

			if (outcome)
				win_count++;
		}

		System.out.println("Total number of simulation " + trials);
		System.out.println("Have won the game " + win_count + " times");
		System.out.println("Winning rate is about " + ((double) win_count / trials));
	}

	// arrange car and goats randomly
	public static void DoorInit(int[] doors) {
		
		for (int i = 0; i < doors.length; i++)
			doors[i] = 0; // 0 means goat behind door i
		
		// randomly select a door number, say 'car_door'
		int car_door = randNum.nextInt(NUM_DOORS); 
		doors[car_door] = 1;  // 1 means car behind door 'car_door'
	}

	// Monty hall simulation
	public static boolean Simulation(int[] doors, boolean SWITCH_DOOR) {

		boolean win = false;
		// randomly pick a door to open
		int door_pick = randNum.nextInt(NUM_DOORS);

		if (SWITCH_DOOR) {
			boolean has_car = false;

			for (int i = 0; i < NUM_DOORS; i++) {
				if (i == door_pick)
					continue;

				if (doors[i] == 1) {
					has_car = true;
					break;
				}
			}

			if (has_car)
				win = true;
		} else { 
			// Non-switch will occur after deciding door
			// the door happens to have car behind
			if (doors[door_pick] == 1)
				win = true;
		}

		return win;
	}
}
