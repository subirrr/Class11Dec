import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        double result = 0;

        System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        System.out.println("Enter operator: ");
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("/ for division");
        System.out.println("* for multiplication");

        Scanner operatorScanner = new Scanner(System.in);
        String operator = operatorScanner.nextLine();

        if (operator.equals("+")) {
            result = number1 + number2 + number3;
        } else if (operator.equals("-")) {
            result = number1 - number2 - number3;
        } else if (operator.equals("*")) {
            result = number1 * number2 * number3;
        } else if (operator.equals("/")) {
            if (number2 != 0 && number3 != 0) {
                result = number1 / number2 / number3;
            } else {
                System.out.println("Cannot divide by zero");
                scanner.close();
                operatorScanner.close();
                return;
            }
        } else {
            System.out.println("Invalid input");
            scanner.close();
            operatorScanner.close();
            return;
        }

        System.out.println("Result of " + number1 + " " + operator + " " + number2 + " " + operator + " " + number3 + " is: " + result);

        scanner.close();
        operatorScanner.close();
    }
}
