import java.util.Scanner;
public class Reversefor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String input = sc.next();
        int len = input.length();
        String reverse="";
        for (int i = len-1; i >= 0; i--) {
            char element = input.charAt(i);
            reverse=reverse.concat(String.valueOf(element));
        }
        System.out.println(reverse);
    }
}

