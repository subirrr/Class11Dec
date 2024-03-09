public class Fizzbuzz {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        fizzBuzz(start, end);
    }

    public static void fizzBuzz(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + " FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println(num + " Fizz");
            } else if (num % 5 == 0) {
                System.out.println(num + " Buzz");
            } else {
                System.out.println(num);
            }
        }
    }
}