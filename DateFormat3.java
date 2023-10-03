package javaPrograms;
import java.text.*;
import java.time.*;
import java.util.*;
import java.lang.*;

public class DateFormat3 {

	public static void main(String[] args) {
		//String type to Date type
				String str="12/09/2023";
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date date = null;
				try {
					date = sdf.parse(str);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(date);
				
				
				//Date()
				Date dateTime=new Date();
				System.out.println(dateTime);
				
				SimpleDateFormat formatTimeDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				//Date type to String
		        String dateTime1 = formatTimeDate.format(dateTime);
		        System.out.println(dateTime1);
				
		        SimpleDateFormat formatTime1 = new SimpleDateFormat("hh.mm aa");
		        String time1 = formatTime1.format(dateTime);
		        System.out.println(time1);
		        
		        
		        SimpleDateFormat formatTime2 = new SimpleDateFormat("hh.mm.ss");
		        String time2 = formatTime2.format(dateTime);
		        System.out.println(time2);
		        
		        
		        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
		        String date1 = formatDate.format(dateTime);
		        System.out.println(date1);
		        
		        // hh = hours in 12hr format
		        // mm = minutes
		        // ss = seconds
		        // aa = am/pm
		        // z  = tine zone
		        // Z  = time zone
		        // yyyy=years
		        // MM  =Month
		        // dd  =days
				
				
				//Local Date and Time
				LocalDateTime localDateTime=LocalDateTime.now();
				System.out.println(localDateTime);
				
				//local date 
				LocalDate localdate = LocalDate.now();
				System.out.println(localdate);
				
				//local time
				LocalTime localTime=LocalTime.now();
				System.out.println(localTime);
				
				
				//
				String format; 
		        // Parsing hours, minutes and seconds in array
				String time="14:02:45";
		        String[] arr = time.split(":");
		 
		        // Converting hours into integer
		        int hh = Integer.parseInt(arr[0]);
		 
		        if (hh > 12) {
		            hh = hh - 12;
		            format = "PM";
		        }
		        else if (hh == 00) {
		            hh = 12;
		            format = "AM";
		        }
		        else if (hh == 12) {
		            hh = 12;
		            format = "PM";
		        }
		        else {
		            format = "AM";
		        }
		        
		        // Converting hh to String and
		        // padding it with 0 on left side
		        String hour = String.format("%02d", hh);
		        String minute = arr[1];
		        String second = arr[2];
		        
		        // Printing formatted time
		        System.out.print("Time in 12-hour format is : ");
		        System.out.print(hour+":"+minute +":"+ second+" "+format);
		        
		        
		        //
		        String str1="09:20:55 AM";
				String[] arr1=str1.split(":");
				
				System.out.println(Arrays.toString(arr1));
				
				int hh1=Integer.valueOf(arr1[0]);
				int MM1=Integer.valueOf(arr1[1]);
				int ss1=Integer.valueOf(arr1[2].substring(0,2));
				String aa=arr1[2].substring(2);
				
				String hh1_format=String.format("%02d",hh1);
				System.out.println(hh1_format);
				System.out.println(MM1);
				System.out.println(ss1);
				System.out.println(aa);
				

	}

}
