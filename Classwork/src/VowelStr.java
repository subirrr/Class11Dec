//wap to list only vowel of a string
public class VowelStr {
    public static void main(String[] args) {
        String name= "Subir";
        char v_char;
        int v_length = name.length();
        for(int i= 0; i<v_length; i++){
            v_char= name.charAt(i);
            if(v_char=='a' || v_char=='e' || v_char=='i'|| v_char== 'o' ||  v_char=='u'){
                System.out.println(v_char);
            }

        }


    }
}
