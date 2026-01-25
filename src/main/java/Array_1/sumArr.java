package Array_1;

public class sumArr {
    public static void main(String[] args) {
        int[] arr1 = {3,1,0,7,5,3,4,5,8};
        int[] arr2 = {1,1,1,1,1,1};
        int len = Math.max(arr1.length,arr2.length);
        int[] ans = new int[len];
        int n = arr1.length-1;
        int m = arr2.length-1;
        for(int i=len-1; i>=0; i--){
            int val1 = (n>=0)? arr1[n]:0;
            int val2 = (m>=0)? arr2[m]:0;
            ans[i] = val1+val2;
            n--;
            m--;
        }
        for(int i=0; i<len; i++){
            System.out.println(ans[i]);
        }
    }
}
