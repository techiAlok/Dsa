package sorting_1;
import java.util.Arrays;
public class inbultSOrting {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,3};
        for(int ele:arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
}
