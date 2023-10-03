package EclipseJavaCodes;
import java.util.*;
public class Main53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter value of string:");
		String s=scr.next();
//		boolean flag1=false;
//		boolean flag2=false;
//		boolean flag3=false;
//		for(int i=0;i<s.length();i++) {
//			
//			if(s.charAt(i)=='a'||s.charAt(i)=='A') {
//				flag1=true;
//				
//			}
//			if(s.charAt(i)=='b'||s.charAt(i)=='B') {
//				flag2=true;
//				
//			}
//			if(s.charAt(i)=='c'||s.charAt(i)=='c') {
//				flag3=true;
//				
//			}
//			
//		}
//		if(flag1&&flag2&&flag3) {
//			System.out.println("a,b and c exist");
//		}
//		else {
//			
//			System.out.println("a,b and c not exist");
//		}
		
		//anothe way to check
		String s2="abc";
		int count=0;
		for(int i=0;i<s2.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(s2.charAt(i)==s.charAt(j)) {
					count+=1;
					break;
					
				}
			}
		}
		if(count==3) {
			System.out.println("a,b and c exist");
		}
		else {
			System.out.println("a,b and c not exist");
		}

	}

}
