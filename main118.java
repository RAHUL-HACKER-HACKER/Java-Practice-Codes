package EclipseJavaCodes;

import java.util.Scanner;

public class main118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int diff = Math.abs(n - m);
        if (diff <= k) {
            System.out.println(0);
        } else {
            System.out.println(diff - k);
        }
    }
}
