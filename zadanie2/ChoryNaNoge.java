package zadanie2;

final class ChoryNaNoge extends Pacjent {
	ChoryNaNoge(String imie) {
		super(imie);
	}

	String nazwiskoo() {
		return imie;
	}

	String PodajChorobe() {
		return "noga";
	}

	String PodajLek() {
		return "gips";
	}
}
