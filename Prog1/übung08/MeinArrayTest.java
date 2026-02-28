package übung08;

public class MeinArrayTest {

	/*
	Erkenntnis zum Synatax:
	Klasse Mein Array . Klassenmethode istGleichLang
	und nicht Objekt.Klassenmethode!
	*/
	public static void main(String[] args) {
		
		//gleiche Arrays
		float[] a1 = {0,1,2,3};
		float[] a2 = {0,1,2,3};
		System.out.println(MeinArray.istGleichLang(a1,a2));  
		
		//verschiedene Länge der Arrays
		float[] a3 = {0,1,2};
		float[] a4 = {0,1,2,3};
		System.out.println(MeinArray.istGleichLang(a3,a4));
		
		//verschieden Elemente in den Arrays
		float[] a5 = {0,1,2,4};
		float[] a6 = {0,1,2,3};
		System.out.println(MeinArray.istGleichLang(a5,a6));
		
		
		//nicht initialsierte Array
		//float[] a7;
		//float[] a8 = {0,1,2,3};
		//System.out.println(MeinArray.istGleichLang(a7,a8)); //Compilation Error
		
		
		int[] a= {1,2,3,10,5};
		//for-loop
		MeinArray.printArray(a, true);
		
		//foreach-loop
		MeinArray.printArray(a, false);
		
		
		//int [] arrayNull = null;
		int[] array1 = {1,3,5,7,9}; 
		System.out.println(MeinArray.gibElement(array1,2));
		System.out.println(MeinArray.gibElement(array1,0));
		
		int[] array2 = {1,2,3};
		System.out.println(MeinArray.summiere(array2));
		//System.out.println(MeinArray.summiere(arrayNull)); "Cannot read the array length because "a" is null"
		
		int[] array3 = {1,2,3,5};
		System.out.println(MeinArray.mittelwert(array3));
		//System.out.println(MeinArray.mittelwert(arrayNull)); "Cannot read the array length because "a" is null"
		
		int[] array4 = {4,3,2,1};
		System.out.println(MeinArray.max(array4));
		//System.out.println(MeinArray.max(arrayNull)); "Cannot read the array length because "a" is null"
		
		
		char[] d = {'a', 'b'};
		char[] e = {'a', 'b', 'd'};
		char[] f = {'a', 'b', 'c'};
		char[] g = {'a', 'c'};
		char[] h = {'a', 'b'};
		
		System.out.println("Array gleicher Länge");
		System.out.println(MeinArray.gibErstenIndexUngleicherElemente(e, f));
		System.out.println(MeinArray.gibErstenIndexUngleicherElemente(d, g));
		System.out.println("Array ungleicher Länge");
		System.out.println(MeinArray.gibErstenIndexUngleicherElemente(d, f));
		System.out.println(MeinArray.gibErstenIndexUngleicherElemente(e, g));
		System.out.println("Array gleicher Elemente");
		System.out.println(MeinArray.gibErstenIndexUngleicherElemente(d, h));
		
		
		
	}

}
