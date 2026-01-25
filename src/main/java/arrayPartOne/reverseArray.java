package arrayPartOne;

public class reverseArray {
    public static void revArr(int[] arr) {
        int l = 0, h = arr.length-1;
        while(l <= h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;h--;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};
        printArr(arr);
        revArr(arr);
        printArr(arr);
    }
}
