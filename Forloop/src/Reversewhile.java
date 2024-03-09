//WAP in Java to print the reverse of a number using while and for loop.
import java.util.Scanner;

public class Reversewhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String input = sc.next();
        int len = input.length();
        String reverse = "";

        int i = len - 1;
        while (i >= 0) {
            char element = input.charAt(i);
            reverse = reverse.concat(String.valueOf(element));
            i--;
        }

        System.out.println(reverse);
    }
}

