import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String user_name = "Subir_fr";
        String user_password = "padhna_ja";

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Welcome to the Login System =====");
        System.out.print("Username: ");
        String req_name = scanner.nextLine();

        System.out.print("Password: ");
        String req_password = scanner.nextLine();

        System.out.println("=============================");

        if (req_name.equals(user_name) && req_password.equals(user_password)) {
            System.out.println("Welcome, " + user_name + "!");
        } else {
            System.out.println("Username or password invalid.");
        }

        System.out.println("=============================");

        scanner.close();
    }
}
