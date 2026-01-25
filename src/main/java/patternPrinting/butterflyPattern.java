package patternPrinting;

public class butterflyPattern {
    public static void main(String[] args) {
        int m = 6;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= 2*m; j++) {
                if(j <= i || j > (2*(m-i))+i){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= 2*m; j++) {
                if(j <= m-(i-1) || j > m+(i-1)){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
