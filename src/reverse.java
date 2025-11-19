import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        System.out.println("Enter a number to reverse:");
        Scanner getInput = new Scanner(System.in);
        int number = getInput.nextInt();
        int reversedNumber = 0;
        while(number != 0){
            int digit = number % 10;
            reversedNumber =  reversedNumber * 10 + digit;
            number = number/10;
        }
        System.out.println("Original Number:" + number);
        System.out.println("Reversed Number:" + reversedNumber);
    }
}
