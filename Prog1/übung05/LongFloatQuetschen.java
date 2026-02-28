package übung05;

public class LongFloatQuetschen {
	
	public static void main(String[] args) {
		
		long maxLong =  Long.MAX_VALUE;
		System.out.println("Startwert: " + maxLong);
		
		float maxLongFloat = (float) maxLong;
		System.out.println("Float: " + maxLongFloat);
		
		long maxLongFloatLong = (long) maxLongFloat;
		System.out.println("Endwert: " + maxLongFloatLong);
		
		if(maxLong == maxLongFloatLong) {
			System.out.println("Startwert entspricht Endwert");
		}
		
		
	}
	
	

}
