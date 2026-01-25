package BitManipulation;

public class getIthBit {
    public static int getithBit(int num, int i) {
        int ans = num & (1<<i);
        return ans;
    }
    public static void main(String[] args) {
        if(getithBit(5,1)==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }

    }
}
