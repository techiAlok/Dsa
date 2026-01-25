package patternPrinting;

public class hollowRhombus {
    public static void main(String[] args) {
        int m = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m-i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= m; j++) {
                if(i==1 || j==1 || j==m || i==m){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
