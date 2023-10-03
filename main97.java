package EclipseJavaCodes;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class main97 {
public static void main(String args[]) throws ParseException {
	  Scanner sc=new Scanner(System.in);
	  int year=sc.nextInt();
	  int month=sc.nextInt();
	  int day=sc.nextInt();
	  LocalDate d= LocalDate.of(year, month+1, day);
	  String date_string=String.valueOf(d);
   //Instantiating the SimpleDateFormat class
   SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd");      
   //Parsing the given String to Date object
   Date date = dateFormate.parse(date_string);      
   System.out.println(date);
}
}