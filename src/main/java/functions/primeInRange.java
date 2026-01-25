package functions;
import java.util.*;
public class primeInRange {
    public static boolean primeRange(int num) {
        boolean flag = true;
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                flag = false;
                return flag;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit :");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if(primeRange(i)){
                System.out.print(i+"\t");
            }
        }
        sc.close();
    }
}
