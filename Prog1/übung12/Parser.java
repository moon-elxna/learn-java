package übung12;

import java.util.Scanner;

public class Parser {
	public static void main(String[] args) {
		ParserPath("C:Eigene Dateien/Javatest/Beispiel.java", "/"); //Linux
		ParserPath("C:Eigene Dateien\\Javatest\\Beispiel.java", "\\"); //Windows
		ParserScanner();
	}
	public static void ParserScanner() {
		System.out.print("parser for file paths\n"
						+"=====================\n");
		
		String loop = "y";
		while (loop.equals("y") || loop.equals("Y")) {
			//path
			System.out.print("path: ");
			Scanner sc1 = new Scanner(System.in);
			String path = sc1.nextLine();
			//path separtor
			System.out.print("path separator: ");
			Scanner sc2 = new Scanner(System.in);
			String pathSeparator = sc2.nextLine();
			//input as parameters in method
			System.out.print("\n");
			ParserPath(path, pathSeparator);
			//loop
			System.out.print("Another input?(y/n) ");
			Scanner sc3 = new Scanner(System.in);
			loop = sc3.nextLine();
			
		}
	}
	
	public static void ParserPath(String path, String pathSeparator ) {
		String fileExtension = path.substring((path.indexOf('.') + 1));
		String fileName = path.substring((path.lastIndexOf(pathSeparator)+1),path.indexOf('.'));
		String filePath = path.substring(0,path.lastIndexOf(pathSeparator));
		System.out.printf("file extension: %s\nfile name: %s\nfile path: %s\n\n", fileExtension, fileName, filePath);
	}

}
