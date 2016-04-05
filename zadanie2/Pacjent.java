package zadanie2;

abstract class Pacjent {
	String imie;

	Pacjent(String imie) {
		this.imie = imie;
	}

	abstract String PodajChorobe();

	abstract String PodajLek();

	String nazwisko() {
		return imie;
	}

	String choroba() {
		return PodajChorobe();
	}

	String leczenie() {
		return PodajLek();
	}
}

