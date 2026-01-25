package BitManipulation;

public class updateIthBit {
    public static int clearBit(int num, int i) {
        int bitMask = ~(1<<i);
        return num & bitMask;
    }

    public static int updateBit(int num, int i, int newBit) {
        int n = clearBit(num,i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateBit(10,2,1));
    }
}
