import java.util.Scanner;
public class num {
    public static void main (String[] args){
        System.out.println("Enter a number smaller than 10:");
        Scanner getInput = new Scanner(System.in);
        int number = getInput.nextInt();

        while (number < 10){
            System.out.println(number);
            number++;
        }
    }
}