package basics;

public class reverseNum {
    public static void main(String[] args) {
        int num = 10899;
        int og = num;
        int rev = 0;
        while(num > 0){
            int temp = num;
            int dig = temp%10;
//            System.out.println(dig);
            rev = (rev*10) + dig;
            num /= 10;
        }
        System.out.println(og+"<----->"+rev);
    }
}
