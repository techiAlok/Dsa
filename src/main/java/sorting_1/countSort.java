package sorting_1;

public class countSort {
    public static void countingSRTa(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }

        //storing Frequency
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i] > 0){
                arr[j++] = i;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        for(int ele:arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
        countingSRTa(arr);
        for(int ele:arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
}
