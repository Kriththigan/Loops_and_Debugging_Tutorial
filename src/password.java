import java.util.Scanner;
public class password {
    public static void main (String[] args){
        String password = "JKLSxd$";
        System.out.println("Enter a Password:");
        Scanner getInput = new Scanner(System.in);
        String user_password = getInput.next();

        while (!password.equals(user_password)){
            System.out.println("Password is incorrect. Please enter a password:");
            user_password = getInput.next();
        }
    }
}
