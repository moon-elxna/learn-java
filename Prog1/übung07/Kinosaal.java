package übung07;

public class Kinosaal {
	
	// parameterlose Konstruktor
	public Kinosaal() {
		anzahlKinosaele++;
		saalNummer = anzahlKinosaele;
	}
	
	//Instanzvariablen
	private int saalNummer;
	private int anzahlSitzplaetzeSaal;
	
	//Klassenvariablen
	private static int anzahlSitzplaetzeKino = 0;
	private static int anzahlKinosaele = 0;

	//get- und set-Methode (Instanzmethoden)
	public int getSaalNummer() {
		return saalNummer;
	}

	public void setSaalNummer(int saalNummer) {
		this.saalNummer = saalNummer;
	}
	
	public int getAnzahlSitzplaetzeSaal() {
		anzahlSitzplaetzeKino += anzahlSitzplaetzeSaal;
		return anzahlSitzplaetzeSaal;
	}

	public void setAnzahlSitzplaetzeSaal(int anzahlSitzplaetzeSaal) {
		this.anzahlSitzplaetzeSaal = anzahlSitzplaetzeSaal;
	}

	//zwei Klassenmethoden 
	public static int getAnzahlSitzplaetzeKino() {
		return anzahlSitzplaetzeKino;
	}

	public static int getAnzahlKinosaele() {
		return anzahlKinosaele;
	}

	//print()-Methode
	public void printInfo() {
		System.out.println(String.format("SaalNr: %s hat %s Sitzplaetze", getSaalNummer(), getAnzahlSitzplaetzeSaal()));
	}
}
