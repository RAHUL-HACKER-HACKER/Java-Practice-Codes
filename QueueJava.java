package javaPrograms;
import java.util.*;
public class QueueJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Integer> queue=new PriorityQueue<>();
        
        Stack<int[]> sa=new Stack<>();
        int[][] arr= {{1,2,3},{3,4,5}};
        int[] arr2=arr[1];
        
        sa.push(new int[]{2,4});
        sa.push(arr[0]);
       
        
        System.out.println(Arrays.toString(sa.peek()));
        System.out.println( sa.size());
        System.out.println(Arrays.toString(arr2));
        
	}

}
