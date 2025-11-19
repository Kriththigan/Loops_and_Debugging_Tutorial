import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        System.out.println("Enter a positive integer:");
        Scanner getInput = new Scanner(System.in);
        int number = getInput.nextInt();
        int i = 1;
        long factorial = 1;
        while(i <= number){
            factorial =  factorial * i;
            i++;
        }
        System.out.println("Factorial of" + number + "is:" + factorial);
    }
}
