package arrayPartOne;

public class kadanesAlgoMaxSum {
    public static void kadanes(int[] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                check = false;
            }
        }
        if(!check){
            int currSum=0,maxsum = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                currSum = arr[i]+currSum;
                if(currSum < 0){
                    currSum = 0;
                }
                maxsum = Math.max(currSum,maxsum);
            }
            System.out.println("Max sum is "+maxsum);
        } else {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println("Max is "+max);
        }
    }

    public static void main(String[] args) {
        int [] arr = {-2,-3,4,-1,-2,1,5,-3};
//        int[] arr = {-1,-2,-3,-4};
        kadanes(arr);
    }
}
