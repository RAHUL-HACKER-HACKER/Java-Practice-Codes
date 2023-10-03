package JavaTests;

import java.util.*;
class Solution1 {
	void mergeIntervals(int[][] intervals) {
	    // add your logic here
		int row=intervals.length;
		int col=intervals[0].length;
		for(int i=0;i<row;i++){
			for(int j=i;j<row;j++){
				if(intervals[i][0]>intervals[j][0]){
					int[] temp=intervals[i];
					intervals[i]=intervals[j];
					intervals[j]=temp;
					
				}
			}
		}
		Stack<int[]> sa=new Stack<>();
		sa.push(intervals[0]);
		for(int i=1;i<row;i++){
			int[] temp=sa.pop();
			sa.push(temp);
			if(temp[1]>intervals[i][0]){
				int[] temp2={temp[0],intervals[i][1]};
				sa.pop();
				sa.push(temp2);
				System.out.println("a");
				
			}else{
				int[] temp3=intervals[i];
				sa.push(temp3);
				//System.out.println(Arrays.toString(temp3));
			}
		}
		
		
		//int[][] result=new int[sa.size()][2];
		int n=sa.size();
		for(int i=0;i<n;i++) {
			int[] ar=sa.pop();
			System.out.println(Arrays.toString(ar));
			//System.out.println("rahul");
		}
		
		return;
		
	}
}

public  class Test5{
	public static void main(String[] args) {
		Solution1 obj=new Solution1();
		int[][] intervals= {{1,1},{2,2},{3,3}};
		obj.mergeIntervals(intervals);
		//System.out.println(Arrays.deepToString(obj.mergeIntervals(intervals)));
		int[][] a= new int[2][3];
		System.out.println("hello");
		System.out.println(Arrays.deepToString(a));
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		
		
		
		
	}
}