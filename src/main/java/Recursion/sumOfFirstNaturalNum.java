package Recursion;

public class sumOfFirstNaturalNum {
    public static int sumOfFirstN(int num) {
        if(num<1) return 0;
        int sum = num + sumOfFirstN(num-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfFirstN(4));
    }
}
