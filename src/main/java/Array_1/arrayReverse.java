package Array_1;

public class arrayReverse {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int j = arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            if(i < j){
                arr[i] = arr[j];
                arr[j--] = temp;
            }
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
