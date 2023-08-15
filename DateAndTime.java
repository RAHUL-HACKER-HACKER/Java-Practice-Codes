package javaPrograms;
import java.util.*;

import java.time.*;

public class DateAndTime {

	public static void main(String[] args) {
		
		//local date
		LocalDate today = LocalDate.now(); 
		System.out.println(today);
		
		//custom date
		LocalDate customDate=LocalDate.of(2022, 3, 13);
		System.out.println(customDate);
		
		int dayOfMonth=today.getDayOfMonth();
		
		Month month=today.getMonth();
		//or
		int monthValue=today.getMonthValue();
		
		int year=today.getYear();
		System.out.println(dayOfMonth);
		System.out.println(month);
		System.out.println(monthValue);
		System.out.println(year);
		//format date
		System.out.println(dayOfMonth+"/"+monthValue+"/"+year);
		
		//date change from today
		LocalDate yesterday=today.minusDays(1);
		LocalDate pastMonth=today.minusMonths(1);
		LocalDate pastYear=today.minusYears(1);
		System.out.println(yesterday);
		System.out.println(pastMonth);
		System.out.println(pastYear);
		
		//some conditions
		if(today.isAfter(yesterday)) {
			System.out.println("Yes Bro");
		}
		
		//local time
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		//custom time
		LocalTime customTime=LocalTime.of(4, 20, 30);
		System.out.println(customTime);
		
		//Separate time
		int hour=localTime.getHour();
		int minute=localTime.getMinute();
		
		int nano=localTime.getNano();
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println(nano);
		
		//time change from now
		LocalTime beforeOneHour=localTime.minusHours(1);
		System.out.println(beforeOneHour);
			
		
		//string to localTime format
		LocalTime parseTime=LocalTime.parse("15:30:45");
		System.out.println(parseTime);
		
		if(localTime.isAfter(beforeOneHour)) {
			System.out.println("ha bhai");
		}
		
		//Local Date and Time
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);
		
		
		
		
			

	}

}
