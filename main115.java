package EclipseJavaCodes;
import java.util.*;
import java.text.DecimalFormat;


public class main115 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");
    int basicSalary = sc.nextInt();
    double hra, da, grossSalary;

    if (basicSalary < 15000) {
      hra = basicSalary * 0.15;
      da = basicSalary * 0.90;
    } else {
      hra = 5000;
      da = basicSalary * 0.98;
    }

    grossSalary = basicSalary + hra + da;
    System.out.println(df.format(grossSalary));
  }
}
