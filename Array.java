package EclipseJavaCodes;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>();
	  
		arr.add("rahul");
		
		arr.add(" best");
		arr.add(" engineer");
		System.out.println(arr);//1st execution
		for(int i=0;i<arr.size();i++) {//2nd execution
			
			System.out.print(arr.get(i));
	
		}
		arr.set(4,"student");
		arr.remove(3);
		System.out.println("\n"+arr);
		

	}

}
