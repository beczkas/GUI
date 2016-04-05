package zadanie2;

final class ChoryNaDyspepsje extends Pacjent {
	ChoryNaDyspepsje(String imie) {
		super(imie);
	}

	String nazwiskoo() {
		return imie;
	}

	String PodajChorobe() {
		return "dyspepsja";
	}

	String PodajLek() {
		return "węgiel";
	}
}
