package üben;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] arr = {3,4,6,10,9,0};
		int[] arrr = {2,7,10,9999};
		Array.printArray(Array.verkette(arr, arrr));
		System.out.println(Array.summiere(arr));
		System.out.println(Array.mittelwert(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
		    int minIdx = i;
		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr[j] < arr[minIdx]) minIdx = j;
		    }
		    // Tauschen
		    int temp = arr[i];
		    arr[i] = arr[minIdx];
		    arr[minIdx] = temp;
		}
		
		Array.printArray(arr);
		int[] ar = {3,4,6,10,9,0};
		for (int i = 1; i < ar.length; i++) {
		    int key = ar[i];
		    int j = i - 1;
		    while (j >= 0 && ar[j] > key) {
		        ar[j + 1] = ar[j]; // nach rechts schieben
		        j--;
		    }
		    ar[j + 1] = key; // einfügen
		}
		Array.printArray(ar);


	}

}
