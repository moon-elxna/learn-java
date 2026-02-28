package üben;

public class Array {
	
	//Übungsaufgaben 8 + Exceptions
	public static boolean istGleichLang(float[] arr1, float[]arr2) throws NullPointerException {
		if(arr1 == null || arr2 == null) throw new
			NullPointerException("Array kann nicht null sein!");
		
		if(arr1.length == arr2.length) {
			return true;
		}
		
	return false;	
	}
	
	public static void printArray(int[] arr) throws NullPointerException {
		if(arr == null) throw new
			NullPointerException("Array kann nicht null sein!");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}
	
	public static int gibElement(int[] arr, int i) throws NullPointerException, IllegalArgumentException {
		if(arr == null) throw new
			NullPointerException("Array kann nicht null sein!");
		if(i >= arr.length) throw new
			IllegalArgumentException("Index liegt außerhalb des Arrays!");
		
		return arr[i];
	}
	
	public static int summiere(int[] arr) throws NullPointerException {
		if(arr == null) throw new
			NullPointerException("Array kann nicht null sein!");
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		return sum;
	}
	
	public static double mittelwert(int[] arr) throws NullPointerException {
		if(arr == null) throw new
			NullPointerException("Array kann nicht null sein!");
		
		double sum = summiere(arr);
		double len = arr.length;
		return (sum/len);
	}
	
	public static int maxIndex(int[] arr) throws NullPointerException {
		if(arr == null) throw new 
			NullPointerException("Array kann nicht null sein!");
		return (arr.length - 1);
	}
	
	public static int gibErstenIndexUngleicherElemente(char[] arr1, char[] arr2) 
			throws NullPointerException, IllegalArgumentException {
		if(arr1 == null || arr2 == null) throw new
			NullPointerException("Array kann nicht null sein!");
		if (arr1.length != arr2.length)throw new
			IllegalArgumentException("Arrays müssen gleich lang sein!");
		
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return i;
			}			
		}
		System.out.println("Keine Ungleichen Elemente gefunden!");
		return -1;
	}
	
	public static char gibErstesUngleichesElement(char[] arr1, char[] arr2) 
			throws NullPointerException, IllegalArgumentException {
		if(arr1 == null || arr2 == null) throw new
		NullPointerException("Array kann nicht null sein!");
		if (arr1.length != arr2.length)throw new
			IllegalArgumentException("Arrays müssen gleich lang sein!");
	
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return arr1[i];
			}			
		}
		System.out.println("Keine Ungleichen Elemente gefunden!");
		return 0; //kA ob 0 ne gute Idee als ungültiger return wert ist
	}
	
	//Übungsaufgaben 10
	public static int[] verkette(int[] arr1, int[] arr2) throws NullPointerException {
		if(arr1 == null || arr2 == null) throw new
			NullPointerException("Array kann nicht null sein!");
		
		int[] arr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr[i + arr1.length] = arr2[i];
			
		}
		return arr;
	}
	
	//Sortieralgos
	
	//Selectionsort
	
	

		
}

