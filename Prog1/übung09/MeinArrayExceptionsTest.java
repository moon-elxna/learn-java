package übung09;

public class MeinArrayExceptionsTest {
	public static void main(String[] args) {
		//arrays
		int[] nullInt = null;
		char[] nullChar = null;
		int[] a1 = {1,2,3};
		char[] b1 = {'a', 'b', 'c'};
		char[] b2 = {'e', 'f'};
		
		//gibElement
		try {
			System.out.println(MeinArrayExceptions.gibElement(a1, 1));
			System.out.println(MeinArrayExceptions.gibElement(a1, -1));
			System.out.println(MeinArrayExceptions.gibElement(null, 1));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		//max
		try {
			System.out.println(MeinArrayExceptions.max(a1));
			System.out.println(MeinArrayExceptions.max(nullInt));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());

		}
		
		//UngleicherIndex
		try {
			System.out.println(MeinArrayExceptions.gibErstenIndexUngleicherElemente(b1, b2));
			System.out.println(MeinArrayExceptions.gibErstenIndexUngleicherElemente(b1, nullChar));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		//UngleichesElement
		try {
			System.out.println(MeinArrayExceptions.gibErstesUngleichesElement(b1, b2));
			System.out.println(MeinArrayExceptions.gibErstesUngleichesElement(nullChar, b2));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
