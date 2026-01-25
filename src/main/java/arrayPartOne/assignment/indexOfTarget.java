package arrayPartOne.assignment;

public class indexOfTarget {
    public static void printArr(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int l,int h) {
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
    }
    public static int findIndex(int[] arr, int target) {
        int l = 0, h = arr.length-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] == target) {
                return  mid;
            }
            if (arr[l] <= arr[mid]) {
                if (target >= arr[l] && target < arr[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ans = findIndex(arr,target);
        System.out.println(ans);
    }
}
