package übung09;

public class MeinKonto {
	
	private float kontostand;
	private float ueberweisungslimit;
	private float dispolimit;
	
	public float getKontostand() {
		return kontostand;
	}
	
	public void setKontostand(float kontostand) {
		this.kontostand = kontostand;
	}
	
	public float getUeberweisungslimit() {
		return ueberweisungslimit;
	}
	
	public void setUeberweisungslimit(float ueberweisungslimit) { 
		
		if (ueberweisungslimit < 0) throw new 
			IllegalArgumentException("Überweisungslimit kann nicht negativ sein");
	
		this.ueberweisungslimit = ueberweisungslimit;
	}
	
	public float getDispolimit() {
		return dispolimit;
	}
	
	public void setDispolimit(float dispolimit) {
		
		if (dispolimit > 0) throw new 
			IllegalArgumentException("Dispolimit kann nicht positiv sein");
		
		this.dispolimit = dispolimit;
	}
	
	public void einzahlen(float summe) {
		
		if (summe < 0) throw new 
			IllegalArgumentException("Einzahlungsbetrag kann nicht negativ sein");
		
		setKontostand(getKontostand()+summe);
	}
	
	public void abheben(float summe) {
		
		if (summe < 0) throw new 
			IllegalArgumentException("Abhebungsbetrag kann nicht negativ sein");
		
		setKontostand(getKontostand()-summe);
	}
	
	public void ueberweisen(MeinKonto b, float summe) {
		
		if (summe > getUeberweisungslimit() ) throw new 
			IllegalArgumentException("Überweisungsbetrag kann nicht das Überweisungslimit übersteigen");
		
		if ( summe < 0) throw new 
		IllegalArgumentException("Überweisungsbetrag kann nicht negativ sein");
		
		if ( (getKontostand()-summe) < getDispolimit()) throw new 
		IllegalArgumentException("Überweisung kann nicht ausgeführt werden, da Kontostand nach Überweisung Dispolimit überschreiten würde");
		
		setKontostand(getKontostand()-summe);
		b.setKontostand(b.getKontostand()+summe);
		
	}

	
	
	
	
	
}
