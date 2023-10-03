package EclipseJavaCodes;
import java.util.*;
public class main106 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
    String input =sc.nextLine();
    System.out.println(rcv(input));
  }
  public static String rcv(String input) {
    List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < input.length()) {
      if (!vowels.contains(input.charAt(i))) {
        result.append(input.charAt(i));
        i++;
      } else {
        result.append(input.charAt(i));
        i++;
        while (i < input.length() && vowels.contains(input.charAt(i))) {
          i++;
        }
      }
    }
    return result.toString();
  }
}
