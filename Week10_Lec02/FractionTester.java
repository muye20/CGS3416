class Fraction {
	private int numerator = 0; // numerator (and keeps sign)
	private int denominator = 1; // always stores positive value

	public Fraction() {
	}

	public Fraction(int n, int d) {
		if (set(n, d) == false)
			set(0, 1);
	}

	public boolean set(int n, int d) {
		if (d > 0) {
			numerator = n;
			denominator = d;
			return true;
		} else
			return false;
	}

	public String toString() {
		return (numerator + "/" + denominator);
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public double decimal() {
		return (double) numerator / denominator;
	}

	
	// method handles multiplication
	// method takes Fraction as input 
	// Produces Fraction as output
	public Fraction multiply(Fraction f) {
		Fraction ans = new Fraction();

		ans.numerator = numerator * f.numerator;
		ans.denominator = denominator * f.denominator;

		return ans;
	}

	public Fraction divide(Fraction f) {
		Fraction ans = new Fraction();

		ans.numerator = numerator * f.denominator;
		ans.denominator = denominator * f.numerator;

		return ans;
	}
}

public class FractionTester {

	public static void main(String[] args) {

		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(50, 100);
		
		System.out.println(f1.toString());   // print f1
		System.out.println(f2.toString());   // print f2 
		
		
		Fraction f3 = f1.multiply(f2);		// test multiplication
		Fraction f4 = f1.divide(f2);		// test division
		
		System.out.println(f3.toString());   // print f3
		System.out.println(f4.toString());   // print f4 	
	}
}