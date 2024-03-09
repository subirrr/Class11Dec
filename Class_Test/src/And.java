import java.util.Random;
import java.util.Scanner;

public class And {
    public static void main(String[] args) {
        String username= "Subir";
        String password = "padhna_ja";
        Scanner obj = new Scanner(System.in);

        System.out.println("username");
        String in_username= obj.next();
        System.out.println("Password");
        String in_password = obj.next();

        if (username.equals(in_username)) {
            if (password.equals(in_password)) {

                System.out.println("Welcome to my Application");
                System.out.println("1 Calculator");
                System.out.println("2 Guessing game");
                System.out.println("3 SI Calculator");
                System.out.println("4 Vowel");

            }
            else{
                System.out.println("Incorrect password");


            }
            int number= obj.nextInt();
            switch(number){
                case 1:
                    System.out.println("Enter 1st number");
                    int num1= obj.nextInt();
                    System.out.println("Enter 2nd number");
                    int num2= obj.nextInt();
                    System.out.println("string to operate+: +, -, *, /");
                    String opt= obj.next();
                    switch(opt){
                        case "+":
                            System.out.println((num1 + num2));
                            break;

                        case "-":
                            System.out.println(num1 - num2);
                        case "*":
                            System.out.println(num1 * num2);

                        case "/":
                            System.out.println(num1/num2);
                            break;
                        default:
                            System.out.println("Invalid Input");

                    }

                    break;

                case 2:
                    System.out.println("Enter number");
                    int max= 1000;
                    int min= 100;
                    Random random= new Random();
                    int guessing_game= random.nextInt(max - min+ 1)+ min;
                    int user_number= obj.nextInt();
                    System.out.println("The number was " + guessing_game);
                    if(user_number==guessing_game){
                        System.out.println("la badhai cha");


                    }
                    else {
                        System.out.println("your guess is incorrect. Try again");
                    }
                    break;

                case 3:
                    System.out.println("Enter principal:");
                    double principal= obj.nextFloat();
                    System.out.println("Enter rate:");
                    double rate= obj.nextFloat();
                    System.out.println("Enter time (in year):" );
                    double time= obj.nextFloat();
                    double interest= (principal*time*rate)/100;
                    System.out.println("The simple interest is " + interest);
                    break;

                case 4:
                    System.out.println("Enter a character");
                    String letter = obj.next();
                    if (letter.length() == 1) {
                        if (letter.equals("a") && letter.equals("e") && letter.equals("i") && letter.equals("o") && letter.equals("u")) {
                            System.out.println("The entered character is a vowel letter");
                        } else {
                            System.out.println("The given character is consonant.");
                        }
                    } else {
                        System.out.println("Invalid input.");
                    }

                    break;

            }
        }
        else{
            System.out.println("the username is incorrect");
        }

    }
}

