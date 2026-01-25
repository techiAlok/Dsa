package Array_1;
import java.util.Scanner;
public class arrayRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70};
        int[] ans = new int[arr.length];
        System.out.print("Enter the the rotation count : ");
        int m = sc.nextInt();
        int k = m;
        if(m > arr.length){
            k = m - arr.length;
        }
        int n = arr.length;
        for(int i=0; i<k; i++){
            ans[k-1-i] = arr[n-1-i];
        }
        for(int i=0;i<n-k;i++){
            ans[i+k] = arr[i];
        }
        for(int ele:ans){
            System.out.println(ele);
        }
    }
}
