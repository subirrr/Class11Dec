import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {


        Scanner obj= new Scanner(System.in);

        int userInput = obj.nextInt();

        switch(userInput){

            //we can include any number in a single case for switch statement
            case 1,6,7:
                System.out.println("Weekend");
                break;
            case 2,3,4,5:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
