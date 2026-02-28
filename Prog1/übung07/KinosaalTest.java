package übung07;

public class KinosaalTest {
	public static void main(String[] args) {
		
		Kinosaal k1 = new Kinosaal();
		k1.setAnzahlSitzplaetzeSaal(35);
		k1.printInfo(); 
		
		Kinosaal k2 = new Kinosaal();
		k2.setAnzahlSitzplaetzeSaal(50);
		k2.printInfo(); 
		
		Kinosaal k3 = new Kinosaal();
		k3.setAnzahlSitzplaetzeSaal(100);
		k3.printInfo(); 
		
		System.out.println("Gesamtzahl Sitzplaetze: " + Kinosaal.getAnzahlSitzplaetzeKino());
		System.out.println("Anzahl der Kinosäle: " + Kinosaal.getAnzahlKinosaele());
		
		/*
		Ausgabe
		SaalNr: 1 hat 35 Sitzplaetze
		SaalNr: 2 hat 50 Sitzplaetze
		SaalNr: 3 hat 100 Sitzplaetze
		Gesamtzahl Sitzplaetze: 185
		Anzahl der Kinosäle: 3
		*/		
	}
}
