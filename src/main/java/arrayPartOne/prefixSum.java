package arrayPartOne;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        //inserting sum of elemet upto each of it's index
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1]+arr[i];
        }
        //calculating which pair has max sum by its prefix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0?prefix[j]:prefix[j]-prefix[i-1];
                if(max < currSum){
                    max = currSum;
                }
            }
        }
        System.out.println("Max is "+max);
    }
}
