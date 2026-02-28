package üben;

public class Kinosaal {
	/*
	● einen parameterlosen Konstruktor,
	● zwei Instanzvariablen saalNummer und anzahlSitzplaetzeSaal,
	● zwei Klassenvariablen anzahlSitzplaetzeKino und anzahlKinosaele,
	● eine get- und set-Methode (Instanzmethoden), um die Anzahl der Sitzplätze eines Saals
	auszulesen bzw. festzulegen,
	Übungen zu Programmierung 1
	2
	● zwei Klassenmethoden getAnzahlSitzplaetzeKino() sowie getAnzahlKinosaele(),
	um die beiden Klassenvariablen auszulesen,
	● eine print()-Methode, welche die Informationen zu einem Kinosaal (d.h. seine
	Instanzvariablen) auf dem Bildschirm schreibt.
	Die Klasse KinosaalTest ist eine Wrapper-Klasse und enthält nur die Methode main(). In
	dieser Methode soll die Klasse Kinosaal getestet werden. Hierzu sollen drei Kinosäle mit
	35, 50 bzw. 100 Sitzplätzen angelegt werden. Alle Variablen sollen vom Typ int und private
	sein.
	Implementieren Sie die Klasse Kinosaal. Bei jedem Erzeugen eines Kinosaals soll der Wert
	der Variablen anzahlKinosaele um 1 erhöht werden. Jeder Kinosaal soll beim Erzeugen
	eine eindeutige Nummer saalNummer erhalten, die direkt aus der Anzahl der Kinosäle
	abgeleitet wird.
	Mit der Methode
	public void setAnzahlSitzplaetzeSaal(int anzahlSitzplaetzeSaal)
	soll für einen neu erzeugten Kinosaal die Anzahl der Sitzplätze eines Saals,
	anzahlSitzplaetzeSaal, gesetzt werden. Dabei soll die Klassenvariable
	anzahlSitzplaetzeKino um den Wert der Instanzvariable anzahlSitzplaetzeSaal
	erhöht werden
	*/
	
	private int saalNummer;
	private int anzahlSitzplaetzeSaal;
	private static int anzahlSitzplaetzeKino;
	private static int anzahlKinosaele;
	
	public int getAnzahlSitzplaetzeSaal() {
		return anzahlSitzplaetzeSaal;
	}
	public static int getAnzahlSitzplaetzeKino() {
		return anzahlSitzplaetzeKino;
	}
	public static int getAnzahlKinosaele() {
		return anzahlKinosaele;
	}
	public int getSaalNummer() {
		return saalNummer;
	}
	public String toString() {
		return String.format("Kinosaal %d: %d Sitzplätze", getSaalNummer(), getAnzahlSitzplaetzeSaal());
	}
	public Kinosaal(int anzahlSitzplaetzeSaal) {
		this.anzahlSitzplaetzeSaal = anzahlSitzplaetzeSaal;
		anzahlSitzplaetzeKino = anzahlSitzplaetzeKino + anzahlSitzplaetzeSaal;
		anzahlKinosaele++;
		saalNummer = anzahlKinosaele;
	}
	
	
	

}
