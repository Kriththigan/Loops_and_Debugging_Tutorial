import java.util.Scanner;
import java.util.InputMismatchException;
public class ValDiv {
    public static void main(String[] args){
        boolean valid = false;
        while(!valid){
            try{
                Scanner getInput = new Scanner (System.in);
                System.out.println("Enter dividend:");
                int dividend = getInput.nextInt();
                System.out.println("Enter divisor:");
                int divisor = getInput.nextInt();
                double result = dividend/divisor;
                valid = true;
            } catch (ArithmeticException e){
                System.out.println("Input not valid.");
            }
        }
    }
}
