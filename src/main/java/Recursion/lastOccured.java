package Recursion;

public class lastOccured {
    public static int lastOccurence(int[] arr, int i, int key) {
        if(i < 0) return -1;
        if(arr[i] == key) return i;
        return lastOccurence(arr,i-1, key);
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int ans = lastOccurence(arr,arr.length-1,5);
        if(ans == -1){
            System.out.println("Element not int array");
        } else {
            System.out.println("Element LAST found at "+ans+" index");
        }
    }
}
