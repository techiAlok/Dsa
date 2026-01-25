package BitManipulation;

public class countSetBit {
    public static int coutSetBit(int num) {
        int count = 0;
        while (num!=0){
            if((num & 1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(coutSetBit(45));
    }
}
