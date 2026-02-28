package übung05;

public class Konstanten {

	public static void main(String[] args) {
		
		stars(1,15);
		
	}
	
	public static void stars(final int lower, final int upper) {
		
		final char STAR = '*';
		
		//ascending 
		for (int i = lower; i <= upper; i++) {
			
			for (int j = lower; j <= i; j++) {
				
				System.out.print(STAR);
				
			}	
			
			System.out.print("\n");
			
		}
		
		//descending
		for (int i = lower; i <= upper; i++) {
			
			for (int j = upper; j >= i; j--) {
				
				System.out.print(STAR);
				
			}
			
			System.out.print("\n");
			
		}
		
	}
}
