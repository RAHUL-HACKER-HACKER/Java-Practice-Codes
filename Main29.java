package EclipseJavaCodes;

import java.util.Arrays;
//Maximum product subarray

public class Main29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,-3,-10,0,2,10};
//		int[] arr= {-1,-3,-10,0,60};
		String result="";
		int n=arr.length;
		int mult1=0;
		for(int i=0;i<n;i++) {
//     		int[] arr2=new int[arr.length];
			String result2="";
			int mult2=1;
			for(int j=i;j<n;j++) {
//				arr2[j]=arr[j];
				
				result2=result2+","+arr[j];
				mult2=mult2*arr[j];
			
				if(mult1<mult2) {
					mult1=mult2;
					result=result2;
					
					
					
				}
				
			}
			
			
		}
		System.out.println("sub array={"+result+"}");
		System.out.println("max product:"+mult1);

	}

}
