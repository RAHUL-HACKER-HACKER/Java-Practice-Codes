package EclipseJavaCodes;

//import java.util.Scanner;

public class FirstCodes {

	public static void main(String[] args) {
		String str="Rahul";
		System.out.println(str);
		System.out.println(str.charAt(1));
		
		System.out.println(str.length());
		System.out.println(str.indexOf('h'));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.startsWith("Ra"));
		System.out.println(str.endsWith("l"));
		String str1=str.replace("R","mr.r");
		System.out.println(str1);
		String str2=str1.replaceAll("l","l kr");
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2.substring(0,7));
		String str3=str2.concat(" is a best engineer");
		System.out.println(str3);
		
		
		
		
	}

}
