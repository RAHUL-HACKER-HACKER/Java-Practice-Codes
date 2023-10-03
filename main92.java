package EclipseJavaCodes;
//Write a Java Program to Extract a Single Quote Enclosed String From a Larger
//String using Regex.
import java.util.regex.*;
import java.util.*;;

public class main92 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String text1 =sc.nextLine();
        String text2 =sc.nextLine();
        Pattern p = Pattern.compile("'([^']+)'");
        Matcher m1 = p.matcher(text1);
        Matcher m2 = p.matcher(text2);
        while (m1.find()) {
            System.out.println("First Extracted part: "+m1.group(1));
        }
        while (m2.find()) {
            System.out.println("Second Extracted part: "+m2.group(1));
        }
    }
}
