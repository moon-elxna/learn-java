package übung03;

public class Alphabet {
	
	public static void main(String args[]) {
		//65 ist die Nummer für A nach Ascii Tabelle
		char letterUpper = 65;
		//90 ist die Nummer für Z nach Ascii Tabelle
		while (letterUpper <= 90) {
			System.out.println(letterUpper);
			letterUpper ++;
		}
		
		System.out.println("---");
		
		// A in char Variable speichern
		char letter = 'A';
		//char in int umwandeln (Nummer nach Ascii Tabelle)
		int letterNumber = letter;
		//Ziel Nummer definieren als Nummer für A + 25 restlichen Buchstaben des Alphabet
		int goalNumber = letter + 25;
		for (int i = letterNumber ; i <= goalNumber; i++) {
			System.out.println(letter);
			letter++;
		}
	}
}