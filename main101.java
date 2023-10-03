package EclipseJavaCodes;

import java.text.*;
import java.util.*;

public class main101 {
    public static void main(String[] args) throws Exception {
    	Scanner sc=new Scanner(System.in);
        String dateString =sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = formatter.parse(dateString);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String extractedDate = dateFormat.format(date);
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("H:mm:ss");
        String extractedTime = timeFormat.format(date);
        System.out.println(extractedDate+", "+extractedTime);
        
        
        
        
        
    }
}

