package functions;
import java.util.*;
//nCr = n!/r!x(n-r)!
public class binomialCoefficient {
    public static int fact(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter toCalculate Binomial :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = fact(num1)/(fact(num2)*fact(num1-num2));
        System.out.println(res);
        sc.close();
    }
}
