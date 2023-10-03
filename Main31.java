package EclipseJavaCodes;

import java.util.*;
import java.io.*;
//print all leader in array
public class Main31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {16,17,4,3,5,2};
//		
//		Set<Integer> s = new HashSet<Integer>();
//		for(int i=0;i<arr.length;i++) {
//			int result=0;
//			for(int j=i;j<arr.length;j++) {
//				
//				if(result<=arr[j]) {
//					result=arr[j];
//				}
//			}
//			s.add(result);
////			System.out.println(result);
//		
//		}
//		System.out.println(s);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array values:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
//		input ={16,17,4,3,5,2};
        System.out.println("all leader:");
        for(int i=0;i<n;i++){
        	
        	int element=arr[i]; 
            int flag=0;
            for(int j=i;j<n;j++)
            {
                if(element<arr[j])
                    flag=1;
            }
            if(flag==0)
                System.out.print(arr[i]+",");
        }
	}

}
