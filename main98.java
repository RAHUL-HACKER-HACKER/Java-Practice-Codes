package EclipseJavaCodes;

import java.time.LocalDate;
import java.time.Period;

public class main98 {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println("Current date: " + today);

    LocalDate oneWeekLater = today.plusWeeks(1);
    System.out.println("Next week: " + oneWeekLater);

    LocalDate oneMonthLater = today.plusMonths(1);
    System.out.println("Next month: " + oneMonthLater);

    LocalDate oneYearLater = today.plusYears(1);
    System.out.println("next year: " + oneYearLater);

    LocalDate tenYearsLater = today.plusYears(10);
    System.out.println("Date after 10 year: " + tenYearsLater);
  }
}
