public class Sumidev {
    public static void main(String[] args) {
        int even = 0, odd= 0;
        for (int i= 0; i<=10; i++){
            if (i% 2 == 0){
                System.out.println(i+ " even");
                 even= even + i;

            }
            else {
                System.out.println(i+ " odd");
                 odd= odd + i;
            }



        }
        if (even > odd){
            System.out.println(even + " is the greatest sum of even number");
        }
        else if (even == odd){
            System.out.println("both some are equal ");
        }
        else{
            System.out.println(odd+ " sum is greater");
        }
    }
}
