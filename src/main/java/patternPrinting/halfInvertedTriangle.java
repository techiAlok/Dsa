package patternPrinting;

public class halfInvertedTriangle {
    public static void main(String[] args) {
        int m = 4, n = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(j > m-i){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
