package EclipseJavaCodes;
//Write a Java program to check whether a string contains only a certain set of
//characters (in this case a-z, A-Z, and 0-9) using regex.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class main89 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String pattern = "[a-zA-Z0-9]+";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(input);
    System.out.println(input);
    System.out.println(m.matches());
  }
}

