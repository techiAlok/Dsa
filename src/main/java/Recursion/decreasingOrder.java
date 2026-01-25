package Recursion;

public class decreasingOrder {
    public static void main(String[] args) {
        printDec(10);
    }
    public static void printDec(int a){
        if(a<1) return;
        System.out.println(a);
        printDec(a-1);
    }
}
