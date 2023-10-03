package EclipseJavaCodes;
//Write a Java program to check for a number at the end of a given string.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class main86 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Pattern pattern = Pattern.compile(".*\\d$");
    Matcher matcher = pattern.matcher(str);
    System.out.println(str);
    if (matcher.find()) {
      System.out.println("Found a match!");
    }else {
    	System.out.println("Not matched!");
    }
  }
}



