package EclipseJavaCodes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class main95 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String date1 =sc.next();
    String date2 =sc.next();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    try {
      Date parsedDate1 = dateFormat.parse(date1);
      Date parsedDate2 = dateFormat.parse(date2);
      int result = parsedDate1.compareTo(parsedDate2);
      if (result < 0) {
        System.out.println(date1 + " is less than " + date2);
      } else if (result == 0) {
        System.out.println(date1 + " is equal to " + date2);
      } else {
        System.out.println(date1 + " is greater than " + date2);
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}

