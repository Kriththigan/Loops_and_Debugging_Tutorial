import java.util.Scanner;
import java.util.InputMismatchException;
public class ValAge {
    public static void main(String[] args){
        boolean correct = false;
        while(!correct){
            try{
                Scanner getInput = new Scanner(System.in);
                System.out.println("Enter your age:");
                int age = getInput.nextInt();
                correct = true;
            } catch (InputMismatchException e){
                System.out.println("Age must be a number.");
            }
        }
    }
}
