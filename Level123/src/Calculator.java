import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any two number");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();

        System.out.println("Enter an operator:  +,-,*,/ ");
        String userInput= obj.next();

        switch (userInput){
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

    }
}
