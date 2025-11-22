import java.util.Scanner;
public class Positive {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        System.out.println("Enter a letter:");
        String letter = getInput.next();
        int i = 1;
        while (i <= num){
            System.out.print(letter);
            i++;
        }
    }
}
