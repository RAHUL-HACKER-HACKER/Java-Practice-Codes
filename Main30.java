package EclipseJavaCodes;

import java.util.*;


//maximum equilibrium
public class Main30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=scr.nextInt();
		int[] arr1=new int[n];
		System.out.println("enter array values:");
		for(int i=0;i<n;i++) {
			arr1[i]=scr.nextInt();
			
			
		}
		
		
//		int[] arr1= {-1,2,3,0,3,2,-1}; ans =4

		
		int[] ps=new int[n];
		int[] ss=new int[n];
		
		for(int i=0;i<n;i++) {
			int sum1=0;
			for(int j=0;j<=i;j++) {
				
				sum1=sum1+arr1[j];
			}
			ps[i]=sum1;
		}
		
		
		for(int j=n-1;j>=0;j--) {
			int sum2=0;
			for(int k=n-1;k>=j;k--) {
				
				sum2=sum2+arr1[k];
				
			}
			
			ss[j]=sum2;
		}
		
		
		
		
		
//		for(int k=n-1;k>=0;k--) {
//			
//			ss[k]=ps[(n-1)-k];
//		}
//		
		
		
		
		
		System.out.println(Arrays.toString(ps));
		System.out.println(Arrays.toString(ss));
		
		System.out.println("maximum equilibrium:");
		for(int i=0;i<n;i++) {
			
			
			if(ps[i]==ss[i]) {
				
			
				System.out.print(ps[i]+",");
			}
		}
		
		
		

	}

}
