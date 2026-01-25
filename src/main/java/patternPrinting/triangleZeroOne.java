package patternPrinting;

public class triangleZeroOne {
    public static void main(String[] args) {
        int n = 5, m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0){
                    m=1;
                }else{
                    m=0;
                }
                System.out.print(m+"\t");
//                m = m==0?1:0;
            }
            System.out.println();
        }
    }
}
