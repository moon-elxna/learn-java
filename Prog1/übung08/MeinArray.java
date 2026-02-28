package übung08;

public class MeinArray {
	
	public static boolean istGleichLang(float[] a1, float[] a2) {
		if(a1.length != a2.length) {
			return false;
		}
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] !=  a2[i]) {
				return false;
			}
		}
		return true;		
	}
	
	public static void printArray(int[] a, boolean type){
		 if (type == true) { 
			 for (int i = 0; i < a.length; i++) {
				 System.out.println(a[i]);	
			} 
		 }
		 else if  (type == false) {	
			for (int i : a) {
				System.out.println(i);	
			}	 
		 }
		 System.out.println(" ");
	}
	
	public static int gibElement(int[] a, int i) {
		if (a.length >= (i+1)) {
			return a[i];
		}
		return Integer.MIN_VALUE;
	}
	
	public static int summiere(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+= a[i];	
		}
		return sum;
	}
	
	public static double mittelwert(int[] a) {
		return ((double)MeinArray.summiere(a))/((double)a.length);		
	}
	
	public static int max(int[] array) {
		//wenn array nur einen Wert hat 
		if( array.length <= 2) {
			return array[0];
		}
		//Array kopieren, damit og array nicht verändert wird
		int[] a = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			a[i] = array[i];
		}
		//Bubblesort Algortihmus
		for (int i = 0; i < (a.length - 1); i++) {
			int x = a.length -a.length; //0
			int y = a.length - (a.length -1); //1
			for (int j = 0; j < (a.length - 1); j++) {
				if(a[x] > a[y]) {	
					int tempY = a[y];
					a[y] = a[x];
					a[x] = tempY;		
					x += 1; y += 1;
				}		
			}
		}	
		//höchste Stelle zurückgeben
		return a[(a.length -1)];	
	}
		 
	public static int gibErstenIndexUngleicherElemente(char[] a1, char[] a2) {
		if(a1.length < a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if(a1[i] != a2[i]) {	
					return i;	
				}
			}	
		}
		else{	
			for (int i = 0; i < a2.length; i++) {
				if(a1[i] != a2[i]) {	
					return i;	
				}
			}		
		}
		return -1; 
		//Fehlercode -1 : 
		//keine ungleichen Elemente gefunden, 
		//wenn Array von ungleicher Länge nur bis zum höchsten Index des kürzeren Arrays verglichen
	}	
	
	public static char gibErstesUngleichesElement(char[] a1, char[] a2) {
		if(a1.length < a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if(a1[i] != a2[i]) {	
					return a1[i];	
				}
			}	
		}
		else {	
			for (int i = 0; i < a2.length; i++) {
				if(a1[i] != a2[i]) {	
					return a1[i];	
					}
			}
		}
		return '\u0000';
	}
	
}



