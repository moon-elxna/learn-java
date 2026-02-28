package übung05;

public class Kreisumfang {
	
	public static void main(String[] args) {
		
		System.out.println(kreisumfang(3.25));
		System.out.println(kreisumfang(5.3));
		
	}
	
	public static double kreisumfang(double r) {

		final double PI = 3.14;
		return 2 * PI * r;	
		
	}
}
