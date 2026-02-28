package probeklausur;

public class TestGgT {
	public static void main(String[] args) {
		int[][] arrayTest = {{24,15},{12,-9},{27,81},{10,10}};
		try {
			GgT.gibGgTAus(arrayTest);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}
}
