package übung01;

public class HelloWorld {
	
	public static void main(String args[]) {
		
		// println = "Print Line", gibt zeichenkette aus und am ende erzeugt Zeilenumbruch
				// äquivalent zu System.out.print("Hello World!"\n)
				System.out.println("Hello World!");

				// Steurzeichen Tabulator \t
				System.out.println("Hello World!\tHello World!");

				// Steurzeichen neue Zeile/Zeilenumbruch \n
				System.out.println("Erste Zeile\nZweite Zeile");
				
				// Ausgabe " in Zeichenkette
				System.out.println("\"Hello World!\"");

				// Berechnung durchführen
				// Arithmetische Operatoren: + , - , * , /
				System.out.print("3 + 5 = ");
				System.out.println(3+5);

				// Konkatenationsoperator/ Verkettungsoperator +
				System.out.println("3 + 5 = " + (3+5));
				
				// Variablen
				int x;
				int y; 
				
				x = 3;  // Zuweisung = Variable wird Wert zugewiesen, "=" Zuweisungszeichen
				y = 5;
				System.out.println("3 + 5 = " + (x+y));
				System.out.println(x + " + " + y + " = " + (x+y));

			
		
	}
}