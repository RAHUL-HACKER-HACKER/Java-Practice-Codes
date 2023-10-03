package JavaTests;

import java.util.Arrays;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] carr= {'a','A','e','E','i','I','o','O','u','U'};
        System.out.println(Arrays.toString(carr));
        carr[0]=(char)(2+'0');
        System.out.println(Arrays.toString(carr));
        
      //clone of array
      		int[] originalArray1 = {1, 2, 3, 4, 5};
      		int[] copiedArray = originalArray1.clone();
      		System.out.println(Arrays.toString(copiedArray));
      		
      		//length
      		int[] originalArray2 = {1, 2, 3, 4, 5};
      		int lengthArray = originalArray2.length;
      		System.out.println(lengthArray);
      		
      		//equals
      		boolean boolarray=Arrays.equals(copiedArray, originalArray1);
      		System.out.println(boolarray);
      		
      		//toString()
      		Integer[] originalArray3 = {1, 2, 3, 4, 5};
      		System.out.println(Arrays.toString(originalArray3));
      		
      		//string
      		char c='4';
      		String s=""+c;
      		String s2=String.valueOf(100);
      		//int to char
      		int in=4;
      		char c2=(""+8).charAt(0);
      		System.out.println(c2);
      		
      		
      		
      		
        
        
	}

}
