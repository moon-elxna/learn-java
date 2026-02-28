package übung03;
import java.util.Scanner;


public class PrüfungPunkte {
	
	public static void main (String args[]) {
		PrüfungPunkte();
	}	
	 
	public static void PrüfungPunkte() { 
		//input punkte
		System.out.print("Punkte eingeben: \n");
		Scanner scan = new Scanner(System.in);
		int punkte = scan.nextInt();
		//Prüfunge ob punkte für bestanden ausreichen
		if(punkte >= 50) {
			System.out.println("bestanden");
		}
		
		else if (punkte < 50) {
			
			//input zusatzpunkte
			System.out.print("Zusatzpunkte eingeben: \n");
			Scanner scan1 = new Scanner(System.in);
			int zusatzpunkte = scan1.nextInt();
			int summe = punkte + (zusatzpunkte / 2);
			
			//Prüfunge ob punkte und zusatzpunkte für bestanden ausreichen
			if (summe >= 50) {
				System.out.println("bestanden");
			}
			else if(summe < 50) {
				System.out.println("nicht bestanden");
			}
			else {
				System.out.println("Fehler");
			}
		}
		
		else {
			System.out.println("Fehler");
		}

	}

}
