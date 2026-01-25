package Array_1;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] a = {24,35,56,45,65};
        int[] b = {12,23,34,67};
        int[] c = new int[a.length+b.length];
//        int j=0,k=0;
//        for(int i=0;i<c.length;i++){
//           if(j<a.length && k<b.length){
//               if(a[j] < b[k]){
//                   c[i] = a[j++];
//               } else {
//                   c[i] = b[k++];
//               }
//           }
//           else if(j<a.length){
//               c[i] = a[j++];
//           }
//           else if(k<b.length){
//               c[i] = b[k++];
//           }
//        }
        int i = a.length-1, j = b.length-1;
        for(int k=c.length-1;k>=0;k-- ){
            if(i!=-1 && j!=-1){
                if(a[i]>b[j]){
                    c[k] = a[i--];
                }else{
                    c[k] = b[j--];
                }
            }
            else if(i != -1){
                c[k] = a[i--];
            }
            else if(j != -1){
                c[k] = b[j--];
            }
        }
        for(int ele:c){
            System.out.print(ele+"\t");
        }
    }
}
