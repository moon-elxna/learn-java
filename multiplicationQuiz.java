import java.util.Scanner;

public class multiplicationQuiz {

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

    public static void game() {
        System.out.println("Multiplication Quiz - Try to get as many questions multiplication questions right!");

        int rightCount = 0;
        rightCount = questions(3, 4, rightCount);
        rightCount = questions(12, 8, rightCount);
        rightCount = questions(17, 13, rightCount);
        rightCount = questions(24, 19, rightCount);
        rightCount = questions(37, 46, rightCount);

        System.out.println("You have finished the Quiz. You have gotten " + rightCount + " out of 5 questions right.");

    }

    public static void main(String[] args) {
        game();
    }
}