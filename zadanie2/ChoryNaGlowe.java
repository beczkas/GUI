package zadanie2;

final class ChoryNaGlowe extends Pacjent {
	ChoryNaGlowe(String imie) {
		super(imie);
	}

	String nazwiskoo() {
		return imie;
	}

	String PodajChorobe() {
		return "glowa";
	}

	String PodajLek() {
		return "aspiryna";
	}
}
