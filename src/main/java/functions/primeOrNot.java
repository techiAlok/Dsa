package functions;
import java.util.*;
public class primeOrNot {
    public static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check :" );
        int num = sc.nextInt();
        boolean check = isPrime(num);
        sc.close();
        if(check){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
