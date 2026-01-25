package functions;
import java.util.*;
public class decimalToBinary {
    public static int deciToBin(int num) {
        int result = 0;
        int pow = 0;
        while(num > 0){
            int dig = num%2;
            result += (dig*(int)(Math.pow(10,pow)));
            num = num/2;
            pow++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal to convert into binary :");
        int num = sc.nextInt();

        int ans = deciToBin(num);
        System.out.println(ans);
        sc.close();
    }
}
