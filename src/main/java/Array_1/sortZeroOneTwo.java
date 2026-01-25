package Array_1;

public class sortZeroOneTwo {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
//        int NoZ = 0, NoT = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == 0){
//                NoZ++;
//            }
//            if(arr[i] == 1){
//                NoT++;
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            if(NoZ>0){
//                arr[i] = 0;
//                NoZ--;
//            } else if(NoT>0){
//                arr[i] = 1;
//                NoT--;
//            } else {
//                arr[i] = 2;
//            }
//        }
        int l = 0, m=0, h=arr.length-1;
        while(m<h){
            if(arr[m] == 0){
                swap(arr,m,l);
                l++;
                m++;
            }
            if(arr[m] == 1){
                m++;
            }
            if(arr[m] == 2){
                swap(arr,m,h);
                h--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+"\t");
        }
    }
}
