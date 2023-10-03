package EclipseJavaCodes;

import java.util.*;
//laxicographical(Dictionary order)
//Comparator naturalOrder() method in Java
public class Main37 {
	public static String compare(String str1,String str2) {
		String s1=str1;
		String s2=str2;
		String s="";
		
		int n1=s1.length();
		int n2=s2.length();
		int n;
		if(n1<=n2) {
			n=n1;
		}
		else {
			n=n2;
		}
		for(int i=0;i<n;i++) {
			
			if(s1.charAt(i)<s2.charAt(i)) {
				s=s1;
				break;
			}
			else if(s1.charAt(i)>s2.charAt(i)) {
				s=s2;
				break;
			}
			else if(n1<n2) {
				s=s1;
			}
			else if(n1>n2) {
				s=s2;
			}
			else if(n1==n2) {
				s=s1;
			}
				
		}
		
		
		return s;
	}

	public static void main(String[] args) {
		
		String[] arr = { "rohan","Remo","Mixy","Julie","Ronny"};  
	      int n = arr.length;  
	      System.out.println("Before Sorting");  
	      for(int i = 0; i < n; i++) {  
	         System.out.println(arr[i]);  
	      }  
	      for(int i = 0; i < n; ++i) {  
	         for (int j = i; j < n; ++j) {  
	            String res=compare(arr[i],arr[j]);
	            if(arr[j]==res) {
	            	String temp=arr[j];
	            	arr[j]=arr[i];
	            	arr[i]=temp;
	            	
	            	
	            }
	         }  
	      }  
	      System.out.println("\nAfter performing lexicographical order: ");  
	      for(int i = 0; i < n; i++) {  
	         System.out.println(arr[i]);  
	      }  
		
		
		
		
		
	}

}
