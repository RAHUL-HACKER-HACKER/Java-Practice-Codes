package EclipseJavaCodes;

import java.util.Scanner;

public class Bear {
	public static int countBitsSetToOne(int number) { 
	      int count = 0; 
	      while (number > 0){ 
	        
	        count = count + (number & 1); 
	        
	        number = number >> 1; 
	      } 
	      return count; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=scr.nextInt();
        System.out.println("enter the size of subarray:");
        int k=scr.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the value of array:");
        for(int i=0;i<n;i++) {
        	arr[i]=scr.nextInt();
        }
        
        for(int i=0;i<n-k;i++) {
        	int result=0;
        	
        	for(int j=i;j<k+i;j++) {
        		int temp=countBitsSetToOne(arr[j]);
        		if(temp<result) {
        			
        			result=temp;
        		}
        	}
        	System.out.println(result+" ");
        	
        	
        }
        
        

	}
}
