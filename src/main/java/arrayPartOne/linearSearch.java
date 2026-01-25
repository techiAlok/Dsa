package arrayPartOne;

public class linearSearch {
    public static int findIdx(int[] arr, int key) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                ans =  i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16};
        int key = 10;
        int ans = findIdx(arr,key);
        System.out.println("key lies at index :"+ans);
    }
}
