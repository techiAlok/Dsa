package BitManipulation;

public class setIthBit {
    public static int setBit(int num, int i) {
        int bitMask = (1<<i);
        return num|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setBit(5,1));
    }
}
