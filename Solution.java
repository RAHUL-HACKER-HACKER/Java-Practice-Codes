package JavaTests;

import java.util.Arrays;

class Solution {
	public static void zero(int[][] matrix,int i,int j){
		for(int k=0;k<matrix[0].length;k++){
			matrix[i][k]=0;
		}
		for(int k=0;k<matrix.length;k++){
			matrix[k][j]=0;
		}
		
		
	}
	static void setRowColumnZeroes(int[][] matrix){
		
	    int[][] arr=matrix.clone();
		int row=arr.length;
		int col=arr[0].length;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(arr[i][j]==0){
					zero(matrix,i,j);
					
				}
			}
			
		}
		System.out.println(Arrays.deepToString(arr));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{1,1,0},{1,1,1},{1,1,1}};
		setRowColumnZeroes(matrix);
		
		
		

	}
}