package EclipseJavaCodes;
import java.util.*;
//maneuvering
//Count all possible paths from top left to bottom right of a mXn matrix
public class Main46 {
	static int numberOfPaths(int n, int m)
    {
        
        if (n == 1 || m == 1)
            return 1;
 
        
        return numberOfPaths(n - 1, m) + numberOfPaths(n, m - 1);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter row of array:");
		int n=scr.nextInt();
		System.out.println("enter colomn of array:");
		int m=scr.nextInt();
//		int[][] arr=new int[n][m];
//		System.out.println("enter element of array:");
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				arr[i][j]=scr.nextInt();
//			}
//			
//		}
//		System.out.println(Arrays.deepToString(arr));
		System.out.println(numberOfPaths(n, m));
		
		
		

	}

}
