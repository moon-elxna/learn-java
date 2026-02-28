package übung13;

class Klausurvorbereitung {

	private String name;
	
	private static int zaehler = 0;

	Klausurvorbereitung(String name) {
		this.name = name;
		zaehler++;
	}

	static void zaehlerAusgeben() {
		System.out.println("Es gibt " + zaehler + " Objekte der Klasse Klausurvorbereitung.");
	}

	void gruessen() throws IllegalArgumentException {
		if (this.name.isEmpty()) {
			throw new IllegalArgumentException("Name darf nicht leer sein!");
		}
		System.out.println("Hallo, mein Name ist " + name);
	}
}
