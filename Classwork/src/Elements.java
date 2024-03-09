//wap to list all elements of string
import java.sql.SQLOutput;
public class Elements {
    public static void main(String[] args) {
        String name= "Subir";
        int str_length = name.length();
        for(int i=0;i<str_length;i++){
            System.out.println(name.charAt(i));
        }

    }
}
