package Recursion;

public class powerOfN {
    public static int pow(int base, int power) {
        //O(n)
        // if(power == 0){
        //     return 1;
        // }
        // return base * pow(base,power-1);

        //optimize way
        if(power == 1){
            return base;
        }
        int ans = pow(base,power/2) * pow(base,power/2);
        if(power % 2 != 0) ans *= base;
        return ans;
        
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
