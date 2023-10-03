//package EclipseJavaCodes;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Collections;
//import java.util.Date;
//import java.util.Scanner;
//
//class Event implements Comparable<Event> {
//  private String name;
//  private Date eventDate;
//  private int attendeesCount;
//
//  public Event(String name, Date eventDate, int attendeesCount) {
//    this.name = name;
//    this.eventDate = eventDate;
//    this.attendeesCount = attendeesCount;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public Date getEventDate() {
//    return eventDate;
//  }
//
//  public void setEventDate(Date eventDate) {
//    this.eventDate = eventDate;
//  }
//
//  public int getAttendeesCount() {
//    return attendeesCount;
//  }
//
//  public void setAttendeesCount(int attendeesCount) {
//    this.attendeesCount = attendeesCount;
//  }
//
//  @Override
//  public int compareTo(Event o) {
//    return o.attendeesCount - this.attendeesCount;
//  }
//}
//
//public class main111 {
//  public static void main(String[] args) throws ParseException {
//    ArrayList<Event> events = new ArrayList<>();
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    sc.nextLine();
//    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//    for (int i = 0; i < n; i++) {
//    	String str=sc.nextLine();
//      String[] eventDetails = str.split(",");
//      events.add(
//          new Event(
//              eventDetails[0],
//              formatter.parse(eventDetails[1]),
//              Integer.parseInt(eventDetails[2])));
//    }
//    Collections.sort(events);
//    int maxAttendees = 0;
//    int weekOfMaxAttendees = 0;
//    for (Event event : events) {
//      Calendar cal = Calendar.getInstance();
//      cal.setTime(event.getEventDate());
//      int week = cal.get(Calendar.WEEK_OF_MONTH);
//      if (week > weekOfMaxAttendees) {
//        weekOfMaxAttendees = week;
//        maxAttendees = event.getAttendeesCount();
//      } else if (week == weekOfMaxAttendees) {
//        maxAttendees = Math.max(maxAttendees, event.getAttendeesCount());
//      }
//    }
//    System.out.println("maximum booking week: " + weekOfMaxAttendees);
//  }
//}
