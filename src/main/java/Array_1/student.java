package Array_1;
import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student :");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter marks :");
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        for(int i = 0; i<n;i++){
            if(marks[i] < 35){
            System.out.println("roll no : "+(i+1));
            }
        }
        sc.close();
    }
}
