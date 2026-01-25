package String;

public class shotestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'E'){
                x++;
            } else {
                x--;
            }
        }
        float ans = (float) Math.sqrt((x*x)+(y*y));
        System.out.println(ans);
    }
}
