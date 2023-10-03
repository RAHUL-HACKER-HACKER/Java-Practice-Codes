package EclipseJavaCodes;

import java.util.*;
public class main119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        sc.close();

        if (x1 == x2 && y1 == y2) {
            System.out.println("sad");
        } else if (x1 > x2) {
            System.out.println("left");
        } else if (x1 < x2) {
            System.out.println("right");
        } else if (y1 > y2) {
            System.out.println("down");
        } else {
            System.out.println("up");
        }
    }
}
