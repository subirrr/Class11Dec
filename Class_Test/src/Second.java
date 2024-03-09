import java.util.Random;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String username = "subir_fr" ;
            String password = "vandina" ;

            System.out.print("Username: ");
            String inUsername = scanner.next();
            System.out.print("Password: ");
            String inPassword = scanner.next();

            if (username.equals(inUsername) && password.equals(inPassword)) {
                System.out.println("Welcome to my Application");
                System.out.println("1. Calculator");
                System.out.println("2. Guessing game");
                System.out.println("3. SI Calculator");
                System.out.println("4. Vowel Checker");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the first number: ");
                        int num1 = scanner.nextInt();
                        System.out.print("Enter the second number: ");
                        int num2 = scanner.nextInt();
                        System.out.print("Enter the operator (+, -, *, /): ");
                        String opt = scanner.next();

                        switch (opt) {
                            case "+":
                                System.out.println("Result: " + (num1 + num2));
                                break;
                            case "-":
                                System.out.println("Result: " + (num1 - num2));
                                break;
                            case "*":
                                System.out.println("Result: " + (num1 * num2));
                                break;
                            case "/":
                                if (num2 != 0) {
                                    System.out.println("Result: " + (num1 / num2));
                                } else {
                                    System.out.println("Division by zero is not allowed.");
                                }
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        break;

                    case 2:
                        int max = 100;
                        int min = 1;
                        Random random = new Random();
                        int guessingGame = random.nextInt(max - min + 1) + min;

                        System.out.print("Guess the number (between 1 and 100): ");
                        int userNumber = scanner.nextInt();

                        if (userNumber == guessingGame) {
                            System.out.println("Congratulations! You guessed it right.");
                        } else {
                            System.out.println("Sorry, the number was " + guessingGame + ". Try again.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter principal amount: ");
                        double principal = scanner.nextDouble();
                        System.out.print("Enter annual interest rate (%): ");
                        double rate = scanner.nextDouble();
                        System.out.print("Enter time period (in years): ");
                        double time = scanner.nextDouble();

                        double interest = (principal * rate * time) / 100;
                        System.out.println("Simple Interest: " + interest);
                        break;

                    case 4:
                        System.out.print("Enter a single character: ");
                        char character = scanner.next().charAt(0);

                        if (Character.isLetter(character)) {
                            character = Character.toLowerCase(character);
                            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                                System.out.println("The entered character is a vowel.");
                            } else {
                                System.out.println("The entered character is a consonant.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a single character.");
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

