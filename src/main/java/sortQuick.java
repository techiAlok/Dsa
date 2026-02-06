package devideAndConquer;

public class sortQuick {
    public static void quickSort(int[] arr, int leftmost, int rightmost) {
        if(leftmost<rightmost) {
            int partIndx = partition(arr, leftmost, rightmost);
            quickSort(arr, leftmost, partIndx - 1);
            quickSort(arr, partIndx + 1, rightmost);
        }
    }

    public static int partition(int[] arr, int leftmost, int rightmost) {
        int pivotElement = arr[rightmost];
        int i = leftmost-1;
        for(int j=leftmost; j<rightmost; j++){
            if(arr[j] < pivotElement){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivotElement;
        arr[rightmost] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
       int[] arr = {6,3,9,8,2,5,-2,-5};
        for(int e:arr){
            System.out.print(e+"\t");
        }
        System.out.println();
       quickSort(arr,0,arr.length-1);
       for(int e:arr){
           System.out.print(e+"\t");
       }
    }
}
