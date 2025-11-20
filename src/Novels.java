import java.util.Scanner;
public class Novels {
    public static void main(String[] args){
        System.out.println("Enter the number of novels you have:");
        Scanner getInput = new Scanner(System.in);
        int novel = getInput.nextInt();
        if (novel > 20){
            System.out.println("Wow!");
        } else if (novel <= 20) {
            System.out.println("Not Bad");
        } else {
            System.out.println("Buy Now");
        }
    }
}
