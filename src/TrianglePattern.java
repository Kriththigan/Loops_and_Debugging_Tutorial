import java.util.Scanner;
public class TrianglePattern {
    public static void main(String[] args){
        System.out.println("Enter the size of the triangle (n):");
        Scanner getInput = new Scanner(System.in);
        int n = getInput.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
