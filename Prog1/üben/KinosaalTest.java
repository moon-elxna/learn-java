package üben;

public class KinosaalTest {
	public static void main(String[] args) {
		Kinosaal k1 = new Kinosaal(35);
		System.out.println(k1);
		Kinosaal k2 = new Kinosaal(50);
		System.out.println(k2);
		Kinosaal k3 = new Kinosaal(100);
		System.out.println(k3);
		System.out.printf("Gesamt Anzahl Sitplätze: %d\n",Kinosaal.getAnzahlSitzplaetzeKino());
		System.out.printf("Anzahl Kinosäle: %d\n",Kinosaal.getAnzahlKinosaele());
	}
}
