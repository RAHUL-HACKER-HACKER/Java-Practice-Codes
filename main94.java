package EclipseJavaCodes;
//Write a regular expression to represent all valid identifiers in java language.
import java.util.regex.*;
import java.util.*;
public class main94 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String identifier =sc.nextLine();
	  Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9#-]{1,}$");
	  Matcher m = p.matcher(identifier);
	  if(m.matches()) {
		  System.out.println(identifier+":Valid Identifier");
	  }else {
		  System.out.println(identifier+":Invalid Identifier");
	  }
  }
}
