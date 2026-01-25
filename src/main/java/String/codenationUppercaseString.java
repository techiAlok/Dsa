package String;
import java.util.*;
public class codenationUppercaseString {
    public static void main(String[] args) {
        String str = "hi, i am shradha";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if(i == 0){
                char ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            } else if(str.charAt(i) == ' '){
                char ch = str.charAt(i);
                sb.append(ch);
                ch = Character.toUpperCase(str.charAt(i+1));
                sb.append(ch);
                i++;
            } else {
                char ch = str.charAt(i);
                sb.append(ch);
            }

        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
