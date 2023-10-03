package EclipseJavaCodes;

import java.text.*;
import java.util.*;

public class main102 {
    public static void main(String[] args) throws Exception {
    	Scanner sc=new Scanner(System.in);
        String dateString =sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = formatter.parse(dateString);
        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss");
        String ndate = format.format(date);
        
        System.out.println(ndate);       
        
    }
}

