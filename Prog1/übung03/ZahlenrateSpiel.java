package übung03;
import java.util.Scanner;

public class ZahlenrateSpiel {
	
	public static void main(String args[]) {
		
		System.out.print("Willkomen zum Zahlenraten-Spiel! \nErrate die Zufallszahl zwischen 1 und 20.\n\n");
		
		int randomNumber = 1 + (int)(Math.random() * (20 - 1 + 1)) ;
		int guessedNumber;
		int i = 1;
		
		do {	
			System.out.print(i + ". Versuch: ");
			i++;
			Scanner sc = new Scanner(System.in);
			guessedNumber = sc.nextInt();
			System.out.println("");
			
			if(randomNumber == guessedNumber) {
				System.out.println("Du hast gewonnen! Du hast " + (i-1) + " Versuch/e gebraucht");
				
			}
			
			else if (randomNumber > guessedNumber) {
				System.out.println("→ Die Zufallszahl ist größer.\n");	
			}
			
			else if (randomNumber < guessedNumber) {
				System.out.println("→ Die Zufallszahl ist kleiner.\n");
			}
			
			else {
				System.out.print("Fehler");
			}
			
		}
		while (randomNumber != guessedNumber);
		
	}

}
