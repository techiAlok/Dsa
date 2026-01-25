package Array_1;
import java.util.Scanner;
public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<len; i++){
            mx = Math.max(mx,arr[i]);
        }
        for(int i=mx; i>=1; i--){
            for(int j=0; j<len; j++){
                if(arr[j] >= i){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
