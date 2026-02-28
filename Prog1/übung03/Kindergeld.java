package übung03;

public class Kindergeld { 
	
	public static void main(String[] args) {
		
	 int anzahlKinder = 1;
	 int kindergeld;
	 
	 switch (anzahlKinder) {
	 
		 case 0: kindergeld = 0; break;
		 case 1: kindergeld = 1000; break;
		 case 2: kindergeld = 2200; break; 
		 default: kindergeld = anzahlKinder * 1500;
	 }
	 
	 System.out.println("Kindergeld beträgt " + kindergeld + " EUR.");
	 }

	//ausgabe "Kindergeld beträgt 1000 EUR."
	//ausgabe a) "Kindergeld beträgt 1000 EUR." 
	//ausgabe b) "Kindergeld beträgt 2200 EUR."
	//ausgabe c) "Kindergeld beträgt 1500 EUR."

}
