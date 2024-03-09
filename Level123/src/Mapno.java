import java.util.Scanner;

public class Mapno {
    public static void main(String[] args) {
        System.out.print("Enter day: ");
        Scanner obj = new Scanner(System.in);
        int map_no = obj.nextInt();

        String day = "";
        if (map_no == 1) {
            day = "Sunday";
        }
        else if (map_no == 2) {
            day = "Monday";
        }
        else if (map_no == 3) {
            day = "Tuesday";
        }
        else if (map_no == 4) {
            day = "Wednesday";
        }
        else if (map_no == 5) {
            day = "Thursday";
        }
        else if (map_no == 6) {
            day = "Friday";
        }
        else if (map_no == 7) {
            day = "Saturday";
        }
        else {
            System.out.println("Invalid Input");
            obj.close();
            return;
        }

        System.out.println(day);
        obj.close();
    }
}
