package Array_1;

public class passingArrayToMethods {
    public static void change(int[] arr) {
        arr[0] = 67;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,8};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
}
