//package JavaTests;
//
//import java.util.*;
//
//public class Test9 {
//	public static boolean isUpperCase(char c) {
//		for(char i='A';i<='Z';i++) {
//			if(c==i) {
//				return true;
//				
//			}
//		}
//		return false;
//	}
//	public static ArrayList<String> subString(String str){
//		ArrayList<String> arr=new ArrayList<>();
//		String temStr="";
//		for(int i=0;i<str.length();i++) {
//			char c=str.charAt(i);
//			if(temStr.length()>0) {
//				if(isUpperCase(c)) {
//					arr.add(temStr);
//					temStr="";
//				}
//			}
//			temStr+=c;
//		}
//		if(temStr.length()>0) {
//			arr.add(temStr);
//		}
//		
//		return arr;
//	}
//
//	public static void main(String[] args) {
//		String str = "HelloWorldThisIsAnExample";
//		System.out.println(subString(str));
//		
//	}
//
//
package JavaTests;
class Str{
	String s;
	public Str(String st) {
		
		s=st;
	}
	public String toUpper() {
		String st="";
		for(int i=0;i<s.length();i++) {
			if(isUpperCase(s.charAt(i))) {
				
				st+=String.valueOf(s.charAt(i));
			}else {
				st+=String.valueOf(upper(s.charAt(i)));
			}
		}
		return st;
	}
	public String toLower() {
		String st="";
		for(int i=0;i<s.length();i++) {
			if(isUpperCase(s.charAt(i))) {
				
				st+=String.valueOf(lower(s.charAt(i)));
			}else {
				st+=String.valueOf(s.charAt(i));
			}
		}
		return st;
	}
	public boolean isUpperCase(char c) {
		for(char i='A';i<='Z';i++) {
			if(c==i) {
				return true;
				
			}
		}
		return false;
	}
	public char lower(char ch) {
		int n=(int)(ch+('a'-'A'));
		char result=(char)n;
		return result;
	}
	public char upper(char ch) {
		int m=ch-('a'-'A');
		char result=(char)m;
		return result;
	}
	
}

public class Test9{
	public static void main(String[] a) {
		Str obj=new Str("Hello Rahul");
		System.out.println(obj.toLower());
		System.out.println(obj.toUpper());
	
		
		
		
		
		
	}
}
