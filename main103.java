package EclipseJavaCodes;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main103 {
  public static void main(String[] args)throws Exception {
	  Scanner sc=new Scanner(System.in);
    String sampleDate =sc.nextLine();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      Date date = dateFormat.parse(sampleDate);
      
      SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM MMM");
      String monthName = monthFormat.format(date);
      System.out.println(monthName);
    
  }
}

