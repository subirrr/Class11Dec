import java.util.Random;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String username = "subir30" ;
            String password = "subir40@@" ;

            System.out.print("Enter Username: ");
            String inUsername = scanner.next();
            System.out.print("Enter Password: ");
            String inPassword = scanner.next();

            if (username.equals(inUsername) && password.equals(inPassword)) {
                System.out.println("Welcome to my Application");
                System.out.println("1. Simple Calculator");
                System.out.println("2. Number Guesser Game");
                System.out.println("3. Compound Interest Calculator");
                System.out.println("4. Vowel or Consonant Checker");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the first number: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Enter the second number: ");
                        double num2 = scanner.nextDouble();
                        System.out.print("Enter the operator (+, -, *, /): ");
                        char operator = scanner.next().charAt(0);

                        double result = 0.0;

                        switch (operator) {
                            case '+':
                                result = num1 + num2;
                                break;
                            case '-':
                                result = num1 - num2;
                                break;
                            case '*':
                                result = num1 * num2;
                                break;
                            case '/':
                                if (num2 != 0) {
                                    result = num1 / num2;
                                } else {
                                    System.out.println("Division by zero is not allowed.");
                                    break;
                                }
                                break;
                            default:
                                System.out.println("Invalid Operator");
                        }

                        System.out.println("Result: " + result);
                        break;

                    case 2:
                        int max = 100;
                        int min = 1;
                        Random random = new Random();
                        int targetNumber = random.nextInt(max - min + 1) + min;

                        int attempts = 0;
                        boolean guessedCorrectly = false;

                        while (!guessedCorrectly) {
                            System.out.print("Guess the number (between 1 and 100): ");
                            int guess = scanner.nextInt();
                            attempts++;

                            if (guess == targetNumber) {
                                System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
                                guessedCorrectly = true;
                            } else if (guess < targetNumber) {
                                System.out.println("Try a higher number.");
                            } else {
                                System.out.println("Try a lower number.");
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter principal amount: ");
                        double principalAmount = scanner.nextDouble();
                        System.out.print("Enter annual interest rate (%): ");
                        double annualInterestRate = scanner.nextDouble();
                        System.out.print("Enter time period (in years): ");
                        double timePeriod = scanner.nextDouble();

                        double compoundInterest = principalAmount * Math.pow((1 + (annualInterestRate / 100)), timePeriod) - principalAmount;
                        System.out.println("Compound Interest: " + compoundInterest);
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
            }
            else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        }
    }

