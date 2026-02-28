package übung10;

public class Array {
	
	public static void print(int[] a) throws NullPointerException {
		if (a == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		} 
		System.out.println("");

	}
	
	public static int[] concatenate(int[] a1, int[] a2) throws NullPointerException {
		if(a1 == null || a2 == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
		
		int[] a = new int[a1.length +a2.length];
		for (int i = 0; i < a1.length; i++) {
			a[i] = a1[i];	
		}
		for (int j = 0; j < a2.length; j++) {
			a[j+a1.length] = a2[j];
		}
		return a;
	}
	
	public static int search(int[] a, int v) throws NullPointerException{
		if(a == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == v){
				return i;
			}	
		}
		System.out.println("Element nicht gefunden!");
		return -1;	
	}
	
	public static int searchSort(int[] a, int v) throws NullPointerException{
		if(a == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == v){
				return i;
			}
			else if (a[i] > v) {
				System.out.println("Element nicht gefunden!");
				return -2; //"Element nicht innerhalb Wertebereich gefunden!"
			}
		}
		System.out.println("Element nicht gefunden!");
		return -1; //"Element nicht gefunden, da größer als letztes Element im Array!"
	}
	
	public static int[] insert (int[] a, int e, int i) 
		throws NullPointerException, IllegalArgumentException, ArrayIndexOutOfBoundsException {
		if(a == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
		if(i > a.length) throw new
			IllegalArgumentException("Index ungültig!");
		if(i > a.length) throw new
			ArrayIndexOutOfBoundsException("Index liegt außerhalb des Arrays!");
		
		int[] b = new int [a.length + 1];
		for (int j = 0; j < i; j++) {
			b[j] = a [j];	 
		}
		b[i] = e;
		if(i < a.length) {
			for (int k = 0; k < (b.length-i-1); k++) {
				b[k+i+1]= a[k+i];	
			}
		}
		return b;
		
	}

	public static void print2D(int[][] a) throws NullPointerException {
		if(a == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
			
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) throw new
				NullPointerException("Array darf nicht \"null\" sein!");
			
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");		
			}
			System.out.println("");	
		}
	}
		
}
