package basics;
import java.util.*;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check :");
        int num = sc.nextInt();
        boolean flag = true;
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime!");
        }
        sc.close();
    }
}
