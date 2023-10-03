package EclipseJavaCodes;
//Write a java program to find whether the password is valid or invalid using the
//regular expression.
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class main85 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter password: ");
    String password = sc.nextLine();
    if (isValidPassword(password)) {
      System.out.println(password+" is valid password");
    } else {
      System.out.println(password+" is invalid password");
    }
  }
  private static boolean isValidPassword(String password) {
    if (password.length() < 8 || password.length() > 15) {
      return false;
    }
    Pattern uc = Pattern.compile("[A-Z]");
    Pattern lc = Pattern.compile("[a-z]");
    Pattern np = Pattern.compile("[0-9]");
    Pattern sp = Pattern.compile("[^a-zA-Z0-9]");
    Matcher hu = uc.matcher(password);
    Matcher hl = lc.matcher(password);
    Matcher hn = np.matcher(password);
    Matcher hp = sp.matcher(password);
    if (!hu.find() || !hl.find() || !hn.find() || !hp.find()) {
      return false;
    }


    return true;
  }
}
