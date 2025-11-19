import java.util.Scanner;
public class CollatzSequence {
    public static void main(String[] args){
        System.out.println("Enter a starting positive number:");
        Scanner getInput = new Scanner(System.in);
        int n = getInput.nextInt();
        while(n != 1){
            System.out.println(n + "->");
            if (n % 2 == 0){
                n = n/2;
            } else {
                n = (n * 3) + 1;
            }
            System.out.println(n);
        }
    }
}
