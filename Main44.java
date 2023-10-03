package EclipseJavaCodes;
//Manacher's Algorithm
//Longest Palindromic Substring
import java.util.*;
import java.lang.*;

public class Main44{
	public static boolean isPalindrome(String s1) {
		
		
		int n=s1.length();
		String s2="";
		
		
		for(int i=n-1;i>=0;i--) {
			
			s2+=s1.charAt(i);
		}
		if(s1.equals(s2)) {
			
			return true;
			
		}
		else {
			return false;
			
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		

		Scanner scr=new Scanner(System.in);
		System.out.println("enter any string:");
        String s=scr.nextLine();
//        System.out.println(isPalindrome(s));
       
        String res="";
        int cno=0;
        
        int n=s.length();
        
        for(int i=0;i<n;i++) {
        	
        	String s2="";
        	int temp=0;
        	for(int j=i;j<n;j++) {
        		s2+=s.charAt(j);
        		temp+=1;
        		if(isPalindrome(s2)==true && temp>=cno) {
        			res=s2;
        			cno=temp;
        		}
        		
        	}
        }
        System.out.println("Longest Palindromic Substring = "+res);
        System.out.println("no of character = "+cno);
        //input =forgeeksskeegfor
        //output= geeksskeeg
		
	
        
        
        
		
	}
    
}
