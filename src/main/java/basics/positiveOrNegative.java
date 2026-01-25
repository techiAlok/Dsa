package basics;
import java.util.*;
public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you wanna check: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println(num+" is negative number!");
        } else {
            System.out.println(num+" is positive number!");
        }
        sc.close();
    }
}
