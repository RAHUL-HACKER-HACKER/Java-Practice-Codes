package EclipseJavaCodes;
//Euclidean Algorithm
//GCD(greatest comman divider)
import java.util.*;
import java.lang.*;

public class Main24 {
	public static int euclid(int x,int y) {
		
		if(x==0 || y==0) {
			
			return 1;
		}
		if(x<y) {
			int temp=x;
			x=y;
			y=temp;
			
		}
		if(x%y==0) {
			
			return y;
			
		}
		else {
			
			
			return euclid(y,x%y);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter value of x:");
		int x=scr.nextInt();
		System.out.println("enter value of y:");
		int y=scr.nextInt();
		System.out.println("GCD="+euclid(x,y));

	}

}
