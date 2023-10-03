package EclipseJavaCodes;
import java.util.*;
import java.lang.*;

public class CRT {
	
	static int findMinX(int num[],int rem[],int k) {
		
		int x=1;
		while(true) {
			
			int j;
			for(j=0;j<k;j++)
				
				if(x%num[j]!=rem[j])
					
					break;
					
				
				if(j==k)
					return x;
				x++;
					
				
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,1,1,0};
		int rem[]= {3,4,5,7};
		int k=num.length;
		int x=findMinX(num,rem,k);
		System.out.println(x);
		System.out.println("hello");

	}

}
