package übung04;

public class PotenzenBerechenen {
	public static void main(String[] args) {
		
		System.out.println(potenziere(3, 4));
		//wenn b <= 0, dann ergebnis falsch
		
	}
	
	public static int potenziere(int a, int b) {
		
		int potenz = 0;
		boolean negativ = false;
		int n = a;
		
		if (b < 0) { b = -b; negativ = true;}

		for (int i = 1; i < b; i++) {
			
			potenz = 0;
			
			for (int j = 0; j < n; j++) {
			
				potenz = potenz + a;
				
			}
			
			a = potenz;
		
		}
		
		if (negativ == true) { potenz = -potenz;}
		
		return potenz;
	}
	
}

