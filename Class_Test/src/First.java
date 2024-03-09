import java.util.Random;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String username = "subbu" ;
            String password = "padhdina";

            System.out.print("Username: ");
            String inUsername = scanner.next();
            System.out.print("Password: ");
            String inPassword = scanner.next();

            if (username.equals(inUsername) && password.equals(inPassword)) {
                System.out.println("Welcome to my Application");
                System.out.println("1 Calculator");
                System.out.println("2 Guessing game");
                System.out.println("3 SI Calculator");
                System.out.println("4 Vowel");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter 1st number: ");
                        int num1 = scanner.nextInt();
                        System.out.print("Enter 2nd number: ");
                        int num2 = scanner.nextInt();
                        System.out.print("Enter operator (+, -, *, /): ");
                        String opt = scanner.next();

                        switch (opt) {
                            case "+":
                                System.out.println(num1 + num2);
                                break;
                            case "-":
                                System.out.println(num1 - num2);
                                break;
                            case "*":
                                System.out.println(num1 * num2);
                                break;
                            case "/":
                                System.out.println(num1 / num2);
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        break;

                    case 2:
                        int max = 1000;
                        int min = 100;
                        Random random = new Random();
                        int guessingGame = random.nextInt(max - min + 1) + min;

                        System.out.print("Enter your guess: ");
                        int userNumber = scanner.nextInt();
                        System.out.println("The number was " + guessingGame);

                        if (userNumber == guessingGame) {
                            System.out.println("Congratulations!");
                        } else {
                            System.out.println("Your guess is incorrect. Try again.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter principal: ");
                        double principal = scanner.nextDouble();
                        System.out.print("Enter rate: ");
                        double rate = scanner.nextDouble();
                        System.out.print("Enter time (in years): ");
                        double time = scanner.nextDouble();

                        double interest = (principal * time * rate) / 100;
                        System.out.println("The simple interest is " + interest);
                        break;

                    case 4:
                        System.out.print("Enter a character: ");
                        String letter = scanner.next();

                        if (letter.length() == 1) {
                            char character = letter.charAt(0);

                            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                                System.out.println("The entered character is a vowel letter.");
                            } else {
                                System.out.println("The entered character is a consonant.");
                            }
                        } else {
                            System.out.println("Invalid input.");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        }
    }

