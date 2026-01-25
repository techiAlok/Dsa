package Array_1;
import java.util.Scanner;
public class secondMaxByIndex {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int n = -1;
        int m = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                n = i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i != n && arr[i] > secMax){
                secMax = arr[i];
                m = i;
            }
        }
        System.out.println(" max : "+max+" index : "+n+" SecMax :"+secMax+" index : "+m);
    }
}
