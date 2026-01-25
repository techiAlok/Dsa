package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class addSetGetOper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(9);
        arr.add(5);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        arr.set(2,56);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
