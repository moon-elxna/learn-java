package übung04;

public class MethodenKorrigieren {
	
	//korrigierte Fehler: return Wert, Parameter des Datentypes
	public static void main(String[] args) {
		System.out.println(rechne(77, 40));
		//Ausgabe: 58.5
		
	}
	
	public static double rechne(double a, double b) {
		double erg = (a + b) / 2;
		return erg;
	}
}
