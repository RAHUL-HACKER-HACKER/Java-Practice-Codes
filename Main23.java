package EclipseJavaCodes;
//Euclidean Algorithm
//GCD(greatest comman divider)
import java.util.*;
import java.lang.*;

public class Main23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter value of n:");
		int n=scr.nextInt();
		System.out.println("enter value of m:");
		int m=scr.nextInt();
		if(m>n) {
			
			int temp=n;
			n=m;
			m=temp;
			
		}
		while(true) {
			if(n%m==0) {
				
				System.out.println("GCD:"+m);
				break;
			}
			else {
				
				int temp2=m;
				m=n%m;
				n=temp2;
			
			}
			
		}

	}

}
