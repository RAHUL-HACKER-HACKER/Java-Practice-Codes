package EclipseJavaCodes;

import java.util.*;
public class main116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        double d1 = distance(x1, y1, x2, y2);
        double d2 = distance(x1, y1, x3, y3);
        double d3 = distance(x2, y2, x3, y3);
        if (d1 <= r && d2 <= r) {
            System.out.println("Yes");
        } else if (d1 <= r && d3 <= r) {
            System.out.println("Yes");
        } else if (d2 <= r && d3 <= r) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
