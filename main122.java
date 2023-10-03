package EclipseJavaCodes;
import java.util.*;
public class main122 {
     public static void main(String[] args) {
		int[] arr= {2,5,20,3,4,5,6,20,2,1,10,1};
		int max=arr[0];
		int imax=0;
		
		int min=arr[0];
		int imin=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				imax=i;
			}
			if(min>arr[i]) {
				min=arr[i];
				imin=i;
			}
		}
		System.out.println(max);
		System.out.println(imax);
		System.out.println(min);
		System.out.println(imin);
	}
}
