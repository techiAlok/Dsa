package basics;
import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = sc.nextInt();
        if(year % 4 == 0 ){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap");
                } else {
                    System.out.println("Not Leap");
                }
            } else {
                System.out.println("Leap");
            }
        } else {
            System.out.println("Not Leap");
        }
        sc.close();
    }
}
