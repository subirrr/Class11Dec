import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        int loginAttempts = 3;
        String correctUsername = "padhle";
        String correctPassword = "damna";
        Scanner inputScanner = new Scanner(System.in);

        while (loginAttempts > 0) {
            System.out.println("Enter username: ");
            String enteredUsername = inputScanner.next();
            System.out.println("Enter password: ");
            String enteredPassword = inputScanner.next();

            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                System.out.println("Logged in successfully as: " + enteredUsername);
                break;
            } else {
                System.out.println("Incorrect credentials. Number of attempts left: " + (--loginAttempts));
            }
        }
    }
}
