package BitManipulation;

public class poerOf2orNot {
    public static boolean check(int num) {
        boolean flag = false;
        if((num & (num-1))==0){
            flag = true;
        }
        return flag;

    }
    public static void main(String[] args) {
        System.out.println(check(5));
    }
}
