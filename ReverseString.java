package EclipseJavaCodes;
import java.util.*;
import java.lang.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter any string:");
		String s=scr.nextLine();
		String val="";
		for(int i=s.length()-1;i>=0;i--) {
			
			val+=s.charAt(i);
		}
		if(s.equals(val)) {
			System.out.println(s+" is palindrome.");
		}
		else {
			System.out.println(s+" is not palindrome.");
			
		}
		
		
		
		

	}

}
