package functions.Assignment;
import java.util.*;
public class avgNumber {
    public static void avg(int a,int b,int c) {
        int res = (a+b+c)/3;
        System.out.println("Avaerage of "+a+" "+b+" "+c+" is "+res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number to calculate their average :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        avg(num1,num2,num3);
        sc.close();
    }
}
