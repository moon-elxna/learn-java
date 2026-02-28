import java.util.Scanner;

public class multiplicationQuizV2 {

    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        String userinput = scanner.nextLine();
        int number = Integer.parseInt(userinput);
        return number;
    }

    public static int questions(final int x, final int y, int tryCount) {
        System.out.println(x + " * " + y + " = ?");
        final int control = x * y;
        final int userInput = userInput();

        if (userInput == control) {
            System.out.println("Your answer was right!");
            tryCount++;

        } else if (userInput != control) {
            System.out.println("Your answer was is false! The right answer is " + control + ".");

        }

        return tryCount;
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
        System.out.println("Multiplication Quiz - Try to get as many questions multiplication questions right!");

        int rightCount = 0;
        rightCount = questions(((int) (Math.random() * 10 + 1)), ((int) (Math.random() * 10 + 1)), rightCount);
        rightCount = questions(((int) (Math.random() * 10 + 1)), ((int) (Math.random() * 20 + 1)), rightCount);
        rightCount = questions(((int) (Math.random() * 20 + 1)), ((int) (Math.random() * 20 + 1)), rightCount);
        rightCount = questions(((int) (Math.random() * 20 + 1)), ((int) (Math.random() * 100 + 1)), rightCount);
        rightCount = questions(((int) (Math.random() * 100 + 1)), ((int) (Math.random() * 100 + 1)), rightCount);

        System.out.println("You have finished the Quiz. You have gotten " + rightCount + " out of 5 questions right.");
        check();

    }

    public static void main(String[] args) {
        game();
    }

}
