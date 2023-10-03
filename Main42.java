package EclipseJavaCodes;

//Count all sub-strings with weight of characters atmost K

import java.util.*;
//weightage of string
//public class Main42 {
//
//	public static void main(String[] args) {		
//		String p="acbacbacaa";
//		String q="12300045600078900012345000";
//		int k=2;
//		int n=p.length();
//		String[] arr=new String[1000];
////		Dictionary dict = new Hashtable(); 
////		for(int i=0;i<n;i++) {
////			dict.put(p.charAt(i), q.charAt(i));  
////			
////		}
////		System.out.println(dict);
//		int count=0;
//		for(int i=0;i<n;i++) {
//			
//			for(int j=i+1;j<n;j++) {
//				if(((int)q.charAt(i))*((int)q.charAt(j))>=k) {
//					arr[count]=p.substring(i, j);
//					count+=1;
//					
//					
//				}
//				
////				System.out.print(p.substring(i, j)+",");
//				
//				
//			}
//			
//			
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
//		
//
//	}
//
//}
class Main42{
	
	static int distinctSubString(String P, String Q,
	                      int K, int N)
	{
	  
	    HashSet<String> S = new HashSet<String>();
	  
	    for (int i = 0; i < N; ++i) {
	  
	        int sum = 0;
	        String s = "";
	  
	        for (int j = i; j < N; ++j) {
	        	
	        	int pos = P.charAt(j) - 'a';
	        	  
	            
	            sum += Q.charAt(pos) - '0';
	  
	            
	            s += P.charAt(j);
	  
	            
	            if (sum <= K) {
	                S.add(s);
	            }
	  
	            else {
	                break;
	            }
	        }
	    }
	  
	   
	    return S.size();
	}
	  
	
	public static void main(String[] args)
	{
	    String P = "abcde";
	    String Q = "12345678912345678912345678";
	    int K = 5;
	    int N = P.length();
	    System.out.println("no of sub-strings with weight of characters atmost K:");
	    System.out.print(distinctSubString(P, Q, K, N));
	    
	   
	    
	    
	    
	}
}
