package übung09;

public class MeinKontoTest {
	
	public static void main(String[] args) {
		
		MeinKonto k1 = new MeinKonto();
		MeinKonto k2= new MeinKonto();
		
		//Ueberweisungslimit
		try {
			k1.setUeberweisungslimit(-200);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getUeberweisungslimit());
		
		try {
			k1.setUeberweisungslimit(200);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getUeberweisungslimit());
		
		//Dispolimit
		try {
			k1.setDispolimit(100);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getDispolimit());
		
		try {
			k1.setDispolimit(-100);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getDispolimit());
		
		//einzahlen
		try {
			k1.einzahlen(-100);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getKontostand());
		
		try {
			k1.einzahlen(100);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getKontostand());
		
		//abheben
		try {
			k1.abheben(-100);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getKontostand());
		
		try {
			k1.abheben(100);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getKontostand());
		
		//ueberweisen
		try {
			k1.ueberweisen(k2, 250);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getKontostand()+ ", " + k2.getKontostand());
		
		try {
			k1.ueberweisen(k2, -100);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getKontostand()+ ", " + k2.getKontostand());
		
		try {
			k1.ueberweisen(k2, 150);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getKontostand()+ ", " + k2.getKontostand());
		
		
		try {
			k1.ueberweisen(k2, 50);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(k1.getKontostand()+ ", " + k2.getKontostand());
		
		
	}

}
