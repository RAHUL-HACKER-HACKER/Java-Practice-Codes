package EclipseJavaCodes;
import java.time.*;
import java.util.*;
public class main105 {  
   public static void main(String[] args)
    {
	   Scanner sc=new Scanner(System.in);
	   int year=sc.nextInt();
	   int month=sc.nextInt();
	   int date=sc.nextInt();
	   int min=sc.nextInt();
	   int hrs=sc.nextInt();
     LocalDateTime dateTime = LocalDateTime.of(year,month,date,min,hrs);
     LocalDateTime dateTime2 = LocalDateTime.now();
     int diffInNano = java.time.Duration.between(dateTime, dateTime2).getNano();
     long diffInSeconds = java.time.Duration.between(dateTime, dateTime2).getSeconds();
     long diffInMilli = java.time.Duration.between(dateTime, dateTime2).toMillis();
     long diffInMinutes = java.time.Duration.between(dateTime, dateTime2).toMinutes();
     long diffInHours = java.time.Duration.between(dateTime, dateTime2).toHours();
     System.out.printf("\nDifference is %d Hours, %d Minutes, %d Milli, %d Seconds and %d Nano\n\n", 
      diffInHours, diffInMinutes, diffInMilli, diffInSeconds, diffInNano );

  }
}