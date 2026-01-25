package Array_1;

public class sortArra {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,0,0,1,0};
        int NoZ = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                NoZ++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(NoZ != 0){
                arr[i] = 0;
                NoZ--;
            }else {
                arr[i] = 1;
            }
        }
        for(int ele:arr){
            System.out.print(ele+"\t");
        }
    }
}
