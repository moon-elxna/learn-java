package tutorium;

public class BedingteAusgabe2 {
	
	public static void main(String[] args) {
		
		int x = 12;
		int y = 14;
		int z = 10;
		
		if (x > y) {	
			
			if(x > z) {
				System.out.println(x);
			}
			else {
				System.out.println(z);
			}
			
		}
		else if (x < y) {
			
			if(y > z) {
				System.out.println(y);
			}
			else {
				System.out.println(z);
			}
				
		}
	}
}
