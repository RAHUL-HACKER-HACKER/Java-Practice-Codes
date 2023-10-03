package EclipseJavaCodes;

import java.time.*;
import java.util.*;
public class main104 {
 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 String name=sc.nextLine();
     ZoneId zoneId = ZoneId.of(name);
     Clock clock = Clock.system(zoneId);
     Instant instantObj = clock.instant();
     ZonedDateTime time = instantObj.atZone(clock.getZone());
     System.out.println("Instant for class " + clock+ " is " + time.toString());
 }
}
