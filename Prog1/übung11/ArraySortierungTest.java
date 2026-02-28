package übung11;

public class ArraySortierungTest {
	public static void main(String[] args) {
		
	//Bubblesort Iterativ absteigend
		int[] a1 = {1,2,3,4};
		int[] a2 = {3,5,2,4,1};
		int[] a3 = null;
		
		try {
			ArraySortierung.print(ArraySortierung.bubblesortIter(a1));
		}
		catch(NullPointerException e) { 
			System.out.println(e.getMessage());
		}	
		try {
			ArraySortierung.print(ArraySortierung.bubblesortIter(a2));
		}
		catch(NullPointerException e) { 
			System.out.println(e.getMessage());
		}
		try {
			ArraySortierung.print(ArraySortierung.bubblesortIter(a3));
		}
		catch(NullPointerException e) { 
			System.out.println(e.getMessage());
		}
		System.out.println("---");
		
	//Bubblesort Rekursiv absteigend
		int[] b1 = {1,2,3,4};
		int[] b2 = {3,5,2,4,1};
		int[] b3 = {};
		int[] b4 = null;
		
		try {
			ArraySortierung.print(ArraySortierung.bubblesortRek(b1, b1.length));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			ArraySortierung.print(ArraySortierung.bubblesortRek(b2, b2.length));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			ArraySortierung.print(ArraySortierung.bubblesortRek(b3, b3.length));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			ArraySortierung.print(ArraySortierung.bubblesortRek(b4, b4.length));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---");
		
	//Bubblesort Iterativ Optimiert absteigend
		int[] c1 = {1,2,3,4};
		int[] c2 = {3,5,2,4,1};
		int[] c3 = {3,2,1};
		int[] c4 = null;
				
		try {
			ArraySortierung.print(ArraySortierung.bubblesortIter(c1));
		}
		catch(NullPointerException e) { 
			System.out.println(e.getMessage());
		}	
		try {
			ArraySortierung.print(ArraySortierung.bubblesortIter(c2));
		}
		catch(NullPointerException e) { 
			System.out.println(e.getMessage());
		}
		try {
			ArraySortierung.print(ArraySortierung.bubblesortIter(c3));
		}
		catch(NullPointerException e) { 
			System.out.println(e.getMessage());
		}
		try {
			ArraySortierung.print(ArraySortierung.bubblesortIter(c4));
		}
		catch(NullPointerException e) { 
			System.out.println(e.getMessage());
		}
		System.out.println("---");
		
	//Selectionsort Iterativ aufsteigend
		int[] d1 = {1,2,3,4};
		int[] d2 = {3,5,2,4,1};
		int[] d3 = null;
		try {
			ArraySortierung.print(ArraySortierung.selectionsort(d1));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		try {
			ArraySortierung.print(ArraySortierung.selectionsort(d2));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		try {
			ArraySortierung.print(ArraySortierung.selectionsort(d3));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}	
}

