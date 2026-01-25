package arrayPartOne;

public class subArrays {
    public static int printPair(int[] arr,int i,int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            System.out.print(arr[k]+",");
            sum += arr[k];
        }
        System.out.println("("+sum+")");
        System.out.print("\t");
        return sum;
    }
    public static void main(String[] args) {
//        int[] arr = {2,4,6,8,10};
        int[] arr = {1,-2,6,-1,3};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            System.out.print(arr[i]+"\t");
            for (int j = i+1; j < arr.length; j++) {
                int ans = printPair(arr,i,j);
                if(ans > max){
                    max = ans;
                } if(ans < min){
                    min = ans;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("max toatal subarray : "+max);
        System.out.println("min toatal subarray : "+min);
    }
}
