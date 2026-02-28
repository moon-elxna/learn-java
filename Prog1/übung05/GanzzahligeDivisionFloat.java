package übung05;

public class GanzzahligeDivisionFloat {
	
	public static void main(String[] args) {
		
		System.out.println(integerDivision(4.0f, 2.5f));
		
	}
	
	public static int integerDivision (float a, float b) {
		
		int result = (int)a / (int)b;
		
		return  result;
	}

}
