package EclipseJavaCodes.AdvancedJava;
//write a program to traversing a array in java
import java.util.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements:");
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
		//sorted array
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorted Array elements:");
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}

	}

}
