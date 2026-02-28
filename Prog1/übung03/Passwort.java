package übung03;
import java.util.Scanner;

public class Passwort {
	public static void main(String args[]) {
		final int PW = 772;
		int i = 1;
		
		do {
			System.out.println("PASSWORD EINLESEN, Versuch "+ i);
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();	
			if(input == PW) {
				System.out.println("WILKOMMEN");
				break;	
			}
			
			else if (input != PW) {
				System.out.println("FEHLER");
				i++;
				if (i == 4) {
					System.out.println("ABBRUCH");
				}
			} 
		}
		while(i<4);		
	}

}
