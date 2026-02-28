package übung04;

public class Summe {
	
	public static void main(String[] args) {
		
		System.out.println(summiereIterativ(5));
		System.out.println(summiereRekursive(5));
		
	}
	
	public static int summiereIterativ(int n) {
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			
			sum = sum + i;
			
		}
		
		return sum;
	
	}
	
	
	
	public static int summiereRekursive(int n) {
		
		if(n == 0) { return n;}
		
		return n + summiereRekursive(n - 1);
		
	}
	

}
