package EclipseJavaCodes;

import java.util.*;
public class main120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Prize 2");
            } else if (a == 60 && b == 60 && c == 60) {
                System.out.println("Prize 3");
            } else {
                System.out.println("Prize 1");
            }
        } else {
            System.out.println("No Prize");
        }
    }
}
