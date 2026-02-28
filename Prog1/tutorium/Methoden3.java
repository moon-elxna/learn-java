package tutorium;

public class Methoden3 {
	
	public static void main(String[] args) {
		System.out.println(berechneAddition(1, 2, 3, 4));
		System.out.println(berechneDivision(5, 2));
		gibZahlenAus(10);
		
	}

	public static int berechneAddition(int a, int b, int c, int d) {
		
		return a + b + c + d;	
	}
	
	public static double berechneDivision(int a, int b) {
		
		return (double)(a) /(double)(b);	
	}
	
	public static void gibZahlenAus(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}
}
