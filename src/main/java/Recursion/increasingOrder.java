package Recursion;

public class increasingOrder {
    public static void printIncrease(int num) {
        if(num < 1) return;
        printIncrease(num-1);
        System.out.print(num+"\t");
    }
    public static void main(String[] args) {
        printIncrease(10);
    }
}
