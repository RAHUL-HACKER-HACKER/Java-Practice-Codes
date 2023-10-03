package EclipseJavaCodes;
import java.util.*;
import java.lang.*;
//write a program to find the sum of the GP
public class main72 {
	static float sumOfGP(float a,float r,int n) {
		double sum=a*(Math.pow(r,n)-1)/(r-1);
		float result=(float)sum;
		return result;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float a=sc.nextInt();
		float r=sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println((int)sumOfGP(a,r,n));
		

	}

}
