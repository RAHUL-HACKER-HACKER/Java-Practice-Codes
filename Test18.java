package JavaTests;
import java.util.*;
public class Test18 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String str1=sc.next();
	        String str2=sc.next();
	        
	        ArrayList<Character> arr1=new ArrayList<>();
	        ArrayList<Character> arr2=new ArrayList<>();
	        int n=str1.length();
	        int m=str2.length();
	        
	        for(int i=0;i<n;i++){
	            arr1.add(str1.charAt(i));
	        }
	        for(int i=0;i<m;i++){
	            arr2.add(str2.charAt(i));
	        }
	        
	        if(n<=m) {
	        	for(int i=0;i<n;i++) {
	        		if(arr2.contains(arr1.get(i))) {
	        			int index=arr2.indexOf(arr1.get(i));
	        			arr2.remove(index);
	        			
	        		}
	        	}
	        }else {
	        	for(int i=0;i<m;i++) {
	        		if(arr1.contains(arr2.get(i))) {
	        			int index=arr1.indexOf(arr2.get(i));
	        			arr1.remove(index);
	        			
	        		}
	        	}
	        	
	        }
	        int result=arr1.size()+arr2.size();
	        System.out.println(result);
	}

}
