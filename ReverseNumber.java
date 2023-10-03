package EclipseJavaCodes;
import java.util.*;
import java.lang.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter value of n:");
		int n=scr.nextInt();
		int m=n;
		
		int num=0;
		while(m>0) {
			
			int r=m%10;
		    num=(num*10)+r;
		    m=m/10;
		}
		if(n==num) {
			
			System.out.println(n+" is a palindrome num.");
		}
		else {
			System.out.println(n+" is not a palindrome num.");
		}

	}

}
