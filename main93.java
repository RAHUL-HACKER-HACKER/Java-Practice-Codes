package EclipseJavaCodes;
//Write a program to validate an IP address(lPv4) with the help of Regular Ex
import java.util.regex.*;
import java.util.*;
public class main93 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String ip =sc.nextLine();
	  Pattern p = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
	  Matcher m = p.matcher(ip);
	  if(m.matches()) {
		  System.out.println("IP address "+ip+" is Valid");
	  }else {
		  System.out.println("IP address "+ip+" is Invalid");
	  }
  }
}
