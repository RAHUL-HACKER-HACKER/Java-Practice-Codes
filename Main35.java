package EclipseJavaCodes;
//lexicographical  
import java.io.*;
import java.util.*;

class Main35 {
 
    
    public static void main(String[] args){
     	String s1="malyalam";
    	
    	char[] arr1 = s1.toCharArray();
    	int n1=s1.length();
    	
    	
    	String s2=s1.substring(0,n1/2);
    	char[] arr2 = s2.toCharArray();
    	int n2=s2.length();
    	
    	
    	
    	String s3=s1.substring((n1/2)+1);
    	char[] arr3 = s3.toCharArray();
    	int n3=s3.length();
    	
    	
    	
    	for(int i=0;i<n2;i++) {
    		for(int j=i;j<n2;j++) {
    			if(arr2[i]>=arr2[j]) {
    				char temp=arr2[i];
    				arr2[i]=arr2[j];
    				arr2[j]=temp;
    				
    			}
    		}
    		
    		
    	}
    	System.out.println(Arrays.toString(arr2));
    	
    	
    	
    	for(int i=0;i<n3;i++) {
    		for(int j=i;j<n3;j++) {
    			if(arr3[i]<=arr3[j]) {
    				char temp=arr3[i];
    				arr3[i]=arr3[j];
    				arr3[j]=temp;
    				
    			}
    		}
    		
    		
    	}
    	System.out.println(Arrays.toString(arr3));
    	
    	String result="";
    	for(int i=0;i<arr2.length;i++) {
    		result=result+arr2[i];
    		
    	}
    	result=result+arr1[(n1/2)];
    	
    	for(int i=0;i<arr3.length;i++) {
    		result=result+arr3[i];
    		
    	}
    	System.out.println(result);
    	
    	
    	
    	
    	
//        Arrays.sort(arr);

//    	System.out.println(Arrays.toString(arr));
//    	int n=s1.length();
//    	for(int i=0;i<n;i++) {
//    		for(int j=i;j<n;j++) {
//    			if(arr1[i]>=arr1[j]) {
//    				char temp=arr1[i];
//    				arr1[i]=arr1[j];
//    				arr1[j]=temp;
//    				
//    			}
//    		}
//    		
//    		
//    	}
//    	System.out.println(Arrays.toString(arr1));
    	
 
        
    }
    
}
