package Recursion;

public class factorialOfN {
    public static int printFact(int num) {
        int res = 1;
        if(num <= 1) return res;
        res = res * num * (printFact(num-1));
        return res;
    }
    public static void main(String[] args) {
        System.out.println(printFact(4));
    }
}
