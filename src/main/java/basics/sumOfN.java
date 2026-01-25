package basics;
import java.util.*;
public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number upto which you want sum: ");
        int num = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter <= num){
            sum += counter++;
        }
        System.out.println("Sum : "+sum);
        sc.close();
    }
}
