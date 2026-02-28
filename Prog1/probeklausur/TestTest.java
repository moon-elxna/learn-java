package probeklausur;

public class TestTest {
	public static void print2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
				
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		int[][] test = {{1,2},{1,2,3},{0}};
		
		print2DArray(test);
	}

}
