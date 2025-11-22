import java.util.Scanner;

public class Passcode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passcode = 486251;
        boolean correct = false;

        for (int attempt = 1; attempt <= 4; attempt++) {
            System.out.print("Enter passcode: ");
            int entered = input.nextInt();

            if (entered == passcode) {
                System.out.println("Correct passcode");
                correct = true;
                break;
            } else {
                System.out.println("Wrong passcode. Attempts left: " + (4 - attempt));
            }
        }

        if (!correct) {
            System.out.println("Access denied");
        }

        input.close();
    }
}
