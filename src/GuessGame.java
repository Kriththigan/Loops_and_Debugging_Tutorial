import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Try to guess it!");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("CORRECT! You found it.");
            }

        } while (guess != secretNumber);

        System.out.println("It took you " + attempts + " attempts.");

        scanner.close();
    }
}