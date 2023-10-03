package EclipseJavaCodes;
import java.util.*;
import java.io.InputStream;
import java.lang.*;
//swap two nibbles in bytes
//using bitwise operator

public class Main25 {
	static int  swapNipples(int x) {
		
		return((x&0x0f)<<4 | (x& 0xF0)>>4);
		
	}

	public static void main(String[] args) {
		
		int x=100;
	     System.out.println(swapNipples(x));
	     
	     
//next program
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
//		char[] arr2=new char[8];
//		Scanner scr=new Scanner(System.in);
//		System.out.println("enter value:");
//		int n=scr.nextInt();
//		String s=Integer.toBinaryString(n);
//		System.out.println(s);
//		
//		char[] arr=s.toCharArray();
//		System.out.println(arr[0]);
//		if(arr.length!=8) {
//			int i=arr.length;
//			while(i<8) {
//				
//				
//				i++;
//			}		
//				
//		}
//		int j=0;
//		for(int i=(arr.length)-4;i<(arr.length);i++) {
//			
//			System.out.print(arr[i]);
//			arr2[j]=arr[i];
//			j++;
//			
//			
//		}
//		System.out.println("hello");
//		int h=(arr.length)-4;
//        for(int m=0;m<(arr.length)-4;m++) {
//			System.out.print(arr[m]);
//			arr2[h]=arr[m];
//			System.out.println("hello222");
//			System.out.print(arr2[m]);
//			h++;
//			
//		}
//        
//        System.out.println();
//        for(int k=0;k<arr2.length;k++) {
//        	
//        	System.out.print(arr2[0]+"");
//        }
//
//		
        
   

	}

	

}
