package functions;
import java.util.*;
public class factorianOfN {
    public static int fact(int num) {
        if(num<=1){
            return 1;
        } else{
            int res = 1;
            while(num!=1){
                res = res*num;
                num--;
            }
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter of which you want Factorial : ");
        int num = sc.nextInt();
        int res = fact(num);
        System.out.println("Factorial of "+num+" is "+res);
        sc.close();
    }
}
