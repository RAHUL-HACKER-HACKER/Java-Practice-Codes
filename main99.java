package EclipseJavaCodes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class main99 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year1 = input.nextInt();
    int year2 = input.nextInt();
    input.close();
    int n=year2-year1;
    if(n>=0){
    	for(int i=0;i<=n;i++) {
    	 LocalDate start = LocalDate.of(year1+i, 1, 1);
    	 LocalDate end = LocalDate.of(year1+(i+1), 1, 1);
    	 long days = ChronoUnit.DAYS.between(start, end);
    	 System.out.println("Year: "+(year1+i)+" = "+days);
    	}
    }else {
    	System.out.println("End year must be greater than first year!");
    }
  }
}

