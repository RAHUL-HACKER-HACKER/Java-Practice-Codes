package EclipseJavaCodes;

import java.util.Scanner;

public class main114 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int coins = sc.nextInt();
    char red = sc.next().charAt(0);
    int points = 0;
    if (coins >= 1 && coins <= 9) {
      points = 10 - coins;
      if (red == 'y') {
        points += 5;
      }
      System.out.println(points);
    } else {
      System.out.println("Invalid Input");
    }
  }
}
