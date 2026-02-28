package übung03;


public class Dosenberechnung {
	
	public static void main (String[] args) {
		
		final double PI = 3.141592;
		double u, h;
		
		u = 40; // geeignete Testwerte einbauen
		
		h = 15; // geeignete Testwerte einbauen
		
		System.out.println("Laenge des Blechs (Umfang der Dose): " + u);
		
		System.out.println("Breite des Blechs (Hoehe der Dose): "+ h);
		
		double dboden = u/PI;
		System.out.println("Durchmesser des Dosenbodens: " + dboden);
		
		double fboden =  PI*((dboden/2.0)*(dboden/2.0));
		System.out.println("Flaeche des Dosenbodens: " + fboden);
		
		double fmantel = u*h;
		System.out.println("Mantelflaeche der Dose: " + fmantel);
		
		double fgesamt = 2.0* fboden + fmantel;
		System.out.println("Gesamtflaeche der Dose: " + fgesamt);
		
		double v = fboden * h;
		System.out.println("Volumen der Dose: " + v);
	}
	
}