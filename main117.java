package EclipseJavaCodes;

import java.util.Scanner;

public class main117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double V1 = sc.nextDouble();
        double V2 = sc.nextDouble();

        double timeStairs = (Math.sqrt(2) * N) / V1;
        double timeElevator = (2 * N) / V2;

        if (timeStairs < timeElevator) {
            System.out.println("Stairs");
        } else {
            System.out.println("Elevator");
        }
    }
}
