package patternPrinting;
public class hollowSquare {
    public static void main(String[] args) {
        int n=4, m=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==1 || i==4 || j==1 || j==5){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
