package EclipseJavaCodes;
//Write a regular expression to represent all mobile numbers.
//1. Should contain exactly 10 digits.
//2. The 1st digit should be 7 to 9.
import java.util.regex.*;
import java.util.*;
class main91 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String number =sc.next();
        Pattern p = Pattern.compile("[7-9][0-9]{9}");
        Matcher m = p.matcher(number);
        if(m.matches()) {
        	System.out.println(number+" : Valid Number");
        }else {
        	System.out.println(number+" : Invalid Number");
        }
        
    }
}

