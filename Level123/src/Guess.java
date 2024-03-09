import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        Random random = new Random();
        int random_number = random.nextInt(max - min + 1) + min;

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess_num;

        System.out.println("Guess a number between " + min + " and " + max + ": ");
        guess_num = scanner.nextInt();
        attempts++;

        if (guess_num == random_number) {
            System.out.println("Congratulations! You've guessed the number on your first attempt.");
        } else if (guess_num < random_number) {
            System.out.println("The number is too low. Guess again: ");
            guess_num = scanner.nextInt();
            attempts++;

            if (guess_num == random_number) {
                System.out.println("Congratulations! You've guessed the number on attempt " + attempts);
            } else if (guess_num > random_number) {
                System.out.println("The number is too high. Guess again: ");
                guess_num = scanner.nextInt();
                attempts++;

                if (guess_num == random_number) {
                    System.out.println("Congratulations! You've guessed the number on attempt " + attempts);
                } else {
                    System.out.println("Sorry, you didn't guess the number. It was " + random_number);
                }
            } else {
                System.out.println("Sorry, you didn't guess the number. It was " + random_number);
            }
        } else if (guess_num > random_number) {
            System.out.println("The number is too high. Guess again: ");
            guess_num = scanner.nextInt();
            attempts++;

            if (guess_num == random_number) {
                System.out.println("Congratulations! You've guessed the number on attempt " + attempts);
            } else {
                System.out.println("Sorry, you didn't guess the number. It was " + random_number);
            }
        } else {
            System.out.println("Sorry, you didn't guess the number. It was " + random_number);
        }

        scanner.close();
    }
}
