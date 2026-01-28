package Recursion;

public class firstOccurrence {
    public static int checkOccurence(int[] arr, int i, int key) {
        if(i==arr.length) return -1;
        if (arr[i] == key) return i;
        return checkOccurence(arr, i + 1, key);
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int ans = checkOccurence(arr,0,5);
        if(ans == -1){
            System.out.println("Element not int array");
        } else {
            System.out.println("Element FIRST found at "+ans+" index");
        }
    }
}
