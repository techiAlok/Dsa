package BitManipulation;

public class clearIthBit {
    public static int clearBit(int num,int i) {
        int bitMask = ~(1<<i);
        return num&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBit(5,0));
    }
}
