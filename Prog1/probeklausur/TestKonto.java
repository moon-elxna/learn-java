package probeklausur;

public class TestKonto {
	public static void main(String[] args) {
		Konto k1 = new Konto(100.50);
		try { 
		k1.abheben(120.55);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try { 
		k1.einzahlen(36.70);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try { 
		k1.kontostandAusgeben();
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
