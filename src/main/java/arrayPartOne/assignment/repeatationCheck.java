package arrayPartOne.assignment;

public class repeatationCheck {
    public static boolean check(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] == ele){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
//        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        int[] arr = {1, 2, 3, 4};
        boolean ans = check(arr);
        System.out.println(ans);
    }
}
