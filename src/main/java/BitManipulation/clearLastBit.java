package BitManipulation;

public class clearLastBit {
    public static int clearLastBit(int num, int i) {
        int bitMask = (~0)<<i;
        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastBit( 15,2));
    }
}
