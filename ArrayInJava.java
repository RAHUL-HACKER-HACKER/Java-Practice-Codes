package javaPrograms;

import java.util.*;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[10];
		int[] arr2= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//don't copy like this.it carry the reference of arr2 and any changes in arr3  reflect to arr2 
		int[] arr3=arr2;
		arr3[0]=100;
		System.out.println(Arrays.toString(arr2));
		
		//Write way to copy array
		int[] arr4=Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr4));
		
		//clone of array
		int[] originalArray1 = {1, 2, 3, 4, 5};
		int[] copiedArray = originalArray1.clone();
		System.out.println(Arrays.toString(copiedArray));
		
		//length
		int[] originalArray2 = {1, 2, 3, 4, 5};
		int lengthArray = originalArray2.length;
		System.out.println(lengthArray);
		
		//Arrays.equals()
		boolean boolarray=Arrays.equals(originalArray1, originalArray2);
		System.out.println(boolarray);
		
		//toString()
		int[] originalArray3 = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(originalArray3));
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr4));
		
		//equals method
		System.out.println(Arrays.equals(arr1,arr4));
		
		//or use compare
		System.out.println(Arrays.compare(arr1,arr4));
		
		//sort method
		int[] arr5= {2,5,100,300,21};
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		
		//Don't use ,binarySearch  in array it gives wrong ans
		//use for find element.It most be sorted
		int[] arr6= {2,5,100,40,210,90};
		Arrays.sort(arr6);
		System.out.println(Arrays.binarySearch(arr6,90));
		
		//there is no way to reverse the array
		
		//copyOfRange
		System.out.println(Arrays.toString(arr6));
		int[] arr7=Arrays.copyOfRange(arr6, 1, 4);
		System.out.println(Arrays.toString(arr7));
		
		//deepEquals use for two dimension
		int[][] arr8= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr9= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.equals(arr8, arr9));
		System.out.println(Arrays.deepEquals(arr8, arr9));
		
		//deepToString use for two dimension
		System.out.println(Arrays.deepToString(arr9));
		
		 

	      // comparing arr1 and arr2
	      boolean retval = Arrays.equals(arr1, 0, 2, arr2, 0, 2);
	      System.out.println("arr1 and arr2 equal: " + retval);
	      
	      
	      //Arrays.fill()
	      int[] arr10=new int[10];
	      System.out.println(Arrays.toString(arr10));
	      Arrays.fill(arr10, -1);
	      System.out.println(Arrays.toString(arr10));
	      
	      
		 
		
		
		
		
		
		

	}

}
