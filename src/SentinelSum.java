import java.util.Scanner;
public class SentinelSum {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.println("Enter a number (0 to stop):");
            num = getInput.nextInt();
            sum += num;
        } while (num != 0);
            System.out.println("The Sum of entered number: " + sum);
        }
    }

