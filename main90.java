package EclipseJavaCodes;

import java.util.Scanner;
import java.util.regex.Pattern;
//write a java program finding data type of user input using Regular Expression.
public class main90 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter an input: ");
      String input = sc.nextLine();

      if (Pattern.matches("^-?[0-9]+$", input)) {
         System.out.println("The datatype of "+input+" is: java.lang.Integer");
      } else if (Pattern.matches("^-?[0-9]+\\.[0-9]+$", input)) {
    	  System.out.println("The datatype of "+input+" is: java.lang.Double");
      } else if (Pattern.matches("^-?[0-9]+\\.[0-9]+f$", input)) {
    	  System.out.println("The datatype of "+input+" is: java.lang.Float");
      } else if (Pattern.matches("^'[a-zA-Z]'$", input)) {
    	  System.out.println("The datatype of "+input+" is: java.lang.Character");
      } else if (Pattern.matches("^\".*\"$", input)) {
    	  System.out.println("The datatype of "+input+" is: java.lang.String");
      } else if (Pattern.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}$", input)) {
         System.out.println("Date (yyyy-MM-dd)");
      } else {
         System.out.println("Unknown");
      }
   }
}
