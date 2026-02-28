package probeklausur;

public class GgT {
	
	public static int berechneGgT(int x, int y) throws IllegalArgumentException
	//Methode berechnet größten gemiensamen Teiler mithilfe euk. Algorithmus und gibt Ergebnis zurück
	{
		//IllegalArgumentException 
		if(x < 0 || y < 0) throw new
			IllegalArgumentException("Parameter kleiner als 0 sind unzulässig");
		//euklidische Algortihmus
		while (y != 0) {
	        int temp = x % y;
	        x = y;
	        y = temp;
	    }
	    return x;
	}
	
		
	
	public static int[] gibGgTAus(int[][] array) throws NullPointerException
	//Methode berechnet ggt von Zahlenpaar aus und gibt array zurück
	{
		if(array == null) throw new
			NullPointerException("Array kann nicht null sein!");
		//Ergebnis Array
		int[] erg = new int[array.length];
		//Schleife für jeweils jedes Paar
		for (int i = 0; i < array.length; i++) {
			int x = array[i][0];
			int y = array[i][1];
			//Ausgabe Input
			System.out.print("ggT(" + x + ", " + y +") = ");
			try {
			//Berechnung
			erg[i] = berechneGgT(x, y);
			//Ausgabe Output
			System.out.println(erg[i]);
			}
			//fängt Exceptions
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}   
		return erg;
	}

}
