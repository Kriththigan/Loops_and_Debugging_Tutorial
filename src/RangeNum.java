import java.util.Scanner;
public class RangeNum {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        boolean correct = false;
        while(!correct){
            System.out.println("Enter your age:");
            int age = getInput.nextInt();
            if (age < 0 || age > 150){
                System.out.println("Age must be between 0 and 150");
            }
            else correct =  true;
        }
    }
}
