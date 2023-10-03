package javaPrograms;
import java.util.*;

public class RecursionJava {
	//recursion in java(Base case,Recursion work(subproblem or small problem),Self work)
	public static int disp1(int n) {
		//base Case
		if(n==0) return 0;
		
		//Self work
		System.out.print(n+" ");
		
		//Recursion work(subproblem or small problem)
		disp1(n-1);
		return 0;
		
	}
	//opposite recursion
	public static int disp2(int n) {
		if(n==0) return 0;
		
		disp2(n-1);//after complete all function calls print end to start value
		System.out.print(n+" ");
		
		return 0;
	}
	//with no return value
	public static void disp3(int n) {
		if(n==0) return;
		
		disp3(n-1);
		System.out.print(n+" ");
		
		
	}
    //with no return value
	static int x=1;
	public static void mul(int n) {
		if(x==11) return;
		System.out.print(x*n+" ");
		x++;
		mul(n);
	}
	//next
	public static void sum(int i,int n,int sum) {
		if(i==n) {
			sum+=n;
			System.out.println("Sum:"+sum);
			return;
		}
		sum+=i;
		System.out.println("Inner:"+i);
		sum(i+1,n,sum);
		System.out.println("Outer:"+i);
		
	}
	
	//factorial
	public static int factorial(int n) {
		if(n==1 || n==0) {
			return 1;
			
		}
		int fvalue=factorial(n-1);
		int result=n*fvalue;
		
		
		return result;
		
		
	}
	
	public static int exp(int x,int n) {
		if(x==0) return 0;
		if(n==0) return 1;
		int evalue=exp(x,n-1);
		int result=x*evalue;
		System.out.println(result);
		return result;
		
	}
	//square of any number upto 10 term
	public static void squre(int i,int x) {
		if(i>=10) return;
			System.out.print(x+" ");
			
			
			squre(i+1,x*2);
			
			
	}
	//table of any number
	public static void table(int i,int x) {
		if(i>10) return;
			
		System.out.print(x*i+" ");
		i++;
		table(i,x);
				
				
	}
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp1(10);
		
		System.out.println();
		disp2(10);
		
		System.out.println();
		disp3(10);
		
		System.out.println();
		mul(3);
		
		System.out.println();
		sum(1,5,0);
		
		System.out.println();
		int result1=factorial(5);
		System.out.print(result1);
		
		System.out.println();
		int result2=exp(5,3);
		System.out.println(result2);
		
		squre(0,2);
		System.out.println();
		
		table(1,2);
		System.out.println();
		
	}

}
