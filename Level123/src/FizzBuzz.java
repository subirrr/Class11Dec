import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        if (num%3 == 0 && num%5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (num%3==0){
            System.out.println("Fizz");
        }
        else if (num%5==0){
            System.out.println("buzz");
        }
        else{
            System.out.println(num);
        }

    }
}
