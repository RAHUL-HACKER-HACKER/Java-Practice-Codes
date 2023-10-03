package EclipseJavaCodes;
//Backtracking algo
import java.util.*;
public class Main56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scr=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=scr.nextInt();
        
        int[][] arr=new int[n][n];
        System.out.println("enter array values:");
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		arr[i][j]=scr.nextInt();
        	}
        }
        System.out.println("array="+Arrays.deepToString(arr));
        int i1=0;
        int j1=0;
        if(i1<n&&j1<n) {
        	while((i1!=(n-1))&&(j1!=(n-1))) {
            	if(arr[i1][j1]==1) {
            		System.out.print("("+i1+","+j1+")->");
            		i1++;
            	}
            	if(arr[i1][j1]==0) {
            		i1--;
            		j1++;
            	}
            	
            }
        }
        else {
        	while((i1!=(n-1))&&(j1!=(n-1))) {
            	if(i1>=n) {
            		i1--;
            		j1++;
            		
            		
            	}
            	if(j1>=n) {
            		j1--;
            		i1++;
            	}
            	
            }
        }
        
        
        
	}

}
