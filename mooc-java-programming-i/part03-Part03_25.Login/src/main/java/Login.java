
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        boolean isMatch;
        if (username.equals("alex") && password.equals("sunshine")) {
            isMatch = true;
        } else if (username.equals("emma") && password.equals("haskell")) {
            isMatch = true;
        } else {
            isMatch = false;
        }

        if (isMatch) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        scanner.close();
    }
}
