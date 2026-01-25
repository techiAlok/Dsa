package functions.Assignment;
import java.util.*;
public class testEven {
    public static boolean avg(int a) {
        if(a%2==0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check :");
        int num1 = sc.nextInt();
        boolean ans = avg(num1);
        System.out.println(ans);
        sc.close();
    }
}
