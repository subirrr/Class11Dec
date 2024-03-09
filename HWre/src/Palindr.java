import java.util.Scanner;

public class Palindr  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int left = 0;
        int right = inputString.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
