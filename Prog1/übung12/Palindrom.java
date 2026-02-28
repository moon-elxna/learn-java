package übung12;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		PalindromeSearch();
	}
	
	public static void PalindromeSearch() {
		System.out.print("reverse input and search for palindromes\n"
						+"========================================\n");
		
		String loop = "y";
		while (loop.equals("y") || loop.equals("Y")) {	
			
			//reverse input
			System.out.print("input: ");
			Scanner sc1 = new Scanner(System.in);
			String input= sc1.nextLine().toLowerCase().replaceAll(" ", "");
			String reverse = "";
			for (int i = input.length()-1; i >= 0 ; i--) {
				reverse = reverse + input.charAt(i);			
			}
			System.out.printf("output: %s\n",reverse);
			
			//checke if palindrome
			if(input.equals(reverse)) {
				System.out.printf("Palindrome found!\n");
			}
			//loop
			System.out.print("Another Input?(y/n) ");
			Scanner sc2 = new Scanner(System.in);
			loop = sc2.next();
		}
	}


}
