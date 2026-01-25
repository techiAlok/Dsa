package String;

public class checkPalindrome {
    public static void main(String[] args) {
        String str = "back";
        boolean ans = false;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                ans = true;
            }
        }
        if(ans){
            System.out.println("It's a palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
