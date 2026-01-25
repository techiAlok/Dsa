package Array_1;
import java.util.Scanner;
public class linearSearchByFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elementd :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search :");
        int ele = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(ele == arr[i]){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("Element found ");
        }else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
