package zadanie3;

public class ReversibleString implements Reversible {

	private String napis;

	ReversibleString(String s) {
		napis = s;
	}

	public Reversible reverse() {

		String reversedString = "";
		int max = napis.length();
		for (int i = max - 1; i >= 0; i--) {
			reversedString += napis.charAt(i);
		}

		napis = reversedString;
		return this;
	}

	public String toString() {
		return napis;
	}
}
