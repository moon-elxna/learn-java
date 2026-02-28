package übung11;

public class ArraySortierung {
	
	public static void print(int[] a) throws NullPointerException{
		if (a == null) throw new
			NullPointerException("Array kann nicht \"null\" sein!");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		} 
		System.out.println("");
	}
	
	public static int[] bubblesortIter(int[] a) throws NullPointerException 
	/*	
	Sortiert ein Array iterativ(also mit Schleifen) absteigenden basierende auf BubbleSort Algorithmus: 
	die gr. Elemente sind zuerst auf ihrer endgültigen Position.
	*/ {
		if(a == null) throw new
			NullPointerException("Array kann nicht null sein!");
		
		//Schleife für die Durchläufe
		for (int i = 0; i < (a.length-1); i++) {
			//Schleife für die Vergleiche
			for (int j = 0; j < (a.length-1-i); j++) {
				//Wechsel der Elemente
				if (a[j] < a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		//Rückagbe des sortierten Arrays
		return a;
	}
	
	public static int[] bubblesortRek(int[] a, int i) throws NullPointerException, IllegalArgumentException
	/*	
	Sortiert ein Array rekursiv(also mit wiederaufrufen der Mehtode) absteigenden basierende auf BubbleSort Algorithmus: 
	die gr. Elemente sind zuerst auf ihrer endgültigen Position.
	*/ {
		
		if(a == null) throw new
			NullPointerException("Array kann nicht null sein!");

		if(i<1) throw new
			IllegalArgumentException("Index ungültig!");
		
		//Abbruchbedienung
		if(i<2) {
			//Rückagbe des sortierten Arrays
			return a;
		}
		//Scheleife für die Vergleiche
		for (int j = 0; j < (i-1); j++) {
			//Wechsel der Elemente
			if(a[j] < a[j+1]) {
				int temp = a[j+1];
				a[j+1] = a[j];
				a[j] = temp;
			}
		}
		//Rekursion für die Durchläufe
		return bubblesortRek(a, i-1);
	}
	
	public static int[] bubblesortIterOpti(int[] a) throws NullPointerException 
	/*	
	Sortiert ein Array iterativ(also mit Schleifen) absteigenden basierende auf BubbleSort Algorithmus: 
	die gr. Elemente sind zuerst auf ihrer endgültigen Position. 
	Sobald in einem Durchlauf kein Wechsel stattfindet, wird die Methode beendet.
	*/ {
		
		if(a == null) throw new
			NullPointerException("Array kann nicht null sein!");
		//Test Boolean
		boolean test = false;
		//Schleife für die Durchläufe
		for (int i = 0; i < (a.length-1); i++) {
			//Schleife für die Vergleiche
			for (int j = 0; j < (a.length-1-i); j++) {
				//Wechsel der Elemente
				if (a[j] < a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					//Bei Wechsel der Elemente wird Boolean true
					test = true;	
				}
			}
			//Abbruchbedienung 
			if(test == false ) {
				//Rückagbe des sortierten Arrays
				return a;
			}
		}
		//Rückagbe des sortierten Arrays
		return a;
	}
	
	public static int[] selectionsort(int[] a) throws NullPointerException 
	/*
	Sortiert ein Array iterativ(also mit Schleifen) aufsteigend basierende auf dem Selectionsort(Minsort) Algorithmus: 
	alle Elemente werden mit einem Element verglichen bis das kleinste gefunden wurde und dann wird das kleinste Element 
	an den Anfang gewechselt. Das wird wiederholt bis alle Elemente sortiert sind. 
	*/{
		if(a == null) throw new
			NullPointerException("Array kann nicht null sein!");
		
		//Schleife für die Durchläufe
		for (int i = 0; i < (a.length-1); i++) {
			int m = a[i];
			int n = i;
			//Schleife für die Vergleiche
			for (int j = i+1; j < a.length; j++) {
				if (m > a[j]) {
					m = a[j];
					n = j;
				}	
			}
			//Wechsel der Elemente
			int temp = a[i];
			a[i] = m;
			a[n] = temp;
		}
		return a;
	}
	
	public static int[] insertionsort(int[] a ) {
		//Schleife für die Durchgänge
		for (int i = 0; i < (a.length-1); i++) {
			//Schleife für die Vergleiche
			for (int j = i; j >= 0; j--) {
				if (a[i+1] > a[j]) {
					int temp = a[j];
					a[j]= a[i+1];
					a[i+1] = temp;
				}		
			}
		}
		return a;
	}
}
