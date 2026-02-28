package übung04;

public class Stellenberechnung {
	

	public static void main(String[] args) {
		
		System.out.println(berechneStellenIterativ(9876543));
		System.out.println(berechneStellenRekursiv(9876543));
		
	}
	
	public static int berechneStellenIterativ(int n) {
		
		for (int i = 1; i < 1000000; i++) {
			
			n = n /10;
			
			if (n < 1) { return i; }
			
		}
		
		return 0;
	}
	
	public static int berechneStellenRekursiv(int n) {

		if (n < 1) { return n; }
		
		return 1 + berechneStellenRekursiv(n/10);
		
	}

}