package devideAndConquer;

public class sortMerge {
    public static void merge(int[] arr, int left, int right, int mid) {
        int[] temp = new int[right-left+1];
        int i = left; //iterator for left part
        int j = mid+1;//iterator for right part
        int k = 0;//iterator for temporary array
        while(i <= mid && j <= right){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        //right part
        while(j <= right) {
            temp[k++] = arr[j++];
        }

        for(k=0, i=left; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = left+(right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,right,mid);
        }

    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        for(int e:arr){
            System.out.print(e+"\t");
        }
        System.out.println();
        mergeSort(arr,0,arr.length-1);
        for(int e:arr){
            System.out.print(e+"\t");
        }
    }
}
