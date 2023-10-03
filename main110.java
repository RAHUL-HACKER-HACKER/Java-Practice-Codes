package EclipseJavaCodes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Event {
    private String name;
    private Date eventDate;
    private Integer attendeesCount;

    public Event() {
    }

    public Event(String name, Date eventDate, Integer attendeesCount) {
        this.name = name;
        this.eventDate = eventDate;
        this.attendeesCount = attendeesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Integer getAttendeesCount() {
        return attendeesCount;
    }

    public void setAttendeesCount(Integer attendeesCount) {
        this.attendeesCount = attendeesCount;
    }
}

public class main110 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Event> events = new ArrayList<Event>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < n; i++) {
            String[] input = sc.next().split(",");
            String name = input[0];
            Date date = sdf.parse(input[1]);
            Integer attendeesCount = Integer.parseInt(input[2]);
            Event event = new Event(name, date, attendeesCount);
            events.add(event);
        }

        int[] weekCount = new int[5];
        for (Event event : events) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(event.getEventDate());
            int week = cal.get(Calendar.WEEK_OF_MONTH);
            weekCount[week - 1] += event.getAttendeesCount();
        }

        int maxWeek = 0;
        int maxCount = 0;
        for (int i = 0; i < 5; i++) {
            if (weekCount[i] > maxCount) {
                maxWeek = i + 1;
                maxCount = weekCount[i];
            }
        }

        System.out.println("maximum booking week: " + maxWeek);
    }
}
