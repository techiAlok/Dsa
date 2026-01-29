package Recursion;

public class powerOfN {
    public static int pow(int base, int power) {
        if(power == 1){
            return base;
        }
        return base * pow(base,power-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
