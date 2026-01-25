package Array_1;

public class arraySum {
    public static void main(String[] args) {
        int[] arr = {23,34,5,23,132,54,56};
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("Sum is : "+sum);
    }
}
