package functions.Assignment;
import java.util.*;
public class digitsSum {
    public static int digSum(int num) {
        int sum = 0;
        while(num > 0){
            int dig = num%10;
            sum += dig;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int ans = digSum(num);
        System.out.println(ans);
        sc.close();
    }
}
