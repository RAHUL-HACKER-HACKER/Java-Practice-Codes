package EclipseJavaCodes;
import java.util.*;
import java.lang.*;
//find the longest of 1's series

public class Main27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter integer value:");
		int n=scr.nextInt();
		String s=Integer.toBinaryString(n);
		System.out.println(s);
		
		char[] arr=s.toCharArray();
		
		int result=0;
		
		for(int i=0;i<arr.length;i++) {
			
			
			char[] arr2=new char[arr.length];
			for(int k=0;k<arr.length;k++) {
				
				
				arr2[k]=arr[k];
			}
			
			
			
			int result2=0;
			if(arr[i]=='0') {
				arr2[i]='1';
				
				for(int t=0;t<arr.length;t++) {
					int count=0;
					for(int j=t;j<arr.length;j++) {
						if(arr2[j]=='1') {
							
							count+=1;
						}
						else {
							break;
						}
						
					}
					if(count>result2) {
						result2=count;
					}
					
				}
				
			
		  }
			
			
		  if(result2>result) {
				result=result2;
			}
		  
		}
		System.out.println();
		System.out.println("longest sequence of 1's series no:"+result);
	
		
		

	}

  }

