package functions.Assignment;
import java.util.*;
public class checkPalindrome {
    public static int reverse(int num) {
        int rev = 0;
        while(num > 0){
            int dig = num%10;
            rev = rev*10+dig;
            num /= 10;
        }
        return rev;
    }

    public static boolean palindromCheck(int num) {
        if(reverse(num) == num){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ans = palindromCheck(321);
        System.out.println(ans);
    }
}
