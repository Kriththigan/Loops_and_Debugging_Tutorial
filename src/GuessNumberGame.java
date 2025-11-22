import java.util.Random;
import java.util.Scanner;
public class GuessNumberGame {
    public static void main(String[] args){
        Random random = new Random();
        int numberToGuess = random.nextInt(20) + 1;
        int userGuess = 1;
        while(userGuess != numberToGuess){
            System.out.println("Enter your guess:");
            Scanner getInput = new Scanner(System.in);
            userGuess = getInput.nextInt();

            if(userGuess < numberToGuess){
                System.out.println("Too Low. Try again!");
            }else if (userGuess > numberToGuess) {
                System.out.println("Too High!. Try again.");
            } else {
                System.out.println("You guessed the correct number.");
            }
        }
    }
}
