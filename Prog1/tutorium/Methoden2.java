package tutorium;

public class Methoden2 {
	
	public static void main(String[] args) {
		System.out.println(mehrfacheAusgabe("Hallo"));
		
	}
	
	public static int mehrfacheAusgabe(String input) {
		final int AUSGABE_ANZAHL = 5;
		
		for (int i = 0; i < AUSGABE_ANZAHL; i++) {
			System.out.println(input);		
		}
		
		return AUSGABE_ANZAHL;
	}

}
