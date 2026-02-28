package übung09;

public class MeinArrayExceptions {
	
	public static int gibElement(int[] a, int i) throws NullPointerException, ArrayIndexOutOfBoundsException {
		if(a == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
		if(i >= a.length || i < 0)throw new
			ArrayIndexOutOfBoundsException("Index leigt außerhalb des Arrays!");
		
		if (a.length >= (i+1)) {
			return a[i];
		}
		return Integer.MIN_VALUE;
	}

	public static int max(int[] array) throws NullPointerException {
		if(array == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
		
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
	
	public static int gibErstenIndexUngleicherElemente(char[] a1, char[] a2) throws NullPointerException {
		if (a1 == null || a2 == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
		
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
	
	public static char gibErstesUngleichesElement(char[] a1, char[] a2) throws NullPointerException {
		if(a1 == null || a2 == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
		
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
