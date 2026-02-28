package übung13;

public class KlausurvorbereitungTest {

	public static void main(String[] args) {
		
		int anzahl = 5;
		
		Klausurvorbereitung[] array = new Klausurvorbereitung[anzahl];

		for (int i = 0; i < array.length; i++) {
			array[i] = new Klausurvorbereitung("Objekt" + (char)(i+65));			
			array[i].gruessen();
		}

		Klausurvorbereitung.zaehlerAusgeben();

		try {
			Klausurvorbereitung leeresObjekt = new Klausurvorbereitung("");
			leeresObjekt.gruessen();
		}catch (IllegalArgumentException e) {
			System.out.println("Ausnahme gefangen: " + e.getMessage());
		}
	}
}
