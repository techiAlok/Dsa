package BitManipulation;

public class clearRangeBit {
    public static int clearBitIJ(int num, int i, int j) {
        int a = (~0)<<(j+1);
        int b = (int)Math.pow(2,i)-1;
        int bitMask = a | b;
        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBitIJ(15,1,2));
    }
}
