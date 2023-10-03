package EclipseJavaCodes;
//Write a java program to find the number of occurrences of characters from the
//two strings.
import java.util.*;
public class main87 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String subStr = sc.nextLine();
    String str = sc.nextLine();
    
    int count = 0;
    int index = 0;
    while ((index = str.indexOf(subStr, index)) != -1) {
      count++;
      index +=1;
    }
    System.out.println("The no of occurences: "+count);
    
  }
}
