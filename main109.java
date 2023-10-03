package EclipseJavaCodes;

import java.util.Scanner;

public class main109 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    if (name.isEmpty()) {
      System.out.println("The string is empty");
    } else {
      System.out.println("The string is " + name);
    }
  }
}

