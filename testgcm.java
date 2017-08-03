/**
 * Created by Calvin on 9/21/2016.
 */
import java.util.*;
public class testgcm {
    public static void main(String[] args){
        int a=1, b=3, c=7, d=8;
        long gcd;
        System.out.println(gcd=gcm(b,d));
        System.out.println(asFraction(500, 1000)); //  "1/2"
        System.out.println(asFraction(17, 3));     //  "17/3"
        System.out.println(asFraction(462, 1071));
    }
    public static long gcm(int a, int b) {
        return b == 0 ? a : gcm(b, a % b); // Not bad for one line of code :)
    }
    public static String asFraction(int a, int b) {
        long gcm = gcm(a, b);
        return (a / gcm) + "/" + (b / gcm);
    }
}
