package üben;

public class Konto {
	
	private int kontonr;
	private double kontostand;
	private double überweisungslimit;
	private double dispolimit;
	private int kontoAnzahl;
	public int getKontonr() {
		return kontonr;
	}
	public double getKontostand() {
		return kontostand;
	}
	public double getÜberweisungslimit() {
		return überweisungslimit;
	}
	public double getDispolimit() {
		return dispolimit;
	}
	public void setÜberweisungslimit(double überweisungslimit) {
		this.überweisungslimit = überweisungslimit;
	}
	public void setDispolimit(double dispolimit) {
		this.dispolimit = dispolimit;
	}
	public void einzahlen(double sum) throws IllegalArgumentException{
		if(sum <= 0) throw new
			IllegalArgumentException("Betrag muss größer als 0 sein!");
		if(kontostand > kontostand + sum) throw new
			IllegalArgumentException("Betrag muss größer als 0 sein!");
		
		kontostand = kontostand + sum;
	}
	public void überweisen(double sum) {
		if(sum <= 0) throw new
			IllegalArgumentException("Betrag muss größer als 0 sein!");
		kontostand = kontostand - sum;
	}
	public void abheben(double sum) {
		if(sum <= 0) throw new
			IllegalArgumentException("Betrag muss größer als 0 sein!");
		kontostand = kontostand - sum;
	}
	public Konto(double kontostand, double überweisungslimit, double dispolimit) throws IllegalArgumentException{
		if(überweisungslimit <= 0) throw new
			IllegalArgumentException("Überweisungslimit muss größer als 0 sein!");
		if(dispolimit < 0) throw new
			IllegalArgumentException("Dispolimit muss kleiner als 0 sein!");
		if(kontostand < 0) throw new
			IllegalArgumentException("Kontostand kann nicht negativ sein!");
			
		kontoAnzahl++;
		kontonr = kontoAnzahl;
		this.kontostand = kontostand;
		this.überweisungslimit = überweisungslimit;
		this.dispolimit = dispolimit;
	}
	
	public String toString() {
		return String.format("Konto Nr.: %d\nKontostand: %f\nÜberweisungslimit: %f\nDispolimit: %f\n",getKontonr(), getKontostand(), getÜberweisungslimit(), getDispolimit());
	}
	public int getKontoAnzahl() {
		return kontoAnzahl;
	}
	
	

}
