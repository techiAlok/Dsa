package functions;
import java.util.*;
public class binaryToDecimal {
    public static int binToDeci(int num) {
        int result = 0;
        int i = 0;
        while(num > 0){
            int dig = num%10;
            result += (int)(dig * Math.pow(2,i));
            i++;
            num /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number to convert int decimal :");
        int num = sc.nextInt();
        int ans = binToDeci(num);
        System.out.println(ans);
        sc.close();
    }
}
