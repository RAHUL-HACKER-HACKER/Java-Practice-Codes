package JavaTests;
import java.util.*;
public class Test12 {
	static String st="name";
	public void disp() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(400);
		arr.add(500);
		arr.add(100);
		arr.add(300);
		
		int n=Collections.max(arr);
		System.out.println(n);
		
		int m=Collections.min(arr);
		System.out.println(m);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		Collections.reverse(arr);
		System.out.println(arr);
		
		ArrayList<Integer> arr2=new ArrayList<>(arr);
		System.out.println(arr2);
		
		String s="yoda is a jedi";
		String[] strArr=s.split("\\s");
		String str="";
		for(int i=0;i<strArr.length;i++){
			str+=strArr[strArr.length-i-1]+" ";
		}
		System.out.println(str);
		
		System.out.println(arr);
		ArrayList<Integer> slice=new ArrayList<>(arr.subList(1, 3));
		System.out.println(slice);
		
		System.out.println(st);
		
		
		

	}

}
