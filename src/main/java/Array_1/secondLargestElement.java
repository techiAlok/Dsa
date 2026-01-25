package Array_1;
import java.util.Scanner;
public class secondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Eneter the element :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int secMax = arr[0];
        for(int i=0;i<n;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] != max){
                if(secMax < arr[i]){
                    secMax = arr[i];
                }
            }
        }
        System.out.println("Second max = "+secMax);
        sc.close();
    }
}
