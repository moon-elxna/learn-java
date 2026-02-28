import java.util.Scanner;

public class guessRandomNumber {

    public static int userInput() {
        // Create a Scanner object for the user input
        Scanner scanner = new Scanner(System.in);
        String userinput = scanner.nextLine();
        int number = Integer.parseInt(userinput);
        return number;
    }

    public static void check() {
        System.out.println("Do you want to play another round (y/n) ?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.equals("y")) {
            game();
        }
    }

    public static void game() {
        // genarating a random number between 0 and 100
        // syntax for a range: Math.random() * (max - min) + min
        final int randomNumber = (int) (Math.random() * 10 + 1);
        System.out.println("Guess the random number between 1 and 10!");

        // check numbers
        int guessedNumber = userInput();
        int tryCount = 0;

        while (randomNumber != guessedNumber) {

            if (guessedNumber > 10) {
                System.out.println("Number out of range");
                guessedNumber = userInput();
                tryCount++;

            } else if (guessedNumber < 1) {
                System.out.println("Number out of range");
                guessedNumber = userInput();
                tryCount++;

            } else if (randomNumber < guessedNumber) {
                System.out.println("False number! You guessed too high.");
                guessedNumber = userInput();
                tryCount++;

            } else if (randomNumber > guessedNumber) {
                System.out.println("False number! You guessed too low.");
                guessedNumber = userInput();
                tryCount++;

            }
        }

        System.out.println("You guessed the random number! You took " + tryCount + " tries");
        check();
    }

    public static void main(String[] args) {
        game();
    }

}