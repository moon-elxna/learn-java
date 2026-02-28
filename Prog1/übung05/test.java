package übung05;

public class test {
	
	public static void main(String[] args) {
		
		long sum = 0L;
		for (int i = 0; i < 100000000L; i++) {
			sum += i;	
		}
		System.out.println(sum);
	
	}
}
