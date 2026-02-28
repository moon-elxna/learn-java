package übung02;

public class Aufgabe2_1{
	
	
	public static void main (String args[]) {
		
		/*
		 * line 2 - geschweifte statt runde Klammern
		 * line 1 - Groß- statt Kleinschreibung
		 * line 1 - eine rechte runde Klammer zuviel
		 * line 1 - String wurde klein geschrieben
		 * line 2 - eine rechte runde Klammer wurde vergessen
		 * line 3 - eine rechte geschweifte Klammer wurde vergessen
		 * line 2 - System wurde klein geschrieben
		 * line 2 - ein Anführungszeichen wurde vergessen
		 */
		
		System.out.println("225 + 5 = " + (225 + 5));
		System.out.println("225 - 5 = " + (225 - 5));
		System.out.println("225 * 5 = " + (225 * 5));
		System.out.println("225 / 5 = " + (225 / 5));
		System.out.println("225 % 5 = " + (225 % 5));

		int alpha = 225;
		System.out.println("Der Wert von alpha ist: " + alpha);
		int beta = 5;
		System.out.println("Der Wert von beta ist: " + beta);
		
		alpha = 999;
		System.out.println("Der Wert von alpha ist: " + alpha);
		//Ausgabe "Der Wert von alpha ist: 999"
		
		//alpha = 20000000000;
		System.out.println("Der Wert von alpha ist: " + alpha);
		//Fehler "The literal 20000000000 of type int is out of range "
		
		alpha = -2147483648;
		System.out.println("Der Wert von alpha - 1 ist: " + (alpha-1));
		//Ausgabe "Der Wert von alpha - 1 ist: 2147483647"
		
		//boolean trueFalse = 0 ;
		//Fehler "Type mismatch: cannot convert from int to boolean"
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
		System.out.println("nicht a und (b oder c): " + (!a && (b||c)));
		//Ausgabe "false"
		
		int x = 1;
		int y = 0;
		System.out.println("y = "+ y +"; x = " + x);
		//Ausgabe "y = 0; x = 1"
		
		y = x = 0;
		System.out.println("y = "+ y +"; x = " + x);
		//Ausgabe "y = 0; x = 0"
		
		//Erwartung: false, false
		double erg = 0.6;
		double mult = 6*0.1;
		boolean gleich = erg == mult;
		boolean groesser = (mult > erg); //0.06 > 0.6
		System.out.println(gleich);
		System.out.println(groesser);
		//false, true

		//Erwartung: true
		double mini = 0.001;
		double gross = 999999999;
		double ergb = gross + mini - gross;
		System.out.println(ergb == mini);
		//Ausgabe: false
	}
}
