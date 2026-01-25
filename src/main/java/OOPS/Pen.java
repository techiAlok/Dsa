package OOPS;

public class Pen {
    public static void main(String[] args) {
        EPen p1 = new EPen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}


class EPen {
    String color;
    int tip;
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}
