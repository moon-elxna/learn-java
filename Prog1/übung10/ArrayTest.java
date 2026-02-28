package übung10;

public class ArrayTest {
	public static void main(String[] args) {
		//arrays
		int[] a1 = {1,2,3};
		int[] a2 = {5,6,7,8};
		int[] a3 = {0,5,1,10};
		int[] a4 = {4,5,6};
		int[] n1 = null;
		
		int[][] a5 = {{4,5},{1,2}};
		int[][] a6 = {{4,5,6},{1,2}};
		int[][] n2 = null;
		
		//concatenate two arrays
		try {
			Array.print(Array.concatenate(a1, a2));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		try {
			Array.print(Array.concatenate(a1, n1));	
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		System.out.println("---");
		
		//search element in unsorted Array
		try {
			System.out.println("Index: " + Array.search(a1, 1));

		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Index: " + Array.search(a2, 1));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Index: " + Array.search(n1, 1));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---");
		
		//search element in sorted Array
		try {
			System.out.println(Array.searchSort(a1, 1));

		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		try {;
			System.out.println(Array.searchSort(a2, 10));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(Array.searchSort(a3, 1));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(Array.searchSort(n1, 1));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		System.out.println("---");
		
		//insert elemnt in Array
		try{
			Array.print(Array.insert(a4, 7, 2));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		try{
			Array.print(Array.insert(a4, 7, 3));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		try{
			Array.print(Array.insert(a4, 7, 4));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println("---");
		
		//print 2d-Arrays
		try {
			System.out.println("2D Array: ");
			Array.print2D(a5);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());			
		}
		try {
			System.out.println("2D Array: ");
			Array.print2D(a6);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());			
		}
		try {
			System.out.println("2D Array: ");
			Array.print2D(n2);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());			
		}
		
		
		
	}

}
