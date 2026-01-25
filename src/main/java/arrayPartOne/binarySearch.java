package arrayPartOne;

public class binarySearch {
    public static int findEle(int[] arr,int key) {
        int l = 0, h = arr.length-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] > key){
                h = mid-1;
            } else if(arr[mid] < key){
                l = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int key = 10;
        int ans = findEle(arr,key);
        System.out.println(ans);
    }
}
