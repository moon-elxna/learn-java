package übung03;
import java.util.Scanner;

public class DosenberechnungAuswahl {
	
	public static void main (String[] args) {
		
		final double PI = 3.141592;
		double u, h;
		int i;
		u = 40; // geeignete Testwerte einbauen
		h = 15; // geeignete Testwerte einbauen
		
		System.out.print("DOSENBERECHNUNG\r\n"
				+ "Berechnung (Zahl eingeben)\r\n"
				+ "-----------------------------------\r\n"
				+ "Durchmesser des Dosenbodens (1)\r\n"
				+ "Flaeche des Dosenbodens (2)\r\n"
				+ "Mantelflaeche der Dose (3)\r\n"
				+ "Gesamtflaeche der Dose (4)\r\n"
				+ "Volumen der Dose (5)\r\n"
				+ "Programmende (0)\n");
		
		do {
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			System.out.println("Ihre Auswahl: " + i);
			
			double dboden = u/PI;
			double fboden =  PI*((dboden/2.0)*(dboden/2.0));
			double fmantel = u*h;
			double fgesamt = 2.0* fboden + fmantel;
			double v = fboden * h;
			
			switch(i) {
			
				case 1: System.out.println("Durchmesser des Dosenbodens: " + dboden + "\n"); break;
				case 2: System.out.println("Flaeche des Dosenbodens: " + fboden + "\n"); break;
				case 3: System.out.println("Mantelflaeche der Dose: " + fmantel + "\n"); break;
				case 4: System.out.println("Gesamtflaeche der Dose: " + fgesamt + "\n"); break;
				case 5: System.out.println("Volumen der Dose: " + v + "\n"); break;
				case 0: System.out.println("Programmende");break;
				
				default: System.out.println("Ungueltige Eingabe"); break;
			
			}
		}
		while(i != 0);
		

		
	}
	
}