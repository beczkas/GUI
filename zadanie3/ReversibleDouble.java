package zadanie3;

public class ReversibleDouble implements Reversible {

	private double liczba;

	ReversibleDouble(double x) {
		liczba = x;
	}

	public Reversible reverse() {

		double reversedDouble = 1.0 / liczba;

		liczba = reversedDouble;
		return this;
	}

	public String toString() {
		return Double.toString(liczba);
	}
}
