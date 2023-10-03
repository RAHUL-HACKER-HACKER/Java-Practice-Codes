package javaPrograms;
import java.util.*;
public class BacktrackingJava {
	public static void changeArray(int[] arr,int i,int val) {
		if(i==arr.length) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		arr[i]=val;
		changeArray(arr,i+1,val+1);//recursion
		arr[i]=arr[i]-2;//backtracking
		
		
	}
	
	public static void findSubSet(String str,String ans,int i) {
		if(str.length()==i) {
			if(ans.length()==0) {
				System.out.println("null");
			}else {
				System.out.println(ans);
			}
			return;
		}
		findSubSet(str,ans+str.charAt(i),i+1);
		findSubSet(str,ans,i+1);
		
		
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
	public static int exp2(int a,int n) {
		if(n==0) {
			return 1;		
		}
		n--;
		return a*exp2(a,n);	
		
		
		
	}
	
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
		
		
	}
	public static void MultipleRecursive1(int n) {
		if(n>2) {
			MultipleRecursive1(n-1);
			MultipleRecursive1(n-2);
			MultipleRecursive1(n-3);
			
		}
		System.out.println(n);
	}
	public static void MultipleRecursive2(int n) {
		System.out.println(n);
		if(n>2) {
			MultipleRecursive2(n-1);
			MultipleRecursive2(n-2);
			MultipleRecursive2(n-3);
			
		}
		
	}
	
		
	

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		changeArray(arr,0,1);
		System.out.println(Arrays.toString(arr));
		
		findSubSet("abc","",0);
		
		squre(0,2);
		System.out.println();
		
		table(1,2);
		System.out.println();
	
		System.out.println(exp2(5,3));
		
		
		System.out.println(fib(5));
		
		//MultipleRecursive1
		System.out.println("MultipleRecursive1");
		MultipleRecursive1(5);
		
		//MultipleRecursive2
		System.out.println("MultipleRecursive2");
		MultipleRecursive2(5);
				
		
		

	}

}
