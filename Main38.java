package EclipseJavaCodes;
import java.util.*;
//selection sort
public class Main38 {

	public static void main(String[] args) {
		
		  Scanner scr=new Scanner(System.in);
		  System.out.println("enter size of array:");
		  int n=scr.nextInt();
		  
		  int[] arr=new int[n];
		  System.out.println("enter array values:");
	      for(int i=0;i<n;i++) {
	    	  arr[i]=scr.nextInt();
	    	  
	      }
	      
	      
	      
	      
	      System.out.println("Before Sorting");  
	      for(int i = 0; i < n; i++) {  
	         System.out.print(arr[i]+",");  
	      }  
	      for(int i = 0; i < n-1; i++) {  
	         for (int j = i; j < n; j++) {  
	            if (arr[i]>=arr[j]) {  
	               int temp = arr[i];  
	               arr[i] = arr[j];  
	               arr[j] = temp;
	               
	            }  
	         }  
	      }  
	      System.out.println("\nAfter selection sort: ");  
	      for(int i = 0; i < n; i++) {  
	         System.out.print(arr[i]+",");  
	      }  

	}

}
