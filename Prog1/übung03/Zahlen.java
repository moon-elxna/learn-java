package übung03;

public class Zahlen {
	
	public static void main(String args[]) {
		
		int num = 1;
		
		for (int i = 0; i < 10; i++) {
			
			String numRow = "";
			String numForm = "";
			
			for (int e = 0; e < 10; e++) {
				
				String sp1 = " ";
				String sp2 = "  ";
				
				if(num < 10) {
					numForm = sp2 + num + sp2;
				}
				
				else if (num < 100) {
					numForm = sp1 + num + sp2;
				}
				
				else if (num < 1000) {
					numForm = num + sp2;
				}
				
				numRow = numRow + numForm;
				num++;	
	
			}
			
			System.out.println(numRow);
			
		}
	
	}
}
