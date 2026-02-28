package übung02;

import java.util.Scanner;

public class Aufgabe2_3 {
	public static void main (String args[]) {
		RechteckFlaeche();
		
		FahrenheitCelsiusUmrechnung(60);
		FahrenheitCelsiusUmrechnung(62);
		FahrenheitCelsiusUmrechnung(64);

		Kreisberechnung(3);
		Kreisberechnung(4.25);
		Kreisberechnung(9.6655);
	}

	public static void RechteckFlaeche() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Breite eingeben: ");
		double breite = scan.nextDouble();
		System.out.print("Höhe eingeben: ");
		double hoehe = scan.nextDouble();
		double flaeche = breite * hoehe;
		System.out.println("\nBerechnung der Fläche des Rechtecks mit der Breite "+ breite+" und der Höhe " + hoehe);
		System.out.println("Fläche: " + flaeche);
		scan.close();
	}
	
	public static void FahrenheitCelsiusUmrechnung (int fahrenheit) {
		double celsius = ( 5.0 / 9.0) * ( fahrenheit -32.0);
		System.out.println("\nFahrenheit: " + fahrenheit + ", Celsius: " + celsius);
	}
	
	public static void Kreisberechnung(double kradius) {
		double PI = 3.14;
		double kumfang = 2 * PI* kradius;
		double kflaeche = PI * kradius * kradius;
		System.out.println("\nKreisberechnung:");
		System.out.println("================");
		System.out.println("Radius eingeben:" + kradius);
		System.out.println("Der Kreisumfang mit dem Radius "+ kradius +" beträgt " + kumfang);
		System.out.println("Die Kreisfläche mit dem Radius "+ kradius +" beträgt " + kflaeche);	
	}
	
	public static void DemoEinlesenDouble() {
		 double radius;
		 System.out.print("Zahl eingeben: ");
		 Scanner scan = new Scanner(System.in);
		 radius = scan.nextDouble();
		 System.out.println("Eingelesene Zahl: " + radius);
		 scan.close();
	}
	
}
