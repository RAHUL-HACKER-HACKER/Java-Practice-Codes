package EclipseJavaCodes;
import java.util.*;
//Majority Element
public class Main32 {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=scr.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array values:");
		for(int i=0;i<n;i++) {
			arr[i]=scr.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		
		int number=0;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				
				if(arr[i]==arr[j]) {
					count+=1;
				}
			}
			if(count>n/2) {
				
				number=arr[i];
				break;
			}
			
		}
		if(number!=0) {
			
			System.out.println("number that occurs more than n/2 in array :"+number);
			
		}
		else {
			System.out.println("No Majority Element!");
		}

	}

}
