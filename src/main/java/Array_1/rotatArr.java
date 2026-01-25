package Array_1;
import java.util.Scanner;
public class rotatArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70,80};
        int n = arr.length;
        System.out.print("Enter count to rotate : ");
        int k = sc.nextInt();
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int ele:arr){
            System.out.println(ele);
        }
    }

    public static void reverse(int[] arr, int sta,int end) {
       while(sta<end){
           int temp = arr[sta];
           arr[sta] = arr[end];
           arr[end] = temp;
           sta++;
           end--;
       }
    }
}
