import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args){
        System.out.println("Enter how many numbers to print:");
        Scanner getInput = new Scanner(System.in);
        int n = getInput.nextInt();

        int a = 0;
        int b = 1;
        for(int i=1; i<=n; i++){
            System.out.println(a + "");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
