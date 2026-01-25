package Array_1;

import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,-1,8,5,4,9,2};
        int target = 9;
        boolean flag = false;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(j != i){
                    if(target == arr[i]+arr[j]){
                        ans.add(arr[j]);
                        break;
                    }
                }
            }
        }
        for(int ele:ans){
            System.out.println(ele);
        }
    }
}
