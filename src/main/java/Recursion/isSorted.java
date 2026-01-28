package Recursion;

public class isSorted {
    public static boolean isSort(int[] arr, int i) {
        boolean ans = false;
        if(i < arr.length-1){
            if(arr[i] <= arr[i+1]) {
                return true;
            }
            else {
                return false;
            }
        }
        return isSort(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,8};
        boolean ans = isSort(arr,0);
        if (ans){
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
