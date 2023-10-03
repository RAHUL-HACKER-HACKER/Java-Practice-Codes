package EclipseJavaCodes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Password {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter password: ");
    String password = sc.nextLine();
    if (isValidPassword(password)) {
      System.out.println("Valid Password");
    } else {
      System.out.println("Invalid Password");
    }
  }

  private static boolean isValidPassword(String password) {
    // Password must be 8 to 15 characters long
    if (password.length() < 8 || password.length() > 15) {
      return false;
    }

    // Password must contain at least one upper case and one lower case alphabet
    Pattern upperCasePattern = Pattern.compile("[A-Z]");
    Pattern lowerCasePattern = Pattern.compile("[a-z]");
    Matcher hasUpperCase = upperCasePattern.matcher(password);
    Matcher hasLowerCase = lowerCasePattern.matcher(password);
    if (!hasUpperCase.find() || !hasLowerCase.find()) {
      return false;
    }

    // Password must contain at least one number
    Pattern numberPattern = Pattern.compile("[0-9]");
    Matcher hasNumber = numberPattern.matcher(password);
    if (!hasNumber.find()) {
      return false;
    }

    // Password must contain at least one special character
    Pattern specialCharacterPattern = Pattern.compile("[^a-zA-Z0-9]");
    Matcher hasSpecialCharacter = specialCharacterPattern.matcher(password);
    if (!hasSpecialCharacter.find()) {
      return false;
    }

    return true;
  }
}
