package Recursion;

public class nThFibonacci {
    public static int NthFibo(int num) {
        if(num == 1) return 0;
        if(num == 2) return 1;
        int ans = NthFibo(num-1) + NthFibo(num-2);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(NthFibo(4));
    }
}
