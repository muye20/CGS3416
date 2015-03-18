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
}