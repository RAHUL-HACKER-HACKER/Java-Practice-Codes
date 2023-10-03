package javaPrograms;
import java.util.*;
public class Subsequence {
	public static ArrayList<String> subseq1(String str){
		ArrayList<String> arr1=new ArrayList<>();
		if(str.length()==0) {
			arr1.add("");
			return arr1;
		}
		char c=str.charAt(0);
		String substr=str.substring(1);
		ArrayList<String> arr2=subseq1(substr);
		for(int i=0;i<arr2.size();i++) {
			String value=arr2.get(i);
			arr1.add(value);
			arr1.add(c+value);
		}
		return arr1;
	}
	public static ArrayList<String> subseq2(String str){
		ArrayList<String> arr=new ArrayList<>();
		arr.add("");
		int n=str.length();
		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			int len=arr.size();
			for(int j=0;j<len;j++) {
				String value=arr.get(j);
				arr.add(value+c);
			}
		}
		return arr;
	}
	public static void subseq3(String str,String result){
		if(str.length()==0) {
			System.out.print(result+" ");
			return;
		}
		char c=str.charAt(0);
		String substr=str.substring(1);
		subseq3(substr,result+c);
		subseq3(substr,result);
		
		
		
	}
	public static void subseq4(String str) {
		subseq3(str,"");
	}
	public static ArrayList<Integer> subset(int[] arr){
		ArrayList<Integer> arrlist=new ArrayList<>();
		arrlist.add(0);
		int arrlen=arr.length;
		for(int i=0;i<arrlen;i++) {
			int value=arr[i];
			int arrlistlen=arrlist.size();
			for(int j=0;j<arrlistlen;j++) {
				arrlist.add(value+arrlist.get(j));
			}
		}
		return arrlist;
	}
	

	public static void main(String[] args) {
		// num of subsequence is n^2.
		
		//subsequence type 1
		System.out.println(subseq1("abc"));
		//subsequence type 2
		System.out.println(subseq2("abc"));
		//subsequence type 3
		subseq4("abc");
		
		//sum of subset
		System.out.println();
		int[] arr={2,3,4};
		System.out.println(subset(arr));
	}

}
