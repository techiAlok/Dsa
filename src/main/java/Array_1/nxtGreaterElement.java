package Array_1;

public class nxtGreaterElement {
    public static void main(String[] args) {
        int[] a = {12,8,41,37,2,49,16,28,21};
        for(int i=0; i<a.length;i++) {
            int min = Integer.MIN_VALUE;
            if (i != a.length - 1) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] > min) {
                        min = a[j];
                    }
                }
            } else {
                min = -1;
            }
            a[i] = min;
        }
        for(int ele:a){
            System.out.print(ele+"\t");
        }
    }
}
