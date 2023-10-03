package EclipseJavaCodes;
import java.util.*;
import java.lang.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter value of n:");
		int n=scr.nextInt();
		boolean temp=true;
		for(int i=2;i<=n;i++) {
			
			if(n%i==0) {
				
				temp=false;
				
			}
		
		}
		if(temp==false) {
			
			
			System.out.println(n+" is a not prime no");
		}
		else {
			System.out.println(n+" is a prime no");
			
		}
			
			
		}
		
		
		

	}


