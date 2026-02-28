package probeklausur;

public class Konto {
	
	private double kontostand;
	
	public void abheben(double sum) throws IllegalArgumentException {
		double test = kontostand - sum;
		if(test < 0) throw new
			IllegalArgumentException("Abzuhebender Betrag größer als Kontostand!");
		
		kontostand = kontostand - sum;
	}
	
	public void einzahlen(double sum) throws IllegalArgumentException {
		if(sum < 0) throw new
			IllegalArgumentException("Einzuzahlender Betrag kleiner als 0!");
		
		kontostand = kontostand + sum;
	}
		
	public void kontostandAusgeben() {
		System.out.println("Kontostand: "+ kontostand);
	}
	public Konto(double kontostand) {
		this.kontostand = kontostand;
	}

}
