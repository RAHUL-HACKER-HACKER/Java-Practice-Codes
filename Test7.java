package JavaTests;
import java.util.*;
public class Test7 {
	public static ArrayList<Integer> fibb(int n){
		if(n<=0) {
			return new ArrayList<>();
		}
		if(n==1) {
			return new ArrayList<>(Arrays.asList(1));
		}
		if(n==2) {
			return new ArrayList<>(Arrays.asList(0,1));
		}
		
		ArrayList<Integer> arrlist=new ArrayList<>(fibb(n-1));
		int sum=arrlist.get(arrlist.size()-2)+arrlist.get(arrlist.size()-1);
		arrlist.add(sum);
		return arrlist;
		
	}
	
	public static void main(String[] args) {
		//print the sum of n natural number
		int n=4;
		System.out.println(fibb(n).get(n-1));
		
		
		
	}

}
