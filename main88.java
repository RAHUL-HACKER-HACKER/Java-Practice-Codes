package EclipseJavaCodes;
//Write a Java program to count the number of vowels in a given string using
//regular expressions.
import java.util.*;
import java.util.regex.*;
public class main88 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();
    Pattern p = Pattern.compile("[aeiouAEIOU]");
    Matcher m = p.matcher(input);
    int count = 0;
    while (m.find()) {
      count++;
    }
    System.out.println("Original string: " + input);
    System.out.println("New string: " + count);
  }
  
}
