abstract class Card {
	String recipient;

	public abstract void greeting();
}

class Holiday extends Card {
	public Holiday(String r) {
		recipient = r;
	}

	public void greeting() {
		System.out.println("Dear " + recipient + ",\n");
		System.out.println("Season's Greetings!\n\n");
	}
}

class Birthday extends Card {
	int age;

	public Birthday(String r, int years) {
		recipient = r;
		age = years;
	}

	public void greeting() {
		System.out.println("Dear " + recipient + ",\n");
		System.out.println("Happy " + age + "th Birthday\n\n");
	}
}

class Valentine extends Card {
	int kisses;

	public Valentine(String r, int k) {
		recipient = r;
		kisses = k;
	}

	public void greeting() {
		System.out.println("Dear " + recipient + ",\n");
		System.out.println("Love and Kisses,\n");
		for (int j = 0; j < kisses; j++)
			System.out.print("X");
		System.out.println("\n\n");
	}
}

public class CardTester {
	public static void main(String[] args) {
		String me = "Muye";

		Holiday hol = new Holiday(me);
		hol.greeting();

		Birthday bd = new Birthday(me, 21);
		bd.greeting();

		Valentine val = new Valentine(me, 7);
		val.greeting();

		// Polymorphism
		Card card1 = new Holiday("Amy");
		card1.greeting(); // Invoke a Holiday greeting()

		Card card2 = new Valentine("Bob", 3);
		card2.greeting(); // Invoke a Valentine greeting()

		Card card3 = new Birthday("Cindy", 17);
		card3.greeting(); // Invoke a Birthday greeting()
	}
}