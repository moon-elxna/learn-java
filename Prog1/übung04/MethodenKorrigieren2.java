package übung04;

public class MethodenKorrigieren2 {
	
	public static void main(String[] args) {
		System.out.println(multipliziere(-5, -11));
		
	}
	
	public static int multipliziere(int x, int y) {
		
		int produkt = 0;
		boolean negativ = false;
		
		if (y < 0) { y = -y; negativ = true;}
		
		for (int i = 0; i < y; i++) {
			
			produkt = produkt + x;
		
		}
		
		if (negativ == true) { produkt = -produkt;}
		
		return produkt;
	}
	
}
